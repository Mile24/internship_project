/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class MainScreen extends javax.swing.JFrame {
    
    public MainScreen() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    public void reset(){
        jTextFieldStdID.setText("");
        jTextFieldStdName.setText("");
        jTextFieldStdMarks.setText("");
        
        // Clear table data
        DefaultTableModel model = (DefaultTableModel) jTableStudent.getModel();
        model.setRowCount(0);

        // Clear chart panel
        jPanelChartScreen.removeAll();
        jPanelChartScreen.revalidate();
        jPanelChartScreen.repaint();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        BtnEnterData = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelChartScreen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldStdID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldStdName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldStdMarks = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudent = new javax.swing.JTable();
        jButtonLineChart = new javax.swing.JButton();
        jButtonBarChart = new javax.swing.JButton();
        jButtonPieChart = new javax.swing.JButton();
        BtnEditData = new javax.swing.JButton();
        BtnSavePrintReport = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        BtnEnter1 = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        BtnSaveData = new javax.swing.JButton();
        BtnDeleteData = new javax.swing.JButton();
        BtnDisplayTable = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        BtnEnterData.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnEnterData.setText("Enter Data");
        BtnEnterData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnterDataActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD YOUR STUDENTS DATA");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 255, 255), 3));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 250, 33));

        jPanelChartScreen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelChartScreen.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanelChartScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 440, 370));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Student ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 40));
        jPanel1.add(jTextFieldStdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Student Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, 40));
        jPanel1.add(jTextFieldStdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 200, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Out of 100");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 120, 40));
        jPanel1.add(jTextFieldStdMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 200, 40));

        jTableStudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 2));
        jTableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Student ID", "Student Name", " Student Marks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableStudent);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 560, 260));

        jButtonLineChart.setBackground(new java.awt.Color(204, 204, 204));
        jButtonLineChart.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonLineChart.setText("Line Chart");
        jButtonLineChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLineChartActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 450, 130, 40));

        jButtonBarChart.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBarChart.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonBarChart.setText("Bar Chart");
        jButtonBarChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarChartActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 130, 40));

        jButtonPieChart.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPieChart.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonPieChart.setText("Pie Chart");
        jButtonPieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPieChartActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 130, 40));

        BtnEditData.setBackground(new java.awt.Color(204, 204, 204));
        BtnEditData.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnEditData.setText("Edit Data");
        BtnEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditDataActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEditData, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 140, 40));

        BtnSavePrintReport.setBackground(new java.awt.Color(204, 204, 204));
        BtnSavePrintReport.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnSavePrintReport.setText("Save/ Print Report");
        BtnSavePrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSavePrintReportActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSavePrintReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 230, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Student Marks:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 40));

        BtnExit.setBackground(new java.awt.Color(204, 204, 204));
        BtnExit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 140, 40));

        BtnEnter1.setBackground(new java.awt.Color(204, 204, 204));
        BtnEnter1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnEnter1.setText("Enter Data");
        BtnEnter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnter1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEnter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 180, 40));

        BtnReset.setBackground(new java.awt.Color(204, 204, 204));
        BtnReset.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnReset.setText("Reset");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 140, 40));

        BtnSaveData.setBackground(new java.awt.Color(204, 204, 204));
        BtnSaveData.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnSaveData.setText("Save Data");
        BtnSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveDataActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSaveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 130, 40));

        BtnDeleteData.setBackground(new java.awt.Color(204, 204, 204));
        BtnDeleteData.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnDeleteData.setText("Delete Data");
        BtnDeleteData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteDataActionPerformed(evt);
            }
        });
        jPanel1.add(BtnDeleteData, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 160, 40));

        BtnDisplayTable.setBackground(new java.awt.Color(204, 204, 204));
        BtnDisplayTable.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnDisplayTable.setText("Show Database");
        BtnDisplayTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDisplayTableActionPerformed(evt);
            }
        });
        jPanel1.add(BtnDisplayTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 190, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEnterDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnterDataActionPerformed
        
    }//GEN-LAST:event_BtnEnterDataActionPerformed

    private void jButtonBarChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarChartActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        //iterating over the table
        for (int i = 0; i < jTableStudent.getRowCount(); i++) {
            String studentName = jTableStudent.getValueAt(i, 1).toString();
            int studentMarks = Integer.parseInt(jTableStudent.getValueAt(i, 2).toString());
            
            dataset.setValue(studentMarks, "Marks", studentName);
        }
        
        JFreeChart jfc = ChartFactory.createBarChart("Students Report", 
                "Students", 
                "Marks", 
                dataset, PlotOrientation.VERTICAL, 
                true, 
                true, 
                false);
        
        ChartPanel chartPanel = new ChartPanel(jfc);
        jPanelChartScreen.removeAll();
        jPanelChartScreen.add(chartPanel);
        jPanelChartScreen.revalidate();
        jPanelChartScreen.repaint();
    }//GEN-LAST:event_jButtonBarChartActionPerformed

    private void BtnEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditDataActionPerformed
        int stdId = Integer.parseInt(jTextFieldStdID.getText());
        String stdName = jTextFieldStdName.getText();
        int stdMarks = Integer.parseInt(jTextFieldStdMarks.getText());
        
        MainScreen mainScreen = new MainScreen();
         if (JOptionPane.showConfirmDialog(mainScreen, "Confirm if you want to edit","MySQL Connector", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
            try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentgradedb", "root", ""); 
                PreparedStatement ps = (PreparedStatement) con.prepareStatement("UPDATE STUDENT SET STUDENTNAME=?, STUDENTMARKS=? WHERE STUDENTID=?")) {
                ps.setString(1, stdName);
                ps.setInt(2, stdMarks);
                ps.setInt(3, stdId);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Edited Successfully");
                // Update the table model
            DefaultTableModel model = (DefaultTableModel) jTableStudent.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (Integer.parseInt(model.getValueAt(i, 0).toString()) == stdId) {
                    model.setValueAt(stdName, i, 1);
                    model.setValueAt(stdMarks, i, 2);
                    break;
                }
              }
            } 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
       }
      }  
    }//GEN-LAST:event_BtnEditDataActionPerformed

    private void BtnSavePrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSavePrintReportActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print & Save");
        
        job.setPrintable((Graphics g, PageFormat pf, int pageNumber) -> {
            if (pageNumber >0) {
                return Printable.NO_SUCH_PAGE;
            }
            Graphics2D g2 = (Graphics2D)g;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            // Get the dimensions of the imageable area
            double imageableWidth = pf.getImageableWidth();
            double imageableHeight = pf.getImageableHeight();
            
            // Get the dimensions of the ReportPanel
            double panelWidth = jPanelChartScreen.getWidth();
            double panelHeight = jPanelChartScreen.getHeight();
            
            // Calculate the scale factors
            double scaleX = imageableWidth / panelWidth;
            double scaleY = imageableHeight / panelHeight;
            
            // Use the smaller scale factor to fit the entire panel within the imageable area
            double scale = Math.min(scaleX, scaleY);
            
            g2.scale(scale, scale);
            
            jPanelChartScreen.paint(g2);
            return Printable.PAGE_EXISTS;
        });
        
        boolean ok = job.printDialog();
        if (ok) {
            try {
                job.print();
            } catch (PrinterException printerException) {
            }
        }
    }//GEN-LAST:event_BtnSavePrintReportActionPerformed

    private void jButtonPieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPieChartActionPerformed
        DefaultPieDataset dataset = new DefaultPieDataset();
        
        //iterating over the table
        for (int i = 0; i < jTableStudent.getRowCount(); i++) {
            String studentName = jTableStudent.getValueAt(i, 1).toString();
            int studentMarks = Integer.parseInt(jTableStudent.getValueAt(i, 2).toString());
            
            dataset.setValue(studentName, studentMarks);
        }
        
        JFreeChart jfc = ChartFactory.createPieChart("Student Report", 
                dataset, 
                true, 
                true, 
                false);
        
        ChartPanel chartPanel = new ChartPanel(jfc);
        jPanelChartScreen.removeAll();
        jPanelChartScreen.add(chartPanel);
        jPanelChartScreen.revalidate();
        jPanelChartScreen.repaint();
    }//GEN-LAST:event_jButtonPieChartActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        MainScreen mainScreen = new MainScreen();
         if (JOptionPane.showConfirmDialog(mainScreen, "Confirm if you want to exit","MySQL Connector", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnEnter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnter1ActionPerformed
        DefaultTableModel defaultTableModel = (DefaultTableModel)jTableStudent.getModel();
        defaultTableModel.addRow(new Object[] {
               jTextFieldStdID.getText(),
            jTextFieldStdName.getText(),
            jTextFieldStdMarks.getText()});
    }//GEN-LAST:event_BtnEnter1ActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        MainScreen mainScreen = new MainScreen();
         if (JOptionPane.showConfirmDialog(mainScreen, "Confirm if you want to reset","MySQL Connector", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION) {
            reset();
        }
    }//GEN-LAST:event_BtnResetActionPerformed

    private void jButtonLineChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLineChartActionPerformed
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        // Iterate through the table rows and add data to the dataset
        for (int i = 0; i < jTableStudent.getRowCount(); i++) {
            String studentName = jTableStudent.getValueAt(i, 1).toString();
            int studentMarks = Integer.parseInt(jTableStudent.getValueAt(i, 2).toString());
            
            dcd.setValue(studentMarks, "Marks", studentName);
        
    }
        JFreeChart jFreeChart = ChartFactory.createLineChart("Student Report", "Students", "Marks", dcd, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel chartPanel = new ChartPanel(jFreeChart);
        jPanelChartScreen.removeAll();
        jPanelChartScreen.add(chartPanel);
        jPanelChartScreen.revalidate();
        jPanelChartScreen.repaint();
    }                                            

    private void AreaChartBtnActionPerformed() {                                             
        
    }//GEN-LAST:event_jButtonLineChartActionPerformed

    private void BtnSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveDataActionPerformed
        int stdId = Integer.parseInt(jTextFieldStdID.getText());
        String stdName = jTextFieldStdName.getText();
        int stdMarks = Integer.parseInt(jTextFieldStdMarks.getText());
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentgradedb", "root", ""); 
                PreparedStatement ps = (PreparedStatement) con.prepareStatement("INSERT INTO STUDENT(STUDENTID,STUDENTNAME,STUDENTMARKS) VALUES(?,?,?)")) {
                ps.setInt(1, stdId);
                ps.setString(2, stdName);
                ps.setInt(3, stdMarks);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Saved");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnSaveDataActionPerformed

    private void BtnDeleteDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteDataActionPerformed
        int stdId = Integer.parseInt(jTextFieldStdID.getText());
        String stdName = jTextFieldStdName.getText();
        int stdMarks = Integer.parseInt(jTextFieldStdMarks.getText());
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/studentgradedb", "root", ""); 
                PreparedStatement ps = (PreparedStatement) con.prepareStatement("DELETE FROM STUDENT WHERE STUDENTID=?")) {
                ps.setInt(1, stdId);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Deleted Successfully");
                // Update the table model
            DefaultTableModel model = (DefaultTableModel) jTableStudent.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                if (Integer.parseInt(model.getValueAt(i, 0).toString()) == stdId) {
                    model.removeRow(i);
                    break;
                }
            }
            // Reset the text fields
            reset();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnDeleteDataActionPerformed

    private void BtnDisplayTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDisplayTableActionPerformed
        DisplayTable displayTable = new DisplayTable();
        displayTable.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnDisplayTableActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDeleteData;
    private javax.swing.JButton BtnDisplayTable;
    private javax.swing.JButton BtnEditData;
    private javax.swing.JButton BtnEnter1;
    private javax.swing.JButton BtnEnterData;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSaveData;
    private javax.swing.JButton BtnSavePrintReport;
    private javax.swing.JButton jButtonBarChart;
    private javax.swing.JButton jButtonLineChart;
    private javax.swing.JButton jButtonPieChart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelChartScreen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudent;
    private javax.swing.JTextField jTextFieldStdID;
    private javax.swing.JTextField jTextFieldStdMarks;
    private javax.swing.JTextField jTextFieldStdName;
    // End of variables declaration//GEN-END:variables

}
