package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.Grammar.Constants;
import com.example.myapplication.Grammar.CustomItemClickListener;
import com.example.myapplication.Grammar.DescriptionActivity;
import com.example.myapplication.Grammar.Main2Activity;
import com.example.myapplication.Grammar.TitleAdapter;
import com.example.myapplication.dictonary.DictonaryActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void main2(View v){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
    public void main3(View v){
        Intent intent = new Intent(MainActivity.this, DictonaryActivity.class);
        startActivity(intent);
    }
}
