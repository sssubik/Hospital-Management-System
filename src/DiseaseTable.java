
import com.repository.RepositoryClass;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Vector;
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
 * @author Subik
 */
public class DiseaseTable extends javax.swing.JFrame {

    Vector originalTableModel;
    DocumentListener documentListener;
    DefaultTableModel TableModel;
    String Name = "";
    outpatient_jpanel oj = new outpatient_jpanel();
    int i;
    /**
     * Creates new form DiseaseTableJframe
     */
    public DiseaseTable() {
        setTitle("Disease Table - HCMS");
        initComponents();
        updateTable();
        setIcon();
        setLocationRelativeTo(null);
        //backup of original values to check
        originalTableModel = (Vector) ((DefaultTableModel) RecordTable.getModel()).getDataVector().clone();
        //add document listener to jtextfield to search contents as soon as something typed on it
        TableModel = (DefaultTableModel) RecordTable.getModel();
        addDocumentListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RecordTable = new javax.swing.JTable();
        TextSearch = new javax.swing.JTextField();
        ButtonSearch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(710, 530));
        setMinimumSize(new java.awt.Dimension(710, 530));
        setPreferredSize(new java.awt.Dimension(710, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(710, 530));
        getContentPane().setLayout(null);

        RecordTable.setAutoCreateRowSorter(true);
        RecordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Check", "Disease"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        RecordTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        RecordTable.setDragEnabled(true);
        RecordTable.setRowMargin(2);
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
        if (RecordTable.getColumnModel().getColumnCount() > 0) {
            RecordTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            RecordTable.getColumnModel().getColumn(1).setPreferredWidth(575);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 646, 352);

        TextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSearchActionPerformed(evt);
            }
        });
        getContentPane().add(TextSearch);
        TextSearch.setBounds(32, 50, 472, 30);

        ButtonSearch.setText("Search");
        ButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSearch);
        ButtonSearch.setBounds(548, 50, 130, 30);

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(588, 456, 90, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Diseases");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(32, 21, 58, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dback.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents
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

        //To empty the table before search
        TableModel.setRowCount(0);
        //To search for contents from original table content
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().contains(searchString)) {
                    //content found so adding to table
                    TableModel.addRow(rowVector);
                    break;
                }
            }

        }
    }

    public void close() {

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOS­ING);
        Toolkit.getDefaultToolkit().getSystemEve­ntQueue().postEvent(winClosingEvent);

    }
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

    private void RecordTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordTableMouseEntered

    private void RecordTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordTableMousePressed

    private void TextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSearchActionPerformed

    private void ButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchActionPerformed
        // TODO add your handling code here:
        searchTableContents(TextSearch.getText());
    }//GEN-LAST:event_ButtonSearchActionPerformed
    public void updateTable() {
        DefaultTableModel model = (DefaultTableModel) RecordTable.getModel();
        RepositoryClass Rc = new RepositoryClass();
        ResultSet rs = Rc.returnDiseases();
        int i = 0;
        try {
            while (rs.next()) {
                model.addRow(new Object[]{false, rs.getString("DiseaseName")});
                i = i + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        RepositoryClass Rc = new RepositoryClass();
        Boolean checked;
        String Col;

        TableModel = (DefaultTableModel) RecordTable.getModel();

        for (int j = 0; j < TableModel.getRowCount(); j++) {
            checked = Boolean.valueOf(TableModel.getValueAt(j, 0).toString());
            Col = TableModel.getValueAt(j, 1).toString();
            if (!checked) {
            } else {
                //System.out.println(Col);
                Rc.insertDiseasePatient(i,Col);
                Name = Name + "   " + Col;

            }
        }

        //System.out.println(Name);

        this.dispose();
        oj.setDiagnosis(Name);
        //oj.updateUI();
       
    }//GEN-LAST:event_jButton2ActionPerformed
    public void setDiagnosis(outpatient_jpanel j)
    {
         oj = j;
         i = Integer.parseInt(j.getTextOpno().getText());
         
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DiseaseTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiseaseTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiseaseTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiseaseTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiseaseTable().setVisible(true);
            }
        });
    }

    public String getName() {
        return Name;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSearch;
    private javax.swing.JTable RecordTable;
    private javax.swing.JTextField TextSearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOGO0.jpg")));
    }
}
