
import com.repository.RepositoryClass;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.GridLayout;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rpran
 */
public class vmedicine_jpanel extends javax.swing.JPanel {

    /**
     * Creates new form jpanel3
     */
    public vmedicine_jpanel() {
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

        panel = new javax.swing.JPanel();
        time_txt6 = new javax.swing.JLabel();
        date_txt6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextRegDate = new javax.swing.JTextField();
        TextStock = new javax.swing.JTextField();
        TextName = new javax.swing.JTextField();
        TextCost = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TextExpDate = new javax.swing.JTextField();
        Error = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backbutton2.jpg"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel.add(jButton5);
        jButton5.setBounds(10, 10, 80, 27);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stock:");
        panel.add(jLabel4);
        jLabel4.setBounds(210, 370, 120, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registered Date:");
        panel.add(jLabel5);
        jLabel5.setBounds(210, 190, 120, 40);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cost:");
        panel.add(jLabel6);
        jLabel6.setBounds(210, 310, 120, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Expiry Date:");
        panel.add(jLabel7);
        jLabel7.setBounds(210, 250, 120, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name:");
        panel.add(jLabel8);
        jLabel8.setBounds(210, 130, 120, 40);

        TextRegDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextRegDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextRegDateActionPerformed(evt);
            }
        });
        panel.add(TextRegDate);
        TextRegDate.setBounds(340, 190, 220, 40);

        TextStock.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextStockActionPerformed(evt);
            }
        });
        panel.add(TextStock);
        TextStock.setBounds(340, 370, 220, 40);

        TextName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNameActionPerformed(evt);
            }
        });
        panel.add(TextName);
        TextName.setBounds(340, 130, 350, 40);

        TextCost.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextCost.setToolTipText("");
        TextCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCostActionPerformed(evt);
            }
        });
        panel.add(TextCost);
        TextCost.setBounds(340, 310, 220, 40);

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2);
        jButton2.setBounds(720, 130, 90, 40);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VIEW MEDICINE RECORD");
        panel.add(jLabel3);
        jLabel3.setBounds(410, 10, 180, 30);

        TextExpDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextExpDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextExpDateActionPerformed(evt);
            }
        });
        panel.add(TextExpDate);
        TextExpDate.setBounds(340, 250, 220, 40);

        Error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        panel.add(Error);
        Error.setBounds(130, 430, 560, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        panel.add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 600);

        add(panel);
        panel.setBounds(0, 0, 980, 600);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD MEDICINE");
        add(jLabel2);
        jLabel2.setBounds(440, 10, 120, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        panel.removeAll();
        panel.setLayout(new GridLayout(1, 2));
        ExpiryAlert Ea = new ExpiryAlert();
        int i = Ea.Alert();
        StockAlert Sa = new StockAlert();
        int s = Sa.Alert();
        jpanel4 j = new jpanel4();
        if (i > 0) {
            j.setLabel(i);
        }
        if (s > 0) {
            j.setStock(s);
        }

        panel.add(j);
        panel.updateUI();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TextRegDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextRegDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextRegDateActionPerformed

    private void TextStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextStockActionPerformed

    private void TextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNameActionPerformed

    private void TextCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCostActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.checkDrug(TextName.getText());
        try {
            if (rs.next()) {

                String add2 = rs.getString("istock");
                TextStock.setText(add2);
                String add3 = rs.getString("ExDate");
                TextExpDate.setText(add3);
                String add4 = rs.getString("Cost");
                TextCost.setText(add4);
                String add5 = rs.getString("RegDate");
                TextRegDate.setText(add5);

                Error.setText("");

            } else {
                Error.setText("Sorry Drug Not Found !!!!");
                TextName.setText("");
                TextStock.setText("");
                TextExpDate.setText("");
                TextCost.setText("");
                TextRegDate.setText("");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextExpDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextExpDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Error;
    private javax.swing.JTextField TextCost;
    private javax.swing.JTextField TextExpDate;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextRegDate;
    private javax.swing.JTextField TextStock;
    private javax.swing.JLabel date_txt6;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel time_txt6;
    // End of variables declaration//GEN-END:variables
}