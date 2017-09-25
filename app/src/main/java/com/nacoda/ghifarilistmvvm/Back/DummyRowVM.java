package com.nacoda.ghifarilistmvvm.Back;

import android.content.Context;
import android.databinding.ObservableField;

import com.nacoda.ghifarilistmvvm.databinding.ListDataBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;


/**
 * Created by ibun on 31/03/16.
 */
public class DummyRowVM extends GitsRowVM<DummyDao, ListDataBinding> {
    public ObservableField<String> bTextDummy = new ObservableField<>();

    public DummyRowVM(Context context, ListDataBinding binding, DummyDao data) {
        super(context, binding, data);
        bTextDummy.set(data.getText());
    }
}
