package com.shinta.idn.retrofitcrud.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.shinta.idn.retrofitcrud.R;
import com.shinta.idn.retrofitcrud.remote.ProductService;

public class ProductActivity extends AppCompatActivity {

    ProductService productService;
    EditText edtName, edtPrice, edtDesc, edtId;
    Button btnSave, btnDel;
    TextView txtId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
    }
}