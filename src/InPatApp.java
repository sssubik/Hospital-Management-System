import com.toedter.calendar.JDateChooser;
import java.awt.GridLayout;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rpran
 */
public class InPatApp extends javax.swing.JPanel {
    int pid;

    /**
     * Creates new form jpanel3
     */
    public InPatApp() {
        initComponents();
        CurrentDate();
    }
public void CurrentDate(){
         
        Thread clock = new Thread(){
        public void run(){
        for(;;){
        Calendar cal = new GregorianCalendar();
        String monthh = null;
        String dayy = null;
        int month =cal.get(Calendar.MONTH)+1;
        int year =cal.get(Calendar.YEAR);
        int day =cal.get(Calendar.DAY_OF_MONTH);
          if ((month) < 10)
        {
            monthh= "0" + month;
        }
          else 
          {
              monthh=""+month;
          }
          if (day < 10)
        {
            dayy= "0" + day;
        }
          else
              
          {
              dayy=""+day;
          }
        date_txt6.setText(year+"-"+monthh+"-"+dayy);
        TextDateOfAdmission.setText(year+"-"+monthh+"-"+dayy);
        int second =cal.get(Calendar.SECOND);
        int minute =cal.get(Calendar.MINUTE);
        int hour =cal.get(Calendar.HOUR);
        String houur = null;
        String minuute = null;
        String seconnd = null;
        
        if (hour < 10)
        {
            houur= "0" + hour;
        }
        else
        {
            houur=""+hour;
        }
         if (minute < 10)
        {
            minuute= "0" + minute;
        }
         else
         {
             minuute=""+minute;
         }
          if (second < 10)
        {
            seconnd= "0" + second;
        }
         else
          {
              seconnd =""+second;
          }
        time_txt6.setText(houur+":"+minuute+":"+seconnd);
        TextTimeOfAdmission.setText(houur+":"+minuute+":"+seconnd);
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
    public void addPatientName(String S)
    {
        TextName.setText(S);
    }
    public void setOpno(String S)
    {
        int i = Integer.parseInt(S);
        i=i+1;
        String Opno = Integer.toString(i);
        TextOpno.setText(Opno);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        time_txt6 = new javax.swing.JLabel();
        date_txt6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        TextAge = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextAllergy = new javax.swing.JTextField();
        TextContactNo = new javax.swing.JTextField();
        TextSex = new javax.swing.JComboBox();
        TextAddress = new javax.swing.JTextField();
        TextOpno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextTimeOfAdmission = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TextFName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TextFContactNo = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        TextDateOfAdmission = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel2.setText("IN-PATIENT CASE RECORD");
        panel.add(jLabel2);
        jLabel2.setBounds(390, 10, 190, 30);
        panel.add(TextName);
        TextName.setBounds(150, 140, 290, 30);

        TextAge.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", " " }));
        TextAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAgeActionPerformed(evt);
            }
        });
        panel.add(TextAge);
        TextAge.setBounds(510, 140, 80, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");
        panel.add(jLabel3);
        jLabel3.setBounds(100, 137, 50, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time of Admission:");
        panel.add(jLabel7);
        jLabel7.setBounds(460, 200, 140, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address:");
        panel.add(jLabel9);
        jLabel9.setBounds(460, 250, 70, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sex:");
        panel.add(jLabel5);
        jLabel5.setBounds(620, 140, 30, 30);
        panel.add(TextAllergy);
        TextAllergy.setBounds(240, 360, 460, 60);

        TextContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextContactNoActionPerformed(evt);
            }
        });
        panel.add(TextContactNo);
        TextContactNo.setBounds(240, 250, 160, 30);

        TextSex.setMaximumRowCount(3);
        TextSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other", " " }));
        TextSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSexActionPerformed(evt);
            }
        });
        panel.add(TextSex);
        TextSex.setBounds(660, 140, 110, 30);

        TextAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAddressActionPerformed(evt);
            }
        });
        panel.add(TextAddress);
        TextAddress.setBounds(540, 250, 230, 30);
        panel.add(TextOpno);
        TextOpno.setBounds(70, 50, 60, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("OP.no:");
        panel.add(jLabel6);
        jLabel6.setBounds(20, 47, 50, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age:");
        panel.add(jLabel4);
        jLabel4.setBounds(470, 140, 40, 30);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(780, 390, 110, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact No:");
        panel.add(jLabel8);
        jLabel8.setBounds(100, 250, 110, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Drugs Allergy:");
        panel.add(jLabel10);
        jLabel10.setBounds(110, 360, 100, 40);

        TextTimeOfAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTimeOfAdmissionActionPerformed(evt);
            }
        });
        panel.add(TextTimeOfAdmission);
        TextTimeOfAdmission.setBounds(600, 200, 170, 30);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Family Member:");
        panel.add(jLabel11);
        jLabel11.setBounds(100, 290, 110, 40);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Name:");
        panel.add(jLabel12);
        jLabel12.setBounds(220, 300, 50, 30);

        TextFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFNameActionPerformed(evt);
            }
        });
        panel.add(TextFName);
        TextFName.setBounds(270, 300, 190, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Contact No:");
        panel.add(jLabel13);
        jLabel13.setBounds(470, 300, 90, 30);

        TextFContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFContactNoActionPerformed(evt);
            }
        });
        panel.add(TextFContactNo);
        TextFContactNo.setBounds(560, 300, 210, 30);

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

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of Admission:");
        panel.add(jLabel14);
        jLabel14.setBounds(100, 200, 130, 30);

        TextDateOfAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDateOfAdmissionActionPerformed(evt);
            }
        });
        panel.add(TextDateOfAdmission);
        TextDateOfAdmission.setBounds(240, 200, 160, 30);

        jButton2.setText("Go To Appointment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2);
        jButton2.setBounds(770, 350, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        panel.add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 600);

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
        PatientService Ps = new PatientService();
        Ps.insertApp(this);
      
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAgeActionPerformed

    private void TextContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextContactNoActionPerformed

    private void TextFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFNameActionPerformed

    private void TextFContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFContactNoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        panel.removeAll();
        panel.setLayout(new GridLayout(1,2));
        panel.add(new ViewAppointment());
        panel.updateUI();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void TextTimeOfAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTimeOfAdmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTimeOfAdmissionActionPerformed

    private void TextDateOfAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDateOfAdmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDateOfAdmissionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        panel.removeAll();
        panel.setLayout(new GridLayout(1,2));
        panel.add(new ViewAppointment());
        panel.updateUI();
        setPid();
        System.out.println(pid);
    }//GEN-LAST:event_jButton2ActionPerformed
    public void setPid()
    {
        pid = Integer.parseInt(TextOpno.getText());
    }
    public JTextField getTextAddress() {
        return TextAddress;
    }

    public int getPid() {
        return pid;
    }

    public JComboBox getTextAge() {
        return TextAge;
    }

    public JTextField getTextAllergy() {
        return TextAllergy;
    }

    public JTextField getTextContactNo() {
        return TextContactNo;
    }

    public JTextField getTextDateOfAdmission() {
        return TextDateOfAdmission;
    }

    public JTextField getTextFContactNo() {
        return TextFContactNo;
    }

    public JTextField getTextFName() {
        return TextFName;
    }

    public JTextField getTextName() {
        return TextName;
    }

    public JTextField getTextOpno() {
        return TextOpno;
    }

    public JComboBox getTextSex() {
        return TextSex;
    }

    

    public JTextField getTextTimeOfAdmission() {
        return TextTimeOfAdmission;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextAddress;
    private javax.swing.JComboBox TextAge;
    private javax.swing.JTextField TextAllergy;
    private javax.swing.JTextField TextContactNo;
    private javax.swing.JTextField TextDateOfAdmission;
    private javax.swing.JTextField TextFContactNo;
    private javax.swing.JTextField TextFName;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextOpno;
    private javax.swing.JComboBox TextSex;
    private javax.swing.JTextField TextTimeOfAdmission;
    private javax.swing.JLabel date_txt6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel time_txt6;
    // End of variables declaration//GEN-END:variables
}
