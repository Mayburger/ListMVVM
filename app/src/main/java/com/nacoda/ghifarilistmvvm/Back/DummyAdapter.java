package com.nacoda.ghifarilistmvvm.Back;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nacoda.ghifarilistmvvm.R;
import com.nacoda.ghifarilistmvvm.databinding.ListDataBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;

public class DummyAdapter extends GitsAdapter<DummyDao, DummyRowVM, ListDataBinding> {
    public DummyAdapter(List<DummyDao> collection) {
        super(collection);
    }

    @Override
    public DummyRowVM createViewModel(AppCompatActivity activity, ListDataBinding binding, DummyDao item, int position) {
        return new DummyRowVM(activity, binding, item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.list_data;
    }

    @Override
    public void render(ListDataBinding binding, DummyRowVM viewModel, DummyDao item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(DummyDao data, int position) {
        Toast.makeText(mContext, "Hello " + mCollection.get(position), Toast.LENGTH_SHORT).show();
    }
}