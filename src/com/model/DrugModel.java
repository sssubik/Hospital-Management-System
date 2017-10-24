/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Subik
 */
public class DrugModel {
    String DrugName;
    int DaysLeft;
    String ExDate;
    String RegDate;
    int Stock;
    int Cost;

    public String getRegDate() {
        return RegDate;
    }

    public void setRegDate(String RegDate) {
        this.RegDate = RegDate;
    }

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    public int getDaysLeft() {
        return DaysLeft;
    }

    public void setDaysLeft(int DaysLeft) {
        this.DaysLeft = DaysLeft;
    }

    public String getExDate() {
        return ExDate;
    }

    public void setExDate(String ExDate) {
        this.ExDate = ExDate;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }
   
    
    
}
