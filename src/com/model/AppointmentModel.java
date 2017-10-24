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
public class AppointmentModel {
    String DoctorName;
    int Did;
    String DateAppointment;
    String Time;
    String PName;
    
    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public int getDid() {
        return Did;
    }

    public void setDid(int Did) {
        this.Did = Did;
    }

    public String getDateAppointment() {
        return DateAppointment;
    }

    public void setDateAppointment(String DateAppointment) {
        this.DateAppointment = DateAppointment;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }
    
    
}
