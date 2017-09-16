package com.example.superadmin1.arquitecturamvpbase.views.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.provider.SyncStateContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.superadmin1.arquitecturamvpbase.R;

/**
 * Created by Superadmin1 on 16/09/2017.
 */

public class DetailActivity extends AppCompatActivity{

    private TextView nameValue;
    private TextView descriptonValue;
    private TextView quantityValue;
    private TextView precieValue;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_detal);
        loadView();
    }

    private void loadView() {
        nameValue = (TextView) findViewById(R.id.product_detal_name_value);
        descriptonValue = (TextView) findViewById(R.id.product_detal_description_value);
        quantityValue = (TextView) findViewById(R.id.product_detal_quantity_value);
        precieValue = (TextView) findViewById(R.id.product_detal_price_value);

    }


}
