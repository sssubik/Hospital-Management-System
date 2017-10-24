/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.repository;

import com.dbutil.javaConnect;
import com.model.AdminModel;
import com.model.AppointmentModel;
import com.model.DoctorModel;
import com.model.DrugModel;
import com.model.PatientModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Subik
 */
public class RepositoryClass {

    Connection conn = javaConnect.ConnecrDb();
    ResultSet rs = null;
    PreparedStatement pst = null;

    public ResultSet InBillDrug(int S, String D, int I) {

        try {

            String sql;

            sql = "select cost from demo.drug where DrugName = '" + D + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                int cost = Integer.parseInt(rs.getString("Cost"));
                sql = "insert into demo.Bill(SN,ItemName,No,Cost) value(?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setInt(1, S);
                pst.setString(2, D);
                pst.setInt(3, I);
                pst.setInt(4, cost);
                pst.execute();
            }

            sql = "update demo.bill set TotalCost = No * Cost";
            pst = conn.prepareStatement(sql);
            pst.execute();
            return rs;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;

        }

    }

    public void DeleteBill() {
        try {
            String sql = "Delete from demo.Bill";

            pst = conn.prepareStatement(sql);
            pst.execute();

        } catch (Exception e) {
        }
    }

    public ResultSet checkDrug(String S) {
        try {
            String sql = "select * from demo.drug  where DrugName = '" + S + "'";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet returnDate() {
        try {
            String sql = "select DrugName,ExDate from demo.drug";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet checkAdmin(AdminModel A) {
        try {
            String sql = "select * from demo.admin where Name = '" + A.getName() + "' and Password = '" + A.getPassword() + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void insertInPatient(PatientModel P) {
        try {

            String sql = "Insert into demo.inpatient (Name,Age,Sex,OpNo,DateOfAdmission,DrugsAllergy,FamilyName,Address,ContactNo,FContactNo,TimeOfAdmission) value(?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, P.getName());
            pst.setInt(2, P.getAge());
            pst.setString(3, P.getSex());
            pst.setInt(4, P.getOpNo());
            pst.setString(5, P.getDOA());
            pst.setString(6, P.getAllergy());
            pst.setString(7, P.getFName());
            pst.setString(8, P.getAddress());
            pst.setInt(9, P.getContact());
            pst.setInt(10, P.getFContact());
            pst.setString(11, P.getTOA());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void insertDoctor(DoctorModel D) {
        try {
            String sql = "Insert into demo.doctor (Did,DoctorName,Address,Age,InTime,OutTime,Speciality,Contact,Sex) value(?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, D.getDid());
            pst.setString(2, D.getDoctorName());
            pst.setString(3, D.getAddress());
            pst.setInt(4, D.getAge());
            // pst.setString(5, D.getDay());
            pst.setString(5, D.getInTime());
            pst.setString(6, D.getOutTime());
            pst.setString(7, D.getSpeciality());
            pst.setInt(8, D.getContact());
            pst.setString(9, D.getSex());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    public ResultSet viewDoctor(int Id) {
        try {
            String sql = "select * from demo.doctor where Did = '" + Id + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet viewDoctorSchedule(int Id) {
        try {
            String sql = "select Day,InTime,OutTime from demo.schedule where Did = '" + Id + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet viewDoctorCombo() {
        try {
            String sql = "select DoctorName from demo.doctor ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet viewDoctorTable() {
        try {
            String sql = "select Did,DoctorName,Speciality from demo.doctor ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet viewAppointmentTable() {
        try {
            String sql = "select AId,DoctorName,DateAppointment,PatientName,Time,Slot from demo.appointment ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet returnDoctorName(int i) {
        try {
            String sql = "select Did,DoctorName from demo.doctor where Did = '" + i + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void insertAppointment(AppointmentModel A) {
        try {
            String sql = "Insert into demo.appointment(DoctorName,Did,DateAppointment,Time,PatientName) value(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, A.getDoctorName());

            pst.setInt(2, A.getDid());
            pst.setString(3, A.getDateAppointment());
            pst.setString(4, A.getTime());
            pst.setString(5, A.getPName());
            pst.execute();

            sql = "update appointment set slot = ((select select_value from (select max(slot) as select_value from appointment where DoctorName = '"+A.getDoctorName()+"' and DateAppointment = '"+A.getDateAppointment()+"') as sub_select_value) + 1)  where PatientName = '"+A.getPName()+"' ";

            pst = conn.prepareStatement(sql);
            pst.execute();
            sql = "select max(slot) as max from demo.appointment where DoctorName='" + A.getDoctorName() + "' and DateAppointment='" + A.getDateAppointment() + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("max");
                JOptionPane.showMessageDialog(null, "Saved" + " Slot No: " + add1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    public void checkIn(int Aid, int Pid, String date) {

        try {
            String sql = "select * from demo.appointment where AId = '" + Aid + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {

                String add1 = rs.getString("DoctorName");

                int add2 = Integer.parseInt(rs.getString("Did"));
                String add3 = rs.getString("PatientName");

                sql = "Insert into demo.checkin (DoctorName,Did,PatientName,Pid,DateOfAppointment) value(?,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, add1);
                pst.setInt(2, add2);
                pst.setString(3, add3);
                pst.setInt(4, Pid);
                pst.setString(5, date);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Saved");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void deleteApp(int Aid) {
        try {
            String sql = "delete from demo.appointment where AId= ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, Aid);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public ResultSet viewInPatient(int i) {
        try {
            String sql = "select * from demo.inpatient where  OpNo = '" + i + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void insertOutPatient(PatientModel P) {
        try {

            String sql = "Insert into demo.outpatient (Name,Age,Sex,OpNo,DateOfDischarge,Diagnosis,DateOfAdmission,FName,Address,Contact,FContact,DoctorName) value(?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, P.getName());
            pst.setInt(2, P.getAge());
            pst.setString(3, P.getSex());
            pst.setInt(4, P.getOpNo());
            pst.setString(5, P.getDOD());
            pst.setString(6, P.getDiagnosis());
            pst.setString(7, P.getDOA());
            pst.setString(8, P.getFName());
            pst.setString(9, P.getAddress());
            pst.setInt(10, P.getContact());
            pst.setInt(11, P.getFContact());
            pst.setString(12, P.getDName());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void insertDrug(DrugModel D) {
        try {

            String sql = "Insert into demo.drug (DrugName,istock,ExDate,Cost,RegDate) value(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, D.getDrugName());
            pst.setInt(2, D.getStock());
            pst.setString(3, D.getExDate());
            pst.setInt(4, D.getCost());
            pst.setString(5, D.getRegDate());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public String returnPid(String S) {
        try {
            String sql = "select OpNo from demo.inpatient where Name = '" + S + "'";
            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();
            if (rs.next()) {
                String opno = rs.getString("OpNo");
                return opno;
            } else {
                return "0";
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return "0";
        }
    }

    public void decStock(String Name, int q) {
        try {

            String sql = "update demo.drug set istock = istock - '" + q + "' where DrugName = '" + Name + "' ";

            pst = conn.prepareStatement(sql);
            pst.execute();
            sql = "update demo.drug set DrugSold = DrugSold + '" + q + "' where DrugName = '" + Name + "' ";
            pst = conn.prepareStatement(sql);
            pst.execute();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    public int retStock(String Name) {
        try {
            String sql = "select istock from demo.drug where DrugName = '" + Name + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("istock");
                return Integer.parseInt(add1);
            } else {
                return 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }

    }

    public void updateDoctor(DoctorModel D) {
        try {

            String sql = "update demo.doctor set Did='" + D.getDid() + "',DoctorName = '" + D.getDoctorName() + "',Age = '" + D.getAge() + "',Address = '" + D.getAddress() + "',Sex = '" + D.getSex() + "',InTime = '" + D.getInTime() + "',OutTime = '" + D.getOutTime() + "',Speciality = '" + D.getSpeciality() + "',Contact = '" + D.getContact() + "' where Did='" + D.getDid() + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void deleteSchedule(int i) {
        try {

            String sql = "delete from demo.schedule where Did = '" + i + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();

            //JOptionPane.showMessageDialog(null, "Saved");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public ResultSet stockAlert() {
        try {
            String sql = "select * from demo.drug";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void updateDrug(DrugModel D) {
        try {

            String sql = "update demo.drug set DrugName='" + D.getDrugName() + "',istock = '" + D.getStock() + "',ExDate= '" + D.getExDate() + "',Cost= '" + D.getCost() + "',RegDate = '" + D.getRegDate() + "' where DrugName= '" + D.getDrugName() + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public ResultSet doctorAppointment(String DName) {
        try {
            String sql = "select doctor.Did,OpNo,inpatient.Name,DateOfAdmission,DateOfAppointment from inpatient,doctor,checkin\n"
                    + "where doctor.DoctorName = '" + DName + "' and Doctor.Did = checkin.Did and checkin.Pid = inpatient.OpNo ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet viewOutPatient(String i) {
        try {
            String sql = "select * from demo.inpatient where  OpNo = '" + i + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public void drugPatient(String O, String DName, int i, String date, int BillId) {
        try {

            String sql = "Insert into demo.drugpatient(OpNo,DrugName,Number,Date,BillId)  value(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            int Op = Integer.parseInt(O);
            pst.setInt(1, Op);
            pst.setString(2, DName);
            pst.setInt(3, i);
            pst.setString(4, date);
            pst.setInt(5, BillId);
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void insertSchedule(int i, String Day, String intime, String outtime) {
        try {

            String sql = "Insert into demo.schedule (Did,Day,InTime,OutTime) value(?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, i);
            pst.setString(2, Day);
            pst.setString(3, intime);
            pst.setString(4, outtime);

            pst.execute();
            //JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public ResultSet returnTopDrug() {
        try {
            String sql = "select  DrugName,cost,ExDate,DrugSold from drug \n"
                    + "order by DrugSold desc\n"
                    + "limit 15";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet returnFromToDrug(String FromDate, String ToDate) {
        try {
            String sql = "SELECT distinct (BillStore.BillId),Name as PatientName,drugpatient.OpNo,Total,drugpatient.Date  from drugpatient,inpatient,billstore\n"
                    + "WHERE Date >= '" + FromDate + "'"
                    + "AND Date <= '" + ToDate + "'"
                    + "ANd drugpatient.OpNo = inpatient.OpNo\n"
                    + "AND drugpatient.BillId = BillStore.BillId\n"
                    + "group by BillId";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet InBillStore(int i) {
        try {

            String sql = "Insert into demo.billStore(Total) value(?)";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, i);

            pst.execute();
            sql = "select max(BillId) as BillId from demo.billstore";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
            //JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public ResultSet returnInPatientOpNo() {
        try {
            String sql = "select max(OpNo) as Opno from inpatient";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public ResultSet returnDiseases()
    {
        try {
            String sql = "select DiseaseName from diseases";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public ResultSet returnInpatientRecord()
    {
         try {
            String sql = "select Name,Age,DateOfAdmission,Sex,FContactNo,DrugsAllergy from inpatient";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public ResultSet viewInPatientFromTo(String FromDate,String ToDate)
    {
        try {
          String sql = "select Name,Age,DateOfAdmission,Sex,FContactNo,DrugsAllergy from inpatient\n"
                    + "WHERE DateOfAdmission >= '" + FromDate + "'"
                    + "AND DateOfAdmission <= '" + ToDate + "'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public ResultSet returnMaxDid()
    {
         try {
            String sql = "select max(Did) as Did from doctor";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public void insertDiseasePatient(int opno,String Name)
    {
        try{
            String sql = "Insert into demo.patientdisease (Opno,DiseaseName) value(?,?)";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, opno);
            pst.setString(2, Name);
          

            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
}
