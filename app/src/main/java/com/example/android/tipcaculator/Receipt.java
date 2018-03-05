package com.example.android.tipcaculator;

import java.io.Serializable;

/**
 * Created by anning on 2018/3/4.
 */

public class Receipt implements Serializable {
    private double Total;
    private double SaleTax;
    private double Tip;

    public Receipt(double Total,double SaleTax, double Tip){
        this.Total=Total;
        this.SaleTax=SaleTax;
        this.Tip=Tip;
    }

    public double getTotal(){return Total;}
    public double getSaleTax(){return Total*SaleTax;}
    public double getTip(){return Total*Tip;}
}

