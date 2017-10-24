
import com.repository.RepositoryClass;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.GridLayout;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rpran
 */
public class udoctor_jpanel extends javax.swing.JPanel {

    /**
     * Creates new form jpanel3
     */
    public udoctor_jpanel() {
        initComponents();
        CurrentDate();
    }
    String Day;
    String Itime;
    String Otime;

    public void CurrentDate() {

        Thread clock = new Thread() {
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    String monthh = null;
                    String dayy = null;
                    int month = cal.get(Calendar.MONTH) + 1;
                    int year = cal.get(Calendar.YEAR);
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    if ((month) < 10) {
                        monthh = "0" + month;
                    } else {
                        monthh = "" + month;
                    }
                    if (day < 10) {
                        dayy = "0" + day;
                    } else {
                        dayy = "" + day;
                    }
                    date_txt6.setText(year + "-" + monthh + "-" + dayy);
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    String houur = null;
                    String minuute = null;
                    String seconnd = null;

                    if (hour < 10) {
                        houur = "0" + hour;
                    } else {
                        houur = "" + hour;
                    }
                    if (minute < 10) {
                        minuute = "0" + minute;
                    } else {
                        minuute = "" + minute;
                    }
                    if (second < 10) {
                        seconnd = "0" + second;
                    } else {
                        seconnd = "" + second;
                    }
                    time_txt6.setText(houur + ":" + minuute + ":" + seconnd);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(login_jframe.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        };
        clock.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        panel = new javax.swing.JPanel();
        time_txt6 = new javax.swing.JLabel();
        date_txt6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextContactNo = new javax.swing.JTextField();
        TextSex = new javax.swing.JComboBox();
        TextAddress = new javax.swing.JTextField();
        TextDid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        TextSpeciality = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        TextAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Ihour = new javax.swing.JComboBox();
        ISec = new javax.swing.JComboBox();
        I = new javax.swing.JComboBox();
        Ohour = new javax.swing.JComboBox();
        OSec = new javax.swing.JComboBox();
        O = new javax.swing.JComboBox();
        Error = new javax.swing.JLabel();
        CheckSun = new javax.swing.JCheckBox();
        CheckMon = new javax.swing.JCheckBox();
        CheckTues = new javax.swing.JCheckBox();
        CheckWed = new javax.swing.JCheckBox();
        CheckThurs = new javax.swing.JCheckBox();
        CheckFri = new javax.swing.JCheckBox();
        CheckSat = new javax.swing.JCheckBox();
        main = new javax.swing.JLabel();

        setLayout(null);

        panel.setLayout(null);

        time_txt6.setBackground(new java.awt.Color(255, 255, 255));
        time_txt6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        time_txt6.setForeground(new java.awt.Color(255, 255, 255));
        time_txt6.setText("Time");
        time_txt6.setRequestFocusEnabled(false);
        panel.add(time_txt6);
        time_txt6.setBounds(900, 0, 80, 20);

        date_txt6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        date_txt6.setForeground(new java.awt.Color(255, 255, 255));
        date_txt6.setText("Date");
        panel.add(date_txt6);
        date_txt6.setBounds(900, 20, 80, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE DOCTOR  RECORD");
        panel.add(jLabel2);
        jLabel2.setBounds(410, 10, 200, 30);
        panel.add(TextName);
        TextName.setBounds(170, 140, 290, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");
        panel.add(jLabel3);
        jLabel3.setBounds(100, 137, 50, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address:");
        panel.add(jLabel9);
        jLabel9.setBounds(100, 190, 80, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sex:");
        panel.add(jLabel5);
        jLabel5.setBounds(650, 150, 30, 17);

        TextContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextContactNoActionPerformed(evt);
            }
        });
        panel.add(TextContactNo);
        TextContactNo.setBounds(190, 240, 160, 30);

        TextSex.setMaximumRowCount(3);
        TextSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other", " " }));
        TextSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSexActionPerformed(evt);
            }
        });
        panel.add(TextSex);
        TextSex.setBounds(700, 140, 90, 30);

        TextAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAddressActionPerformed(evt);
            }
        });
        panel.add(TextAddress);
        TextAddress.setBounds(170, 190, 290, 30);
        panel.add(TextDid);
        TextDid.setBounds(110, 50, 70, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Doctor ID:");
        panel.add(jLabel6);
        jLabel6.setBounds(20, 47, 80, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age:");
        panel.add(jLabel4);
        jLabel4.setBounds(490, 140, 40, 30);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(220, 50, 110, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No:");
        panel.add(jLabel8);
        jLabel8.setBounds(100, 240, 90, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Availabe on:");
        panel.add(jLabel10);
        jLabel10.setBounds(100, 330, 100, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Speciality:");
        panel.add(jLabel12);
        jLabel12.setBounds(100, 280, 90, 40);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Out Time:");
        panel.add(jLabel13);
        jLabel13.setBounds(560, 280, 70, 30);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton2.jpg"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panel.add(jButton7);
        jButton7.setBounds(10, 10, 80, 27);

        TextSpeciality.setMaximumRowCount(6);
        TextSpeciality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General Physiology", "Cardiology", "Gastroenterology", "Dermatology", "Neurology", "Pediatrics", " " }));
        panel.add(TextSpeciality);
        TextSpeciality.setBounds(190, 280, 160, 40);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("In Time:");
        panel.add(jLabel14);
        jLabel14.setBounds(570, 240, 60, 30);
        panel.add(TextAge);
        TextAge.setBounds(540, 140, 50, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" :");
        panel.add(jLabel7);
        jLabel7.setBounds(690, 280, 20, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" :");
        panel.add(jLabel11);
        jLabel11.setBounds(760, 280, 20, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" :");
        panel.add(jLabel15);
        jLabel15.setBounds(690, 240, 20, 30);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" :");
        panel.add(jLabel16);
        jLabel16.setBounds(760, 240, 20, 30);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2);
        jButton2.setBounds(750, 360, 110, 30);

        Ihour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        panel.add(Ihour);
        Ihour.setBounds(640, 240, 50, 30);

        ISec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01 ", "02", "03", "04", "05", "06", "07", "08 ", "09 ", "10 ", "11 ", "12 ", "13 ", "14 ", "15 ", "16 ", "17 ", "18 ", "19 ", "20 ", "21 ", "22 ", "23 ", "24 ", "25 ", "26 ", "27 ", "28 ", "29 ", "30 ", "31 ", "32 ", "33 ", "34 ", "35 ", "36 ", "37 ", "38 ", "39 ", "40 ", "41 ", "42 ", "43 ", "44 ", "45 ", "46 ", "47 ", "48 ", "49 ", "50 ", "51 ", "52 ", "53 ", "54 ", "55 ", "56 ", "57 ", "58 ", "59 " }));
        panel.add(ISec);
        ISec.setBounds(710, 240, 50, 30);

        I.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        panel.add(I);
        I.setBounds(780, 240, 56, 30);

        Ohour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        panel.add(Ohour);
        Ohour.setBounds(637, 280, 50, 30);

        OSec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01 ", "02", "03", "04", "05", "06", "07", "08 ", "09 ", "10 ", "11 ", "12 ", "13 ", "14 ", "15 ", "16 ", "17 ", "18 ", "19 ", "20 ", "21 ", "22 ", "23 ", "24 ", "25 ", "26 ", "27 ", "28 ", "29 ", "30 ", "31 ", "32 ", "33 ", "34 ", "35 ", "36 ", "37 ", "38 ", "39 ", "40 ", "41 ", "42 ", "43 ", "44 ", "45 ", "46 ", "47 ", "48 ", "49 ", "50 ", "51 ", "52 ", "53 ", "54 ", "55 ", "56 ", "57 ", "58 ", "59 " }));
        panel.add(OSec);
        OSec.setBounds(710, 280, 50, 30);

        O.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        panel.add(O);
        O.setBounds(780, 280, 56, 30);

        Error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(Error);
        Error.setBounds(150, 440, 580, 40);

        CheckSun.setForeground(new java.awt.Color(255, 255, 255));
        CheckSun.setText("Sunday");
        CheckSun.setOpaque(false);
        CheckSun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSunActionPerformed(evt);
            }
        });
        panel.add(CheckSun);
        CheckSun.setBounds(160, 370, 80, 23);

        CheckMon.setForeground(new java.awt.Color(255, 255, 255));
        CheckMon.setText("Monday");
        CheckMon.setOpaque(false);
        CheckMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckMonActionPerformed(evt);
            }
        });
        panel.add(CheckMon);
        CheckMon.setBounds(240, 370, 70, 23);

        CheckTues.setForeground(new java.awt.Color(255, 255, 255));
        CheckTues.setText("Tuesday");
        CheckTues.setOpaque(false);
        CheckTues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTuesActionPerformed(evt);
            }
        });
        panel.add(CheckTues);
        CheckTues.setBounds(320, 370, 100, 23);

        CheckWed.setForeground(new java.awt.Color(255, 255, 255));
        CheckWed.setText("Wednesday");
        CheckWed.setOpaque(false);
        CheckWed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckWedActionPerformed(evt);
            }
        });
        panel.add(CheckWed);
        CheckWed.setBounds(400, 370, 100, 23);

        CheckThurs.setForeground(new java.awt.Color(255, 255, 255));
        CheckThurs.setText("Thursday");
        CheckThurs.setOpaque(false);
        CheckThurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckThursActionPerformed(evt);
            }
        });
        panel.add(CheckThurs);
        CheckThurs.setBounds(500, 370, 90, 23);

        CheckFri.setForeground(new java.awt.Color(255, 255, 255));
        CheckFri.setText("Friday");
        CheckFri.setOpaque(false);
        CheckFri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckFriActionPerformed(evt);
            }
        });
        panel.add(CheckFri);
        CheckFri.setBounds(590, 370, 80, 23);

        CheckSat.setForeground(new java.awt.Color(255, 255, 255));
        CheckSat.setText("Saturday");
        CheckSat.setOpaque(false);
        CheckSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSatActionPerformed(evt);
            }
        });
        panel.add(CheckSat);
        CheckSat.setBounds(670, 370, 90, 23);

        main.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        main.setForeground(new java.awt.Color(255, 255, 255));
        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        panel.add(main);
        main.setBounds(0, 0, 980, 600);

        add(panel);
        panel.setBounds(0, 0, 980, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void TextSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSexActionPerformed

    private void TextAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.viewDoctor(Integer.parseInt(TextDid.getText()));
        try {
            if (rs.next()) {
                String add1 = rs.getString("DoctorName");
                TextName.setText(add1);
                String add2 = rs.getString("Address");
                TextAddress.setText(add2);
                String add3 = rs.getString("Age");
                TextAge.setText(add3);

                String add9 = rs.getString("Contact");
                TextContactNo.setText(add9);

            } else {
                Error.setText("Sorry Doctor Not Found !!!!");

                TextName.setText("");

                TextAddress.setText("");

                TextAge.setText("");

                TextContactNo.setText("");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextContactNoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new jpanel3());
        panel.updateUI();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.viewDoctor(Integer.parseInt(TextDid.getText()));
        try {
            if (rs.next()) {
                    
            } else {
                Error.setText("Sorry Doctor Not Found !!!!");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        setTime();
        DoctorService Dc = new DoctorService();
        Dc.updateDoctor(this);
        Rc.deleteSchedule(Integer.parseInt(TextDid.getText()));
        setDay();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CheckSunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckSunActionPerformed

    private void CheckMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckMonActionPerformed

    private void CheckTuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckTuesActionPerformed

    private void CheckWedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckWedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckWedActionPerformed

    private void CheckThursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckThursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckThursActionPerformed

    private void CheckFriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckFriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckFriActionPerformed

    private void CheckSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckSatActionPerformed
    public void setDay() {
      RepositoryClass Rc = new RepositoryClass();
        
        if (CheckSun.isSelected()) {
           Rc.insertSchedule(Integer.parseInt(TextDid.getText()),Day = CheckSun.getText(),Itime,Otime);
        }
        if (CheckMon.isSelected()) {
             Rc.insertSchedule(Integer.parseInt(TextDid.getText()),Day = CheckMon.getText(),Itime,Otime);
        }
        if (CheckTues.isSelected()) {
             Rc.insertSchedule(Integer.parseInt(TextDid.getText()),Day = CheckTues.getText(),Itime,Otime);
        }
        if (CheckWed.isSelected()) {
             Rc.insertSchedule(Integer.parseInt(TextDid.getText()),Day = CheckWed.getText(),Itime,Otime);
        }
        if (CheckThurs.isSelected()) {
            Rc.insertSchedule(Integer.parseInt(TextDid.getText()),Day = CheckThurs.getText(),Itime,Otime);
        }
        if (CheckFri.isSelected()) {
            Rc.insertSchedule(Integer.parseInt(TextDid.getText()),Day = CheckFri.getText(),Itime,Otime);
        }
        if (CheckSat.isSelected()) {
            Rc.insertSchedule(Integer.parseInt(TextDid.getText()),Day = CheckSat.getText(),Itime,Otime);
        }
        System.out.println(Day);
    }

    public void setTime() {
        Itime = String.valueOf(Ihour.getSelectedItem()) + ":" + String.valueOf(ISec.getSelectedItem()) + "  " + String.valueOf(I.getSelectedItem());

        Otime = String.valueOf(Ohour.getSelectedItem()) + ":" + String.valueOf(OSec.getSelectedItem()) + "  " + String.valueOf(O.getSelectedItem());
    }

    public String getDay() {
        return Day;
    }

    public String getItime() {
        return Itime;
    }

    public String getOtime() {
        return Otime;
    }

 

    public JTextField getTextAddress() {
        return TextAddress;
    }

    public JTextField getTextAge() {
        return TextAge;
    }

    public JTextField getTextContactNo() {
        return TextContactNo;
    }

    public JTextField getTextDid() {
        return TextDid;
    }

    public JTextField getTextName() {
        return TextName;
    }

    public JComboBox getTextSex() {
        return TextSex;
    }

    public JComboBox getTextSpeciality() {
        return TextSpeciality;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckFri;
    private javax.swing.JCheckBox CheckMon;
    private javax.swing.JCheckBox CheckSat;
    private javax.swing.JCheckBox CheckSun;
    private javax.swing.JCheckBox CheckThurs;
    private javax.swing.JCheckBox CheckTues;
    private javax.swing.JCheckBox CheckWed;
    private javax.swing.JLabel Error;
    private javax.swing.JComboBox I;
    private javax.swing.JComboBox ISec;
    private javax.swing.JComboBox Ihour;
    private javax.swing.JComboBox O;
    private javax.swing.JComboBox OSec;
    private javax.swing.JComboBox Ohour;
    private javax.swing.JTextField TextAddress;
    private javax.swing.JTextField TextAge;
    private javax.swing.JTextField TextContactNo;
    private javax.swing.JTextField TextDid;
    private javax.swing.JTextField TextName;
    private javax.swing.JComboBox TextSex;
    private javax.swing.JComboBox TextSpeciality;
    private javax.swing.JLabel date_txt6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel main;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel time_txt6;
    // End of variables declaration//GEN-END:variables
}