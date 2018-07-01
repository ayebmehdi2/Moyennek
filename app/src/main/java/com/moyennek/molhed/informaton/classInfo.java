package com.moyennek.molhed.informaton;


public class classInfo {

    private String mtr;
    private  String cofition;
    private String her;
    private int color;

    classInfo(String a, String b, String c){
        this.mtr = a;
        this.cofition = b;
        this.her = c;

    }

    classInfo(String a, String b, String c, int d){
        this.mtr = a;
        this.cofition = b;
        this.her = c;
        this.color = d;
    }

    public String getMtr() {
        return mtr;
    }

    public String getCofi() {
        return cofition;
    }

    public String getHer() {
        return her;
    }

    public int getColorr() {
        return color;
    }

}
