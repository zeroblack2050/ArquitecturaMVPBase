package com.example.superadmin1.arquitecturamvpbase.views;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.superadmin1.arquitecturamvpbase.helper.IValidateInternet;
import com.example.superadmin1.arquitecturamvpbase.presenter.BasePresenter;

/**
 * Created by Superadmin1 on 16/09/2017.
 */

public class BaseActivity<T extends BasePresenter>extends AppCompatActivity implements IBaseView{



    private IValidateInternet validateInternet;
    private ProgressDialog progressDialog;
    private T presenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void showProgress(int message) {

        progressDialog.setMessage(getResources().getString(message));
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();;
    }

    public T getPresenter() {
        return presenter;
    }

    public void setValidateInternet(IValidateInternet validateInternet) {
        this.validateInternet = validateInternet;
    }

    public void setProgressDialog(ProgressDialog progressDialog) {
        this.progressDialog = progressDialog;
    }

    public void setPresenter(T presenter) {
        this.presenter = presenter;
    }

    public IValidateInternet getValidateInternet() {
        return validateInternet;
    }

    public ProgressDialog getProgressDialog() {
        return progressDialog;
    }
}
