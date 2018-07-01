package com.moyennek.molhed;


public class Data {

    private Class clas;

    private String Ann;

    private int img;

    Data(String a, Class b, int Img){

        this.Ann = a;
        this.img = Img;
        this.clas = b;

    }

    public String getAnn() {
        return Ann;
    }

    public Class getClas() {
        return clas;
    }

    public int getImg() {
        return img;
    }
}
