
import com.repository.RepositoryClass;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rpran
 */
public class ViewDoctor extends javax.swing.JPanel {

    Vector originalTableModel;
    DocumentListener documentListener;
    int row;
    int TableClick;
    String Name ;
    /**
     * Creates new form jpanel3
     */
    public ViewDoctor() {
        initComponents();
        CurrentDate();
        updateTable();
        //setLocationRelativeTo(null);
        //backup of original values to check
        originalTableModel = (Vector) ((DefaultTableModel) TableDoctor.getModel()).getDataVector().clone();
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

    public void searchTableContents(String searchString) {
        DefaultTableModel currtableModel = (DefaultTableModel) TableDoctor.getModel();
        //To empty the table before search
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

    public void updateTable() {
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.viewDoctorTable();
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
        time_txt3 = new javax.swing.JLabel();
        date_txt3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDoctor = new javax.swing.JTable();
        TextSearch = new javax.swing.JTextField();
        ButtonSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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
        TableDoctor.setFillsViewportHeight(true);
        TableDoctor.setFocusCycleRoot(true);
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
        jScrollPane1.setBounds(90, 120, 810, 310);
        panel.add(TextSearch);
        TextSearch.setBounds(80, 60, 310, 30);

        ButtonSearch.setText("Search");
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        panel.add(ButtonSearch);
        ButtonSearch.setBounds(410, 60, 130, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctor List");
        panel.add(jLabel2);
        jLabel2.setBounds(440, 0, 100, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        panel.add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 600);

        add(panel);
        panel.setBounds(0, 0, 980, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new jpanel5());
        panel.updateUI();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        // TODO add your handling code here:

        searchTableContents(TextSearch.getText());
    }//GEN-LAST:event_ButtonSearchActionPerformed

    private void TableDoctorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDoctorMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TableDoctorMouseReleased

    private void TableDoctorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDoctorMousePressed
        // TODO add your handling code here:
        try {
            row = TableDoctor.getSelectedRow();
            TableClick = (int) TableDoctor.getModel().getValueAt(row, 0);
            Name = (String) TableDoctor.getModel().getValueAt(row, 1);
            jpanel5 j = new jpanel5();
            j.updateTable(this);
            j.Click(this);
            panel.removeAll();
            panel.setLayout(new GridLayout(1, 2));
            panel.add(j);
            panel.updateUI();
        } catch (Exception e) {
 JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_TableDoctorMousePressed

    private void TableDoctorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDoctorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TableDoctorMouseEntered

    private void TableDoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDoctorMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_TableDoctorMouseClicked

    public int getTableClick() {
        return TableClick;
    }

    public int getRow() {
        return row;
    }

    public String getName() {
        return Name;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JTable TableDoctor;
    private javax.swing.JTextField TextSearch;
    private javax.swing.JLabel date_txt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel time_txt3;
    // End of variables declaration//GEN-END:variables
}
