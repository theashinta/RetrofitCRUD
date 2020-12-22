package com.shinta.idn.retrofitcrud.remote;

public class APIUtils {

    private APIUtils(){

    }

    public static final String API_URL = "http://192.168.1.7/marketplace/index.php/";

    public static ProductService getProductService(){
        return RetrofitClient.getClient(API_URL).create(ProductService.class);
    }

}
