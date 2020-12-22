package com.shinta.idn.retrofitcrud.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RespponseProduct {

    @SerializedName("person")
    private List<PersonItem> person;

    @SerializedName("error")
    private boolean error;

    @SerializedName("status")
    private int status;

    public RespponseProduct() {
    }

    public void setPerson(List<PersonItem> person){
        this.person = person;
    }

    public List<PersonItem> getPerson(){
        return person;
    }

    public void setError(boolean error){
        this.error = error;
    }

    public boolean isError(){
        return error;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public int getStatus(){
        return status;
    }

}
