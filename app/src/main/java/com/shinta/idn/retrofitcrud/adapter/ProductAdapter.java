package com.shinta.idn.retrofitcrud.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.shinta.idn.retrofitcrud.R;
import com.shinta.idn.retrofitcrud.activity.ProductActivity;
import com.shinta.idn.retrofitcrud.model.PersonItem;

import java.util.List;

public class ProductAdapter {

    private Context context;
    private List<PersonItem> personItem;

    public ProductAdapter(@NonNull Context context,
                          int resource,
                          @NonNull List<PersonItem> objects) {
        super(context, resource, objects);
        this.context = context;
        this.personItem = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.list_item,
                parent, false);

        TextView txtNameProduct = v.findViewById(R.id.txt_product_name);
        TextView txtIdProduct = v.findViewById(R.id.txt_product_id);
        TextView txtPriceProduct = v.findViewById(R.id.txt_product_price);
        TextView txtDescProduct = v.findViewById(R.id.txt_product_desc);

        txtNameProduct.setText(String.valueOf(personItem.get(position).getName()));
        txtIdProduct.setText(String.valueOf(personItem.get(position).getId()));
        txtPriceProduct.setText(String.valueOf(personItem.get(position).getPrice()));
        txtDescProduct.setText(String.valueOf(personItem.get(position).getDesc()));

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProductActivity.class);
                intent.putExtra("id", String.valueOf(personItem.get(position).getId()));
                intent.putExtra("name", personItem.get(position).getName());
                intent.putExtra("price", personItem.get(position).getPrice());
                intent.putExtra("desc", personItem.get(position).getDesc());
                context.startActivity(intent);
            }
        });

        return v;
    }
}


}
