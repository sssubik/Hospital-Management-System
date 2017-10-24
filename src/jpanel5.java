
import FormValidation.Validate;
import com.repository.RepositoryClass;
import com.toedter.calendar.JDateChooser;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.GridLayout;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rpran
 */
public class jpanel5 extends javax.swing.JPanel {

    /**
     * Creates new form jpanel3
     */
    String time;

    public jpanel5() {
        initComponents();
        CurrentDate();

    }

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
                    date_txt4.setText(year + "-" + monthh + "-" + dayy);
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
                    time_txt4.setText(houur + ":" + minuute + ":" + seconnd);
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

    public void Click(ViewDoctor V) {
        RepositoryClass Rc = new RepositoryClass();
        int i = V.getTableClick();
        ResultSet Rs = Rc.returnDoctorName(i);
        try {
            if (Rs.next()) {
                String add1 = Rs.getString("Did");
                TextDid.setText(add1);
                String add2 = Rs.getString("DoctorName");
                TextName.setText(add2);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setTime() {
        time = String.valueOf(Hour.getSelectedItem()) + ":" + String.valueOf(Minute.getSelectedItem()) + "  " + String.valueOf(AP.getSelectedItem());
    }
    public void updateTable(ViewDoctor V)
    {   
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.viewDoctorSchedule(V.getTableClick());
        TableDoctor.setModel(DbUtils.resultSetToTableModel(rs));
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
        time_txt4 = new javax.swing.JLabel();
        date_txt4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TextDid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DateAppointment = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        Hour = new javax.swing.JComboBox<>();
        Minute = new javax.swing.JComboBox<>();
        AP = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextPName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        TextName = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Error = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDoctor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        panel.setLayout(null);

        time_txt4.setBackground(new java.awt.Color(255, 255, 255));
        time_txt4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        time_txt4.setForeground(new java.awt.Color(255, 255, 255));
        time_txt4.setText("Time");
        time_txt4.setRequestFocusEnabled(false);
        panel.add(time_txt4);
        time_txt4.setBounds(900, 0, 80, 20);

        date_txt4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        date_txt4.setForeground(new java.awt.Color(255, 255, 255));
        date_txt4.setText("Date");
        panel.add(date_txt4);
        date_txt4.setBounds(900, 20, 80, 20);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton2.jpg"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel.add(jButton4);
        jButton4.setBounds(20, 10, 80, 27);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Appointment");
        panel.add(jLabel6);
        jLabel6.setBounds(390, 10, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Name: ");
        panel.add(jLabel2);
        jLabel2.setBounds(90, 100, 200, 40);
        panel.add(jSeparator1);
        jSeparator1.setBounds(0, 100, 980, 10);

        jButton1.setText("View Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(100, 180, 170, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Appointment Time: ");
        panel.add(jLabel3);
        jLabel3.setBounds(100, 350, 170, 30);
        panel.add(TextDid);
        TextDid.setBounds(270, 230, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctor ID:");
        panel.add(jLabel4);
        jLabel4.setBounds(100, 230, 90, 30);

        DateAppointment.setDateFormatString("yyyy-MM-dd");
        panel.add(DateAppointment);
        DateAppointment.setBounds(270, 310, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Appointment Date: ");
        panel.add(jLabel5);
        jLabel5.setBounds(100, 310, 170, 30);

        Hour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-HH-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        Hour.setSelectedIndex(00);
        Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HourActionPerformed(evt);
            }
        });
        panel.add(Hour);
        Hour.setBounds(270, 350, 70, 30);

        Minute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-MM-", "00", "01 ", "02", "03", "04", "05", "06", "07", "08 ", "09 ", "10 ", "11 ", "12 ", "13 ", "14 ", "15 ", "16 ", "17 ", "18 ", "19 ", "20 ", "21 ", "22 ", "23 ", "24 ", "25 ", "26 ", "27 ", "28 ", "29 ", "30 ", "31 ", "32 ", "33 ", "34 ", "35 ", "36 ", "37 ", "38 ", "39 ", "40 ", "41 ", "42 ", "43 ", "44 ", "45 ", "46 ", "47 ", "48 ", "49 ", "50 ", "51 ", "52 ", "53 ", "54 ", "55 ", "56 ", "57 ", "58 ", "59 " }));
        panel.add(Minute);
        Minute.setBounds(360, 350, 80, 30);

        AP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        panel.add(AP);
        AP.setBounds(460, 350, 80, 30);

        jButton2.setText("Make Appointment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2);
        jButton2.setBounds(100, 390, 230, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Patient Details");
        panel.add(jLabel7);
        jLabel7.setBounds(90, 60, 200, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Appointment Details");
        panel.add(jLabel8);
        jLabel8.setBounds(90, 140, 200, 40);
        panel.add(TextPName);
        TextPName.setBounds(280, 110, 400, 30);
        panel.add(jSeparator3);
        jSeparator3.setBounds(0, 170, 950, 10);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Doctor Name:");
        panel.add(jLabel9);
        jLabel9.setBounds(100, 270, 90, 30);
        panel.add(TextName);
        TextName.setBounds(270, 270, 280, 30);

        jButton3.setText("View Appointment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel.add(jButton3);
        jButton3.setBounds(380, 390, 220, 50);

        Error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(Error);
        Error.setBounds(160, 440, 480, 40);

        TableDoctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TableDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableDoctor.setGridColor(new java.awt.Color(0, 255, 0));
        TableDoctor.setRowHeight(34);
        TableDoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDoctorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TableDoctorMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableDoctorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TableDoctorMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TableDoctor);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(610, 180, 360, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        panel.add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 600);

        add(panel);
        panel.setBounds(0, 0, 980, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new jpanel1());
        panel.updateUI();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new ViewDoctor());
        panel.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HourActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setTime();
        Validate valid = new Validate();
        String hour = String.valueOf(Hour.getSelectedItem());
        String min = String.valueOf(Minute.getSelectedItem());
        
        String date = ((JTextField) DateAppointment.getDateEditor().getUiComponent()).getText();
        if (!valid.isString(TextPName.getText())) {
            Error.setText("Patient Name must Be String!!");
        } else if (!valid.isInteger(TextDid.getText())) {
            Error.setText("Did Must Be Integer!!");
        } else if (!valid.isString(TextName.getText())) {
            Error.setText("Doctor Name Must Be String!!");
        } else if (valid.isEmpty(date)) {
            Error.setText("Date Empty!!!");
        }
        else if (!valid.isInteger(hour)) {
            Error.setText("Hour Must Be Integer!!");
        }
        else if (!valid.isInteger(min)) {
            Error.setText("Minute Must Be Integer!!");
        }
        else{
             Error.setText("");
        AppointmentService As = new AppointmentService();
        As.insert(this);
       
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new ViewAppointment());
        panel.updateUI();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TableDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDoctorMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_TableDoctorMouseClicked

    private void TableDoctorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDoctorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TableDoctorMouseEntered

    private void TableDoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDoctorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableDoctorMousePressed

    private void TableDoctorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDoctorMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_TableDoctorMouseReleased

    public JDateChooser getDateAppointment() {
        return DateAppointment;
    }

    public JTextField getTextDid() {
        return TextDid;
    }

    public JTextField getTextName() {
        return TextName;
    }

    public String getTime() {
        return time;
    }

    public JTextField getTextPName() {
        return TextPName;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AP;
    private com.toedter.calendar.JDateChooser DateAppointment;
    private javax.swing.JLabel Error;
    private javax.swing.JComboBox<String> Hour;
    private javax.swing.JComboBox<String> Minute;
    private javax.swing.JTable TableDoctor;
    private javax.swing.JTextField TextDid;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextPName;
    private javax.swing.JLabel date_txt4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel time_txt4;
    // End of variables declaration//GEN-END:variables
}
