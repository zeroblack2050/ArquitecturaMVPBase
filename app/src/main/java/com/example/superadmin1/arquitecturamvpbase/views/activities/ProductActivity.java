package com.example.superadmin1.arquitecturamvpbase.views.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.superadmin1.arquitecturamvpbase.R;
import com.example.superadmin1.arquitecturamvpbase.helper.IValidateInternet;
import com.example.superadmin1.arquitecturamvpbase.presenter.ProductPresenter;
import com.example.superadmin1.arquitecturamvpbase.views.BaseActivity;

/**
 * Created by Superadmin1 on 16/09/2017.
 */

public class ProductActivity extends BaseActivity<ProductPresenter> implements IProductView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        setPresenter(new ProductPresenter());
        getPresenter().inject(this, getValidateInternet());
        getPresenter().validateInternetProduct();

    }




}
