package com.moyennek.molhed;


import java.util.ArrayList;

public class Word{

    private String matiereName;

    private Double nott1 = 0d;
    private Double nott2 = 0d;
    private Double nott3 = 0d;

    private Double cofii1 = 0d;
    private Double cofii2 = 0d;
    private Double cofii3 = 0d;

    private Double nott1s = 0d;
    private Double nott2s = 0d;
    private Double nott3s = 0d;

    private Double cofii1s = 0d;
    private Double cofii2s = 0d;
    private Double cofii3s = 0d;


    private ArrayList<Double> noot = new ArrayList<>();

    private ArrayList<Double> noots = new ArrayList<>();

    private ArrayList<Double> cofis = new ArrayList<>();

    private ArrayList<Double> cofi = new ArrayList<>();


    public Double getMoyenne(){

        noot.add(nott1);
        noot.add(nott2);
        noot.add(nott3);

        noots.add(nott1s);
        noots.add(nott2s);
        noots.add(nott3s);

        cofi.add(cofii1);
        cofi.add(cofii2);
        cofi.add(cofii3);

        cofis.add(cofii1s);
        cofis.add(cofii2s);
        cofis.add(cofii3s);


        Double khraa = 0d;
        Double cof = 0d;
        for (int i = 0; i < noot.size(); i++){
            khraa += (noot.get(i) * cofi.get(i));
            if (noot.get(i) > 0 && cofi.get(i) > 0){
                cof += cofi.get(i);
            }
            continue;
        }

        Double khraas = 0d;
        Double cofs = 0d;
        for (int i = 0; i < noots.size(); i++){
            khraas += (noots.get(i) * cofis.get(i));
            if (noots.get(i) > 0 && cofis.get(i) > 0){
                cofs += cofis.get(i);
            }
            continue;

        }


        Double con = 0d;
        if (khraa > 0 && cof > 0){
            con = khraa / cof;
        }

        Double syn = 0d;
        if (khraas > 0 && cofs > 0){
            syn = khraas / cofs;
        }

        Double re = 0d;
        if (con > 0 && syn > 0){
            re += (con + (syn *  2)) / 3;

        } else if (con > 0 && syn <= 0){
            re = con;
        } else if (con <= 0 && syn > 0){
            re = syn;
        }

        return re;
    }




    public Word(String matiereName, String hintCofi){
        this.matiereName = matiereName;
        String hintCofi1 = hintCofi;
    }

    public String getMatiereName(){
        return matiereName;
    }

    public void setCofii3(Double cofii3) {
        this.cofii3 = cofii3;
    }

    public void setNott1(Double nott1) {
        this.nott1 = nott1;
    }

    public void setCofii1(Double cofii1) {
        this.cofii1 = cofii1;
    }

    public void setNott2(Double nott2) {
        this.nott2 = nott2 ;
    }

    public void setCofii2(Double cofii2) {
        this.cofii2 = cofii2;
    }

    public void setNott3(Double nott3) {
        this.nott3 = nott3;
    }

    public Double getNott2() {
        return nott2;
    }

    public Double getNott1() {
        return nott1;
    }

    public Double getNott3() {
        return nott3;
    }

    public Double getCofii3() {
        return cofii3;
    }

    public Double getCofii2() {
        return cofii2;
    }

    public Double getCofii1() {
        return cofii1;
    }


    public Double getCofii1s() {
        return cofii1s;
    }

    public Double getCofii2s() {
        return cofii2s;
    }

    public Double getCofii3s() {
        return cofii3s;
    }

    public Double getNott1s() {
        return nott1s;
    }

    public Double getNott2s() {
        return nott2s;
    }

    public Double getNott3s() {
        return nott3s;
    }


    public void setCofii1s(Double cofii1s) {
        this.cofii1s = cofii1s;
    }

    public void setCofii2s(Double cofii2s) {
        this.cofii2s = cofii2s;
    }

    public void setCofii3s(Double cofii3s) {
        this.cofii3s = cofii3s;
    }

    public void setNott1s(Double nott1s) {
        this.nott1s = nott1s;
    }

    public void setNott2s(Double nott2s) {
        this.nott2s = nott2s;
    }

    public void setNott3s(Double nott3s) {
        this.nott3s = nott3s;
    }

}