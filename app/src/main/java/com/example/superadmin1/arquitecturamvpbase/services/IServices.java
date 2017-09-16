package com.example.superadmin1.arquitecturamvpbase.services;

import com.example.superadmin1.arquitecturamvpbase.model.Product;

import java.util.ArrayList;

import retrofit.http.GET;

/**
 * Created by Superadmin1 on 16/09/2017.
 */

public interface IServices {

    @GET("/producto")
    ArrayList<Product> getProductList();
}
