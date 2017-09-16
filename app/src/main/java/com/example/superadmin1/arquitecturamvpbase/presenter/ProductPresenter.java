package com.example.superadmin1.arquitecturamvpbase.presenter;

import com.example.superadmin1.arquitecturamvpbase.model.Product;
import com.example.superadmin1.arquitecturamvpbase.views.activities.IProductView;

import java.util.ArrayList;

/**
 * Created by Superadmin1 on 16/09/2017.
 */

public class ProductPresenter extends BasePresenter<IProductView> {

    private ProductPresenter productoRepository;

    public void validateInternetProduct() {
        if(getValidateInternet().disconected()){
            createThreadProducto();
        }else{
            //Todo: Implementacion alerta
        }
    }

    private void createThreadProducto() {
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
                getProductList();


            }
        });
        thread.start();
    }

    private void getProductList() {
        ArrayList<Product> productoArrayList = productoRepository.getProductList();

    }



}
