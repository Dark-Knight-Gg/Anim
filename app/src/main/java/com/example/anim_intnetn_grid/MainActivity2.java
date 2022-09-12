package com.example.anim_intnetn_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView m2_txtMenu;
    ImageView m2_imgBack;
    Button m2_btnXemMenu;
    private void AnhXa(){
        m2_txtMenu=(TextView) findViewById(R.id.m2_txtMenu);
        m2_btnXemMenu=(Button) findViewById(R.id.m2_btnXemMenu);
        m2_imgBack=(ImageView) findViewById(R.id.m2_imgBack);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AnhXa();
        m2_imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_exits,R.anim.anim_enter);
            }
        });
        m2_btnXemMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_exits,R.anim.anim_enter);
            }
        });
    }
}