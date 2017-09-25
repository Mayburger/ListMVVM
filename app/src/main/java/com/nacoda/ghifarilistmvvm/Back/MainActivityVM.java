package com.nacoda.ghifarilistmvvm.Back;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;


import java.util.ArrayList;
import java.util.List;
import id.gits.mvvmcore.viewmodel.GitsVM;


public class MainActivityVM extends GitsVM {
    private final List<DummyDao> mList = new ArrayList<>();
    public DummyAdapter bAdapter;
    public LinearLayoutManager bLayoutManager;

    public MainActivityVM(Context context) {
        super(context);

        //create dummy data
        mList.add(new DummyDao("Hello World"));
        mList.add(new DummyDao("Lorem Ipsum"));

        bAdapter = new DummyAdapter(mList);
        bLayoutManager = new LinearLayoutManager(context);
    }
}