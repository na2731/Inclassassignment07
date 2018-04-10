package com.example.android.tipcaculator;

import java.io.Serializable;

/**
 * Created by anning on 2018/3/4.
 */

public class Receipt implements Serializable {
    private double Total;
    private double SaleTax;
    private double Tip;
    private boolean Pack;
    private String name;

    public void setTotal(double total) {
        Total = total;
    }

    public void setSaleTax(double saleTax) {
        SaleTax = saleTax;
    }

    public void setTip(double tip) {
        Tip = tip;
    }

    public void setPack(boolean pack) {
        Pack = pack;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Receipt(String name, double Total,double SaleTax, double Tip, boolean Pack){
        this.Total=Total;
        this.SaleTax=SaleTax;
        this.Tip=Tip;
        this.Pack=Pack;
        this.name=name;
    }


    public boolean isPack() {
        return Pack;
    }

    public String getName() {
        return name;
    }

    public double getTotal(){return Total;}
    public double getSaleTax(){return Total*SaleTax;}
    public double getTip(){return Total*Tip;}
}

