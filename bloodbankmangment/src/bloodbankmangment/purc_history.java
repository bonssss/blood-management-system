/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodbankmangment;

import java.awt.Color;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mesi
 */
public class purc_history extends javax.swing.JFrame {

    /**
     * Creates new form Read
     */
    public purc_history() {
        initComponents();
        setSize(1000,700);
             setTitle("PURCHASER HISTORY");
         getContentPane().setBackground(new Color(255,102,102));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        close = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("aakar", 1, 24)); // NOI18N
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Read");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(192, 486, 90, 28);

        jTable1.setBackground(new java.awt.Color(51, 204, 255));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "AGE", "PHONENUMBER", "GENDER", "BLOODGROUP", "CITY"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(45, 137, 826, 243);

        jLabel1.setFont(new java.awt.Font("Mandali", 1, 30)); // NOI18N
        jLabel1.setText("All Purchaser List");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(294, 32, 246, 46);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 465, 902, 3);

        close.setBackground(new java.awt.Color(204, 204, 204));
        close.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 0, 0));
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(602, 486, 65, 28);

        Reset.setBackground(new java.awt.Color(204, 204, 204));
        Reset.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        Reset.setForeground(new java.awt.Color(102, 102, 102));
        Reset.setText("Reset");
        Reset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset);
        Reset.setBounds(393, 486, 78, 28);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 84, 896, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/bloodbank", "root", "");
            Statement st = con.createStatement();
            String sql = "select * from purchaser";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String name = rs.getString("name");
                String Age = String.valueOf(rs.getInt("Age"));
                String Phone = String.valueOf(rs.getInt("Phone"));
                String gender = rs.getString("Gender");
                String BloodGroup = rs.getString("BloodGroup");
                
                String city = rs.getString("city");

                String Tdata[] = {id, name, Age,Phone,gender,BloodGroup,city};
                DefaultTableModel TModel=(DefaultTableModel)jTable1.getModel();
                TModel.addRow(Tdata);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new purc_history().setVisible(true);
    }//GEN-LAST:event_ResetActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
         setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(purc_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purc_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purc_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purc_history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purc_history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}