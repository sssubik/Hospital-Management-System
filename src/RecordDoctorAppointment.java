
import com.repository.RepositoryClass;
import java.awt.GridLayout;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
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
public class RecordDoctorAppointment extends javax.swing.JPanel {

    Vector originalTableModel;
    DocumentListener documentListener;
    ResultSet Rs;
    DefaultTableModel currtableModel  ;  
    /**
     * Creates new form jpanel3
     */
    public RecordDoctorAppointment() {
        initComponents();
        fillComboDoctor();
       
        CurrentDate();

        //setLocationRelativeTo(null);
        //backup of original values to check
        
        //add document listener to jtextfield to search contents as soon as something typed on it
        addDocumentListener();

    }

    private void addDocumentListener() {
        documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                search();
            }

            public void insertUpdate(DocumentEvent documentEvent) {
                search();
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                search();
            }

            private void search() {
                searchTableContents(TextSearch.getText());
            }
        };

    }

    public void fillComboDoctor() {
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rss = Rc.viewDoctorCombo();
        try {
            while (rss.next()) {
                String add1 = rss.getString("DoctorName");
                ComboDoctor.addItem(add1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void searchTableContents(String searchString) {

        
        //To empty the table before search
        currtableModel = (DefaultTableModel) RecordTable.getModel();
        currtableModel.setRowCount(0);
        //To search for contents from original table content
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().contains(searchString)) {
                    //content found so adding to table
                    currtableModel.addRow(rowVector);
                    break;
                }
            }

        }
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
                    date_txt3.setText(year + "-" + monthh + "-" + dayy);
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
                    time_txt3.setText(houur + ":" + minuute + ":" + seconnd);
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

        panel = new javax.swing.JPanel();
        time_txt3 = new javax.swing.JLabel();
        date_txt3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecordTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ComboDoctor = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        TextSearch = new javax.swing.JTextField();
        ButtonSearch = new javax.swing.JButton();
        mian = new javax.swing.JLabel();

        setLayout(null);

        panel.setLayout(null);

        time_txt3.setBackground(new java.awt.Color(255, 255, 255));
        time_txt3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        time_txt3.setForeground(new java.awt.Color(255, 255, 255));
        time_txt3.setText("Time");
        time_txt3.setRequestFocusEnabled(false);
        panel.add(time_txt3);
        time_txt3.setBounds(900, 0, 80, 20);

        date_txt3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        date_txt3.setForeground(new java.awt.Color(255, 255, 255));
        date_txt3.setText("Date");
        panel.add(date_txt3);
        date_txt3.setBounds(900, 20, 80, 20);

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(30, 10, 71, 23);

        RecordTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecordTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RecordTableMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RecordTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(RecordTable);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(80, 170, 830, 260);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor Appointment Record:");
        panel.add(jLabel2);
        jLabel2.setBounds(340, 10, 380, 30);

        ComboDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Doctor--" }));
        ComboDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDoctorActionPerformed(evt);
            }
        });
        panel.add(ComboDoctor);
        ComboDoctor.setBounds(200, 110, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Doctor:");
        panel.add(jLabel4);
        jLabel4.setBounds(90, 110, 70, 20);

        TextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSearchActionPerformed(evt);
            }
        });
        panel.add(TextSearch);
        TextSearch.setBounds(110, 50, 310, 30);

        ButtonSearch.setText("Search");
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        panel.add(ButtonSearch);
        ButtonSearch.setBounds(440, 50, 130, 30);

        mian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        panel.add(mian);
        mian.setBounds(0, 0, 980, 600);

        add(panel);
        panel.setBounds(0, 0, 980, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new jpanel7());
        panel.updateUI();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void RecordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMouseClicked
        // TODO add your handling code here:
        /*try {
            row = TableDoctor.getSelectedRow();
            TableClick = (String) TableDoctor.getModel().getValueAt(row, 0);
            jpanel5 A = new jpanel5();
            A.Click(this);
            panel.removeAll();
            panel.setLayout(new GridLayout(1, 2));

            panel.add(A);
            panel.updateUI();

        } catch (Exception e) {

        }*/
    }//GEN-LAST:event_RecordTableMouseClicked

    private void RecordTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_RecordTableMousePressed

    private void RecordTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordTableMouseEntered

    private void ComboDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDoctorActionPerformed
        // TODO add your handling code here:
        JComboBox comboBox = (JComboBox) evt.getSource();
        Object selected = comboBox.getSelectedItem();
        String Doc = selected.toString();
        RepositoryClass Rc = new RepositoryClass();
        Rs = Rc.doctorAppointment(Doc);
        RecordTable.setModel(DbUtils.resultSetToTableModel(Rs));
        currtableModel = (DefaultTableModel) RecordTable.getModel();
        originalTableModel = (Vector) ((DefaultTableModel) RecordTable.getModel()).getDataVector().clone();
        

    }//GEN-LAST:event_ComboDoctorActionPerformed

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        // TODO add your handling code here:
        searchTableContents(TextSearch.getText());
    }//GEN-LAST:event_ButtonSearchActionPerformed

    private void TextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JComboBox ComboDoctor;
    private javax.swing.JTable RecordTable;
    private javax.swing.JTextField TextSearch;
    private javax.swing.JLabel date_txt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mian;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel time_txt3;
    // End of variables declaration//GEN-END:variables
}
