package com.example.superadmin1.arquitecturamvpbase.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Superadmin1 on 16/09/2017.
 */

public class ValidateInternet implements IValidateInternet {

    private Context context;

    @Override
    public boolean disconected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected() && networkInfo.isAvailable() && networkInfo.isConnected();
    }
}
