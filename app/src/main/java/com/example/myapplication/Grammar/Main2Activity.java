package com.example.myapplication.Grammar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    private Context mcontext;
    ArrayList<String> titleArrayList;
    private RecyclerView mrecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mcontext = Main2Activity.this;
        titleArrayList = new ArrayList<String>();
        titleArrayList.add(Constants.PRESENT_SIMPLE);
        titleArrayList.add(Constants.PRESENT_CONTINUOUS_TENSE);
        titleArrayList.add(Constants.PRESENT_PERFECT_TENSE);
        titleArrayList.add(Constants.PRESENT_PERFECT_CONTINUOUS_TENSE);
        titleArrayList.add(Constants.PAST_SIMPLE_TENSE);
        titleArrayList.add(Constants.PAST_CONTINUOUS_TENSE);
        titleArrayList.add(Constants.PAST_PERFECT_TENSE);
        titleArrayList.add(Constants.PAST_PERFECT_CONTINUOUS_TENSE);
        titleArrayList.add(Constants.SIMPLE_FUTURE_TENSE);
        titleArrayList.add(Constants.FUTURE_CONTINUOUS_TENSE);
        titleArrayList.add(Constants.FUTURE_PERFECT_TENSE);
        titleArrayList.add(Constants.FUTURE_PERFECT_CONTINUOUS_TENSE);


        mrecyclerView = findViewById(R.id.title_layout_recycleview);
        mrecyclerView.setHasFixedSize(true);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        TitleAdapter adapter = new TitleAdapter(mcontext, titleArrayList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent desIntent = new Intent(mcontext, DescriptionActivity.class);
                desIntent.putExtra("titles", titleArrayList.get(position));
                startActivity(desIntent);
            }
        });
        mrecyclerView.setAdapter(adapter);
    }
}
