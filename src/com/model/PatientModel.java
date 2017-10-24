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
public class PatientModel {
    String Name;
    String Sex;
    int Age;
    int OpNo;
    String DOA;
    String Allergy;
    String Diagnosis;
    String DOD;
    String TOA;
    String FName;
    String Address;
    int Contact;
    int FContact;
    String DName;

    public String getDName() {
        return DName;
    }

    public void setDName(String DName) {
        this.DName = DName;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getOpNo() {
        return OpNo;
    }

    public void setOpNo(int OpNo) {
        this.OpNo = OpNo;
    }

    public String getDOA() {
        return DOA;
    }

    public void setDOA(String DOA) {
        this.DOA = DOA;
    }

    public String getAllergy() {
        return Allergy;
    }

    public void setAllergy(String Allergy) {
        this.Allergy = Allergy;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getContact() {
        return Contact;
    }

    public void setContact(int Contact) {
        this.Contact = Contact;
    }

    public int getFContact() {
        return FContact;
    }

    public void setFContact(int FContact) {
        this.FContact = FContact;
    }

    public String getTOA() {
        return TOA;
    }

    public void setTOA(String TOA) {
        this.TOA = TOA;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    public String getDOD() {
        return DOD;
    }

    public void setDOD(String DOD) {
        this.DOD = DOD;
    }
  
    
    
}
