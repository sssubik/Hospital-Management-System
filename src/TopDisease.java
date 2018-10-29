
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
import javax.swing.JTextField;
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
public class TopDisease extends javax.swing.JPanel {

    Vector originalTableModel;
    DocumentListener documentListener;
    int row;
    int TableClick;
    String Name ;
    
    /**
     * Creates new form jpanel3
     */
    public TopDisease() {
        initComponents();
        CurrentDate();
       // updateTable();
        //setLocationRelativeTo(null);
        //backup of original values to check
        updateTable();
        originalTableModel = (Vector) ((DefaultTableModel) RecordTable.getModel()).getDataVector().clone();
        //add document listener to jtextfield to search contents as soon as something typed on it
       // addDocumentListener();
    }
/*
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
        DefaultTableModel currtableModel = (DefaultTableModel) RecordTable.getModel();
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
    */
    
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
        ResultSet rs = Rc. returnTopDisease();
        RecordTable.setModel(DbUtils.resultSetToTableModel(rs));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        RecordTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
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

        RecordTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        RecordTable.setFillsViewportHeight(true);
        RecordTable.setFocusCycleRoot(true);
        RecordTable.setGridColor(new java.awt.Color(0, 255, 0));
        RecordTable.setRowHeight(34);
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
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RecordTableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(RecordTable);
        if (RecordTable.getColumnModel().getColumnCount() > 0) {
            RecordTable.getColumnModel().getColumn(0).setPreferredWidth(600);
        }

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(90, 120, 800, 310);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Top Disease:");
        panel.add(jLabel2);
        jLabel2.setBounds(420, 0, 120, 40);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton2.jpg"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panel.add(jButton8);
        jButton8.setBounds(20, 10, 80, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        panel.add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 600);

        add(panel);
        panel.setBounds(0, 0, 980, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void RecordTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordTableMouseReleased

    private void RecordTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMousePressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_RecordTableMousePressed

    private void RecordTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordTableMouseEntered

    private void RecordTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMouseClicked
        // TODO add your handling code here:
      
        

    }//GEN-LAST:event_RecordTableMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(new jpanel7());
        panel.updateUI();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
    private javax.swing.JTable RecordTable;
    private javax.swing.JLabel date_txt3;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel time_txt3;
    // End of variables declaration//GEN-END:variables
}
