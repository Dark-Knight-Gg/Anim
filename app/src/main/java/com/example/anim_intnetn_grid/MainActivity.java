package com.example.anim_intnetn_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button m1_btnLogin;
    EditText m1_etxtUsername,m1_etxtPassword;
    TextView m1_txtLogin;
    CheckBox m1_CheckBoxLogin;
    SharedPreferences sharedPreferences;
    private void AnhXa(){
        m1_btnLogin=(Button) findViewById(R.id.m1_btnLogin);
        m1_txtLogin=(TextView) findViewById(R.id.m1_txtLogin);
        m1_CheckBoxLogin=(CheckBox) findViewById(R.id.m1_CheckBoxLogin);
        m1_etxtUsername=(EditText) findViewById(R.id.m1_etxtUsername);
        m1_etxtPassword=(EditText) findViewById(R.id.m1_etxtPassword);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        sharedPreferences = getSharedPreferences("dataLogin",MODE_PRIVATE);
        //lấy giá trị từ sharedPrefences
        m1_etxtUsername.setText(sharedPreferences.getString("Username",""));
        m1_etxtPassword.setText(sharedPreferences.getString("Password",""));
        m1_CheckBoxLogin.setChecked(sharedPreferences.getBoolean("Checked",false));
        m1_btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = m1_etxtUsername.getText().toString();
                String password = m1_etxtPassword.getText().toString();
                if(username.equals("Giang2001")&&password.equals("26042001")){
                    if(m1_CheckBoxLogin.isChecked()){
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("Username",username);
                        editor.putString("Password",password);
                        editor.putBoolean("Checked",true);
                        editor.commit();
                    }else{
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.remove("Username");
                        editor.remove("Password");
                        editor.remove("Checked");
                        editor.commit();
                    }
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.anim_exits,R.anim.anim_enter);
                }else{
                    Toast.makeText(MainActivity.this, "Sai tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}