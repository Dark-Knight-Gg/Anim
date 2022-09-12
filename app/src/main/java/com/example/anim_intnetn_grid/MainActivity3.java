package com.example.anim_intnetn_grid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    GridView m3_GridViewFood;
    ImageView m3_imgBack;
    ArrayList<Food> listFood = new ArrayList<Food>();
    FoodAdapter adapter;
    private void AnhXa(){
        m3_GridViewFood=(GridView) findViewById(R.id.m3_GridViewFood);
        m3_imgBack=(ImageView) findViewById(R.id.m3_imgBack);
        listFood.add(new Food("Bánh mì bate","20.000VND",R.drawable.banhmi));
        listFood.add(new Food("Đùi gà KFC","50.000VND",R.drawable.duigatrien));
        listFood.add(new Food("Hamberger","35.000VND",R.drawable.humberger));
        listFood.add(new Food("Trứng gà ốp la","8.000VND",R.drawable.trungran));
        listFood.add(new Food("Xúc xích rán","15.000VND",R.drawable.xucxich));
        listFood.add(new Food("Bánh mì bate","20.000VND",R.drawable.banhmi));
        listFood.add(new Food("Đùi gà KFC","50.000VND",R.drawable.duigatrien));
        listFood.add(new Food("Hamberger","35.000VND",R.drawable.humberger));
        listFood.add(new Food("Trứng gà ốp la","8.000VND",R.drawable.trungran));
        listFood.add(new Food("Xúc xích rán","15.000VND",R.drawable.xucxich));
        listFood.add(new Food("Bánh mì bate","20.000VND",R.drawable.banhmi));
        listFood.add(new Food("Đùi gà KFC","50.000VND",R.drawable.duigatrien));
        listFood.add(new Food("Hamberger","35.000VND",R.drawable.humberger));
        listFood.add(new Food("Trứng gà ốp la","8.000VND",R.drawable.trungran));
        listFood.add(new Food("Xúc xích rán","15.000VND",R.drawable.xucxich));
        listFood.add(new Food("Bánh mì bate","20.000VND",R.drawable.banhmi));
        listFood.add(new Food("Đùi gà KFC","50.000VND",R.drawable.duigatrien));
        listFood.add(new Food("Hamberger","35.000VND",R.drawable.humberger));
        listFood.add(new Food("Trứng gà ốp la","8.000VND",R.drawable.trungran));
        listFood.add(new Food("Xúc xích rán","15.000VND",R.drawable.xucxich));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        AnhXa();
        adapter= new FoodAdapter(MainActivity3.this,R.layout.dong_demo,listFood);
        m3_GridViewFood.setAdapter(adapter);
        m3_imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_exits,R.anim.anim_enter);
            }
        });
        m3_GridViewFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animation anim1 = AnimationUtils.loadAnimation(MainActivity3.this,R.anim.anim_iteams);
                view.startAnimation(anim1);
            }
        });
    }
}