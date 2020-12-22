package com.shinta.idn.retrofitcrud.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.shinta.idn.retrofitcrud.R;
import com.shinta.idn.retrofitcrud.model.PersonItem;
import com.shinta.idn.retrofitcrud.remote.ProductService;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnAddUser;
    Button btnGetUser;
    ListView rv;
    ProductService productService;
    List<PersonItem> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}