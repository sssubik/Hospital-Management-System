
import FormValidation.Validate;
import com.repository.RepositoryClass;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import java.util.Vector;
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
public class ViewAppointment extends javax.swing.JPanel {

    Vector originalTableModel;
    DocumentListener documentListener;
    int row;
    int TableClick;
    String date;
    String PatientName;

    /**
     * Creates new form jpanel3
     */
    public ViewAppointment() {
        initComponents();
        CurrentDate();
        updateTable();
        //setLocationRelativeTo(null);
        //backup of original values to check
        originalTableModel = (Vector) ((DefaultTableModel) TableAppointment.getModel()).getDataVector().clone();
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
        DefaultTableModel currtableModel = (DefaultTableModel) TableAppointment.getModel();
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
                    date = year + "-" + monthh + "-" + dayy;
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
        ResultSet rs = Rc.viewAppointmentTable();
        TableAppointment.setModel(DbUtils.resultSetToTableModel(rs));
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
        Error = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAppointment = new javax.swing.JTable();
        TextSearch = new javax.swing.JTextField();
        ButtonSearch = new javax.swing.JButton();
        TextId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TextPid = new javax.swing.JTextField();
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

        Error.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ErrorMouseClicked(evt);
            }
        });
        panel.add(Error);
        Error.setBounds(330, 550, 530, 40);

        TableAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAppointmentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TableAppointmentMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TableAppointment);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 920, 400);
        panel.add(TextSearch);
        TextSearch.setBounds(110, 50, 310, 30);

        ButtonSearch.setText("Search");
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        panel.add(ButtonSearch);
        ButtonSearch.setBounds(490, 50, 130, 30);
        panel.add(TextId);
        TextId.setBounds(180, 510, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Patient ID:");
        panel.add(jLabel2);
        jLabel2.setBounds(10, 540, 170, 50);

        jButton2.setText("CheckIn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2);
        jButton2.setBounds(350, 510, 100, 40);

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel.add(jButton3);
        jButton3.setBounds(510, 510, 100, 40);

        jButton4.setText("Patient");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel.add(jButton4);
        jButton4.setBounds(670, 510, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Appointment ID:");
        panel.add(jLabel4);
        jLabel4.setBounds(20, 500, 170, 50);
        panel.add(TextPid);
        TextPid.setBounds(180, 550, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InvoiceBackground.jpg"))); // NOI18N
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

    private void TableAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAppointmentMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_TableAppointmentMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Validate valid = new Validate();
        if(!valid.isInteger(TextId.getText()))
        {
            Error.setText("Aid must be an Intger");
        }
        else if(!valid.isInteger(TextPid.getText()))
        {   
            Error.setText("Pid must be an Intger");
        }
        else{
        int Aid = Integer.parseInt(TextId.getText());

        int Pid = Integer.parseInt(TextPid.getText());
        System.out.println(Pid);
        RepositoryClass Rc = new RepositoryClass();
        
        
        Rc.checkIn(Aid, Pid, date);

        updateTable();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        InPatApp Ia = new InPatApp();
        Ia.addPatientName(PatientName);
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.returnInPatientOpNo();
        try {
            if (rs.next()) {
                Ia.setOpno(rs.getString("Opno"));
            }
        } catch (Exception e) {

        }

        panel.add(Ia);
        panel.updateUI();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int Aid = Integer.parseInt(TextId.getText());
        RepositoryClass Rc = new RepositoryClass();
        Rc.deleteApp(Aid);
        updateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TableAppointmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAppointmentMousePressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) TableAppointment.getModel();
        row = TableAppointment.getSelectedRow();
        TableClick = (int) TableAppointment.getModel().getValueAt(row, 0);
        PatientName = (String) TableAppointment.getModel().getValueAt(row, 3);
        TextId.setText(Integer.toString(TableClick));
        RepositoryClass Rc = new RepositoryClass();
        String PName = (String) TableAppointment.getModel().getValueAt(row, 3);
        String i = Rc.returnPid(PName);
        if (i == "0") {
            Error.setText("Sorry Patient Not Registered");
            TextPid.setText("");
        } else {
            TextPid.setText(i);
            Error.setText("");
        }


    }//GEN-LAST:event_TableAppointmentMousePressed

    private void ErrorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ErrorMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_ErrorMouseClicked

    public int getTableClick() {
        return TableClick;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JLabel Error;
    private javax.swing.JTable TableAppointment;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextPid;
    private javax.swing.JTextField TextSearch;
    private javax.swing.JLabel date_txt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel time_txt3;
    // End of variables declaration//GEN-END:variables
}
