/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DangNhap extends javax.swing.JFrame {

    private Connection conn; 
    String driver = "com.mysql.jdbc.Driver";
    
    public DangNhap() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(75, 139, 197));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 770, 140, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(75, 139, 197));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("User: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(740, 710, 80, 50);

        tfUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfUser.setForeground(new java.awt.Color(75, 139, 197));
        tfUser.setMargin(new java.awt.Insets(5, 15, 5, 15));
        tfUser.setName(""); // NOI18N
        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });
        getContentPane().add(tfUser);
        tfUser.setBounds(820, 710, 300, 50);

        tfPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(75, 139, 197));
        tfPassword.setMargin(new java.awt.Insets(5, 15, 5, 15));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(tfPassword);
        tfPassword.setBounds(820, 770, 300, 50);

        jButton1.setBackground(new java.awt.Color(75, 139, 197));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(890, 850, 150, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuahangtienloi/Image/BackgroundLogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Select *:
        try {
            String user = tfUser.getText();
            String tfPass = String.valueOf(tfPassword.getPassword());
            //Load driver
            Class.forName(driver).newInstance();
            //conn = DriverManager.getConnection(url+dbName+strUnicode,userName,password);
           
            //K???t n???i v???i Font ch??? Unicode
            String urlUnicode = "jdbc:mysql://localhost:3306/quanlycuahang?user=root&password=&useUnicode=true&characterEncoding=utf8";
            //T???o k???t n???i
            conn = DriverManager.getConnection(urlUnicode); 
            //-----
            System.out.println("Connected to the database");
            String SQL = "SELECT Password FROM nhanvien WHERE user =?";//L???y so password vs user
            
            PreparedStatement stat = conn.prepareStatement(SQL);
            stat.setString(1,user );
            ResultSet rs = stat.executeQuery();
            rs.beforeFirst();
            rs.next(); 
            String idPassword = rs.getString(1);
            if(idPassword.equals(tfPass)){
                System.out.println("????ng pass r nha!");
                String SQL1 = "SELECT loainv FROM nhanvien WHERE user =?";//Coi user l?? qu???n l?? hay nh??n vi??n
                PreparedStatement stat1 = conn.prepareStatement(SQL1);
                stat1.setString(1,user);
                ResultSet rs1 = stat1.executeQuery();
                rs1.beforeFirst();
                rs1.next(); 
                int nhanvienType = rs1.getInt(1);
                if(nhanvienType==1){
                    this.dispose();
                    QLTrangChu indexManager = new QLTrangChu();
                    indexManager.setExtendedState(indexManager.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                }
                if(nhanvienType==2){
                    this.dispose();
                    TNTrangChu indexStaff = new TNTrangChu();
                    indexStaff.setExtendedState(indexStaff.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                }
                if(nhanvienType==3){
                    this.dispose();
                    TKTrangChu indexStaff = new TKTrangChu();
                    indexStaff.setExtendedState(indexStaff.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                }
                rs1.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "T??n t??i kho???n ho???c m???t kh???u kh??ng ????ng!",  "", JOptionPane.WARNING_MESSAGE);
            }
            
            rs.close();
            stat.close();
           // conn.close();
        }catch(SQLException se)
        {
               se.printStackTrace();
        }catch(Exception e){
                // Xu ly cac loi cho Class.forName
                e.printStackTrace();
        }finally{
             
               }// Ket thuc khoi finally
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
