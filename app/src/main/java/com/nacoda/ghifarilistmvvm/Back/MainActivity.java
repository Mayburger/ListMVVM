package com.nacoda.ghifarilistmvvm.Back;

import com.nacoda.ghifarilistmvvm.R;
import com.nacoda.ghifarilistmvvm.databinding.MainActivityBinding;

import id.gits.mvvmcore.activity.GitsActivity;


public class MainActivity extends GitsActivity<MainActivityVM, MainActivityBinding> {

    @Override
    protected int getToolbarId() {
        return R.id.toolbar;
    }

    @Override
    public int getResLayout() {
        return R.layout.main_activity;
    }

    @Override
    public MainActivityVM getViewModel() {
        return new MainActivityVM(this);
    }

    @Override
    public void bindViewModel(MainActivityBinding binding, MainActivityVM viewModel) {
        binding.setVm(viewModel);
    }
}