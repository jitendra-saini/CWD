package com.example.cw;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Chat extends Fragment {

    RecyclerView mrecyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view=inflater.inflate(R.layout.fragment_chat, container, false);
        ArrayList<MyDataSet> arrayList =new ArrayList<MyDataSet>();
        arrayList.add(new MyDataSet("mahesh","today","2",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("Raju","today","1",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("Sunita","2 days ago","3",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("mangal","today","6",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("jamuna","today","0",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("mangesh","today","2",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("mahesh","today","1",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("mahesh","today","1",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("mahesh","today","1",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("mahesh","today","0",R.drawable.ic_launcher_background));
        arrayList.add(new MyDataSet("mahesh","today","0",R.drawable.ic_launcher_background));
        mrecyclerView=view.findViewById(R.id.chat_recycler_view);

        //using a linear layout manager
        layoutManager=new LinearLayoutManager(view.getContext());
        mrecyclerView.setLayoutManager(layoutManager);

        //specify a adapter
        adapter=new MyRecyclerViewAdapter(getContext(),arrayList);
        mrecyclerView.setAdapter(adapter);






        return view;
    }
}
