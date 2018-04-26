package com.example.speed.firebaseimagens.model;

public class Upload {
    private String nmNome;
    private String mImageUrl;

    public Upload(){
        //vazio;
    }
    public Upload(String nNome, String mImageUrl){
        if(nNome.trim().equals("")){
            nNome = "No nome";
        }
        this.nmNome =  nNome;
        this.mImageUrl = mImageUrl;
    }
    public String getNmNome(){
        return nmNome;
    }
    public void setNmNome(String nmNome){
        this.nmNome = nmNome;
    }

    public String getmImageUrl(){
        return getmImageUrl();
    }
    public void setmImageUrl(String mImageUrl){
        this.mImageUrl = mImageUrl;
    }
}
