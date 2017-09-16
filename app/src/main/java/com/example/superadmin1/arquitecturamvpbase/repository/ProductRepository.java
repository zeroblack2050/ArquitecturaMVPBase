package com.example.superadmin1.arquitecturamvpbase.repository;

import com.example.superadmin1.arquitecturamvpbase.helper.ServicesFactory;
import com.example.superadmin1.arquitecturamvpbase.model.Product;
import com.example.superadmin1.arquitecturamvpbase.services.IServices;

import java.util.ArrayList;

import retrofit.RetrofitError;

/**
 * Created by Superadmin1 on 16/09/2017.
 */

public class ProductRepository {

    private IServices iservices;

    public ProductRepository(){
        ServicesFactory servicesFactory = new ServicesFactory();
        iservices = (IServices) servicesFactory.getInstance(IServices.class);
    }

    public ArrayList<Product> getProductList(){
        try{
            ArrayList<Product> products = iservices.getProductList();
            return products;
        }catch (RetrofitError retrofitError){
            throw retrofitError;
        }
    }

}
