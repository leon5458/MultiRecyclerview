package com.hly.multirecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    List<MultipleItem> list ;
    MultipleItemQuickAdapter multipleItemQuickAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new MultipleItem(MultipleItem.TEXT, 1));
            list.add(new MultipleItem(MultipleItem.IMG, 2));
            list.add(new MultipleItem(MultipleItem.IMG_TEXT, 3));
        }
        recyclerView = findViewById(R.id.main_recy);
        multipleItemQuickAdapter = new MultipleItemQuickAdapter(this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(multipleItemQuickAdapter);

        View HeadView = LayoutInflater.from(this).inflate(R.layout.view_header_item, null, false);
        multipleItemQuickAdapter.addHeaderView(HeadView);


        View FootView = LayoutInflater.from(this).inflate(R.layout.view_foot_item, null, false);
        multipleItemQuickAdapter.addFooterView(FootView);



    }
}
