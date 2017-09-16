package com.example.superadmin1.arquitecturamvpbase.presenter;

import com.example.superadmin1.arquitecturamvpbase.helper.IValidateInternet;
import com.example.superadmin1.arquitecturamvpbase.views.IBaseView;

/**
 * Created by Superadmin1 on 16/09/2017.
 */

public class BasePresenter <T extends IBaseView> {


    private T view;
    private IValidateInternet validateInternet;

    public void inject(T view, IValidateInternet validateInternet){
        this.view = view;
        this.validateInternet = validateInternet;
    }

    public T getView() {
        return view;
    }

    public IValidateInternet getValidateInternet() {
        return validateInternet;
    }


}
