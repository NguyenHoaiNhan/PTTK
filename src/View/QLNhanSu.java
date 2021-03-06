/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author PC
 */
public class QLNhanSu extends javax.swing.JFrame {
    
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDateTime now = LocalDateTime.now();
    String nowDate = dtf.format(now);
    private Connection conn; 
    String driver = "com.mysql.jdbc.Driver";

    public QLNhanSu() {
        initComponents();
        setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        
        JTableHeader tableHeader = tbNhanSu.getTableHeader();
        tableHeader.setBackground(new java.awt.Color(75, 139, 197));
        tableHeader.setForeground(Color.white);
        tableHeader.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        tbNhanSu.getColumnModel().getColumn(0).setPreferredWidth(70);
        tbNhanSu.getColumnModel().getColumn(1).setPreferredWidth(110);
        tbNhanSu.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbNhanSu.getColumnModel().getColumn(3).setPreferredWidth(100);
        tbNhanSu.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbNhanSu.getColumnModel().getColumn(7).setPreferredWidth(110);
        tbNhanSu.getColumnModel().getColumn(8).setPreferredWidth(100);
        tbNhanSu.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        try {
            //Load driver
            Class.forName(driver).newInstance();
            //conn = DriverManager.getConnection(url+dbName+strUnicode,userName,password);
           
            //K???t n???i v???i Font ch??? Unicode
            String urlUnicode = "jdbc:mysql://localhost:3306/quanlycuahang?user=root&password=&useUnicode=true&characterEncoding=utf8";
            //T???o k???t n???i
            conn = DriverManager.getConnection(urlUnicode); 
            //-----
            System.out.println("Connected to the database");
           
            String SQL = "SELECT MaNV, TenNV, LoaiNV, CMND, sdtNV, GioiTinh, DiemChuyenCan, NgVaoLam, TinhTrang FROM nhanvien";    
            
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            Vector data = null;
            rs.last();
            int count;
            count = rs.getRow();
            
            
            rs.beforeFirst(); 
//            int i=0; 
            while (rs.next()) {
                
                int TT = rs.getInt("TinhTrang");
                String strTinhTrang="";
                if(TT==1){
                    strTinhTrang ="??ang L??m";
                }
                else{
                    strTinhTrang ="???? Ngh???";
                }
                
                int GT = rs.getInt("GioiTinh");
                String strGioiTinh = "";
                if(GT==1){
                    strGioiTinh ="N???";
                }
                else{
                    strGioiTinh ="Nam";
                }
                
                int CV = rs.getInt("LoaiNV");
                String strLoaiNV = "";
                if(CV==1){
                    strLoaiNV ="Qu???n L??";
                }
                if(CV==2){
                    strLoaiNV ="Thu Ng??n";
                }
                if(CV==3){
                    strLoaiNV ="Th??? Kho";
                }
                data = new Vector();
                data.add(rs.getString("MaNV"));
                data.add(rs.getString("TenNV"));
                data.add(strLoaiNV);
                data.add(rs.getInt("CMND"));
                data.add(rs.getInt("sdtNV"));
                data.add(strGioiTinh);
                data.add(rs.getString("DiemChuyenCan"));
                data.add(rs.getString("NgVaoLam"));                
                data.add(strTinhTrang);
                // Th??m m???t d??ng v??o table model
                DefaultTableModel dsNhanSu =(DefaultTableModel) tbNhanSu.getModel();
                dsNhanSu.addRow(data);
              }
            rs.close();
            stat.close();
            conn.close();
        }catch(SQLException se)
        {
               se.printStackTrace();
        }catch(Exception e){
                // Xu ly cac loi cho Class.forName
                e.printStackTrace();
        }finally{
             
               }// Ket thuc khoi finally
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanSu = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tfTen1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfSDT1 = new javax.swing.JTextField();
        tfCMND1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbGioiTinh1 = new javax.swing.JComboBox<>();
        cbChucVu1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        lbThongBao = new javax.swing.JLabel();
        lbMNV = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbTinhTrang = new javax.swing.JComboBox<>();
        btCapNhat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfUser = new javax.swing.JTextField();
        tfSDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfCMND = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbChucVu = new javax.swing.JComboBox<>();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tfTen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btXacNhan = new javax.swing.JButton();
        pfMatKhau = new javax.swing.JPasswordField();
        cbHien = new javax.swing.JCheckBox();
        tfTimKiem = new javax.swing.JTextField();
        btTimKiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton8.setBackground(new java.awt.Color(75, 139, 197));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("B??n H??ng");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 260, 300, 70);

        jButton9.setBackground(new java.awt.Color(75, 139, 197));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Th??nh Vi??n");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 370, 300, 70);

        jButton7.setBackground(new java.awt.Color(75, 139, 197));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Nh??n Vi??n");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 480, 300, 70);

        jButton2.setBackground(new java.awt.Color(75, 139, 197));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Th???ng K??");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 590, 300, 70);

        jButton10.setBackground(new java.awt.Color(75, 139, 197));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Kho H??ng");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(0, 700, 300, 70);

        jButton11.setBackground(new java.awt.Color(75, 139, 197));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("????ng Xu???t");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(0, 810, 300, 70);

        tbNhanSu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbNhanSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? NV", "T??n ", "Ch???c V???", "CMND", "S??T", "Gi???i T??nh", "DCC", "Ng??y V??o L??m", "T??nh Tr???ng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNhanSu.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tbNhanSu.setRowHeight(35);
        tbNhanSu.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tbNhanSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanSuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanSu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(470, 260, 860, 290);

        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("C???p nh???t t??i kho???n ");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(120, 60, 200, 30);

        tfTen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTen1ActionPerformed(evt);
            }
        });
        jPanel3.add(tfTen1);
        tfTen1.setBounds(110, 130, 220, 27);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("T??n:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(60, 130, 41, 20);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("S??t:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(60, 160, 41, 20);
        jPanel3.add(tfSDT1);
        tfSDT1.setBounds(110, 160, 220, 27);
        jPanel3.add(tfCMND1);
        tfCMND1.setBounds(110, 190, 220, 27);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("CMND:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(60, 190, 41, 20);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Gi???i T??nh:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(40, 220, 60, 20);

        cbGioiTinh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N???", "Nam" }));
        cbGioiTinh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGioiTinh1ActionPerformed(evt);
            }
        });
        jPanel3.add(cbGioiTinh1);
        cbGioiTinh1.setBounds(110, 220, 100, 25);

        cbChucVu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thu Ng??n", "Th??? Kho", "Qu???n L??" }));
        cbChucVu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChucVu1ActionPerformed(evt);
            }
        });
        jPanel3.add(cbChucVu1);
        cbChucVu1.setBounds(110, 250, 100, 25);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Ch???c v???:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(40, 250, 60, 20);

        lbThongBao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(lbThongBao);
        lbThongBao.setBounds(60, 100, 170, 20);

        lbMNV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel3.add(lbMNV);
        lbMNV.setBounds(240, 100, 60, 20);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("T??nh tr???ng:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(20, 280, 80, 15);

        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngh??? L??m", "??ang L??m" }));
        jPanel3.add(cbTinhTrang);
        cbTinhTrang.setBounds(110, 280, 100, 25);

        btCapNhat.setText("C???p Nh???t");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });
        jPanel3.add(btCapNhat);
        btCapNhat.setBounds(140, 420, 120, 40);

        jTabbedPane1.addTab("C???p nh???t th??ng tin", jPanel3);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("????ng k?? t??i kho???n ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(120, 60, 230, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("T??n:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 160, 41, 20);

        tfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserActionPerformed(evt);
            }
        });
        jPanel2.add(tfUser);
        tfUser.setBounds(100, 130, 220, 27);
        jPanel2.add(tfSDT);
        tfSDT.setBounds(100, 190, 220, 27);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("S??t:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 190, 41, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ch???c v???:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 280, 60, 20);
        jPanel2.add(tfCMND);
        tfCMND.setBounds(100, 220, 220, 27);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CMND:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 220, 41, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Gi???i T??nh:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 250, 60, 20);

        cbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thu Ng??n", "Th??? Kho", "Qu???n L??" }));
        cbChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChucVuActionPerformed(evt);
            }
        });
        jPanel2.add(cbChucVu);
        cbChucVu.setBounds(100, 280, 80, 25);

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N???", "Nam" }));
        cbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGioiTinhActionPerformed(evt);
            }
        });
        jPanel2.add(cbGioiTinh);
        cbGioiTinh.setBounds(100, 250, 80, 25);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("User:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 130, 41, 20);

        tfTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTenActionPerformed(evt);
            }
        });
        jPanel2.add(tfTen);
        tfTen.setBounds(100, 160, 220, 27);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("M???t kh???u:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 320, 60, 15);

        btXacNhan.setText("X??c Nh???n");
        btXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXacNhanActionPerformed(evt);
            }
        });
        jPanel2.add(btXacNhan);
        btXacNhan.setBounds(140, 420, 120, 40);
        jPanel2.add(pfMatKhau);
        pfMatKhau.setBounds(100, 320, 160, 27);

        cbHien.setText("Hi???n");
        cbHien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbHienMouseClicked(evt);
            }
        });
        jPanel2.add(cbHien);
        cbHien.setBounds(270, 320, 60, 18);

        jTabbedPane1.addTab("????ng k?? t??i kho???n", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(1430, 260, 430, 640);
        getContentPane().add(tfTimKiem);
        tfTimKiem.setBounds(470, 230, 200, 27);

        btTimKiem.setText("T??m");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btTimKiem);
        btTimKiem.setBounds(680, 230, 49, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuahangtienloi/Image/Background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 0, 1960, 1090);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void tbNhanSuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanSuMouseClicked
        DefaultTableModel tbnhansu =(DefaultTableModel)tbNhanSu.getModel();
        int SelectedRows = tbNhanSu.getSelectedRow();
        lbThongBao.setText("C???p nh???t nh??n vi??n m??:");
        lbMNV.setText(tbnhansu.getValueAt(SelectedRows,0).toString());
        tfTen1.setText(tbnhansu.getValueAt(SelectedRows,1).toString());
        tfSDT1.setText(tbnhansu.getValueAt(SelectedRows,4).toString());
        tfCMND1.setText(tbnhansu.getValueAt(SelectedRows,3).toString());
        cbGioiTinh1.setSelectedItem(tbnhansu.getValueAt(SelectedRows,5).toString());
        cbChucVu1.setSelectedItem(tbnhansu.getValueAt(SelectedRows,2).toString());
        cbTinhTrang.setSelectedItem(tbnhansu.getValueAt(SelectedRows,8).toString());
       
        
        
        
        
        
        
    }//GEN-LAST:event_tbNhanSuMouseClicked

    private void tfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserActionPerformed

    private void cbChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChucVuActionPerformed

    private void cbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGioiTinhActionPerformed

    private void tfTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTenActionPerformed

    private void btXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXacNhanActionPerformed
        String User = tfUser.getText(); 
        String Ten = tfTen.getText(); 
        String SDT = tfSDT.getText(); 
        String CMND = tfCMND.getText(); 
        String strGT = cbGioiTinh.getSelectedItem().toString();
        String strChucVu = cbChucVu.getSelectedItem().toString();
        String Pass = pfMatKhau.getPassword().toString();
        int GT = 0;
        if(strGT.equals("Nam")){
            GT = 0;
        }
        else {
            GT = 1;
        }
        int CV = 0;
        if(strChucVu.equals("Thu Ng??n")){
            CV = 2;
        }
        if(strChucVu.equals("Qu???n L??")){
            CV = 1;
        }
        if(strChucVu.equals("Th??? Kho")){
            CV = 3;
        }
        String prefixLessTen = "NV0";
        String prefixEqMoreTen = "NV";
        try {
            //Load driver
            Class.forName(driver).newInstance();
            //conn = DriverManager.getConnection(url+dbName+strUnicode,userName,password);
           
            //K???t n???i v???i Font ch??? Unicode
            String urlUnicode = "jdbc:mysql://localhost:3306/quanlycuahang?user=root&password=&useUnicode=true&characterEncoding=utf8";
            //T???o k???t n???i
            conn = DriverManager.getConnection(urlUnicode); 
            //-----
            System.out.println("Connected to the database Them");
           //T???o m?? nv b???ng c??ch ?????m d??ng hi???n t???i, t???o string = NV_xx
            String SQL1 = "SELECT * FROM nhanvien";    
            Statement stat1 = conn.createStatement();
            ResultSet rs1 = stat1.executeQuery(SQL1);
            rs1.last();
            System.out.print("Het truy van");
            int countnv;//Th??? t??? m?? l???n nh???t hi???n t???i
            countnv = rs1.getRow() + 1;//Do M?? b???t ?????u t??? 01
            
            System.out.print(countnv);
            
            String strcounthd = String.valueOf(countnv);
            String MNV="";
            if(countnv<10){
                MNV = prefixLessTen+strcounthd;
            }
            else{
                MNV = prefixEqMoreTen+strcounthd;
            }
            rs1.close();
            stat1.close();
           
            System.out.print(MNV);
            
            
            
            //Insert h??a ????n
            String SQL2 = "INSERT INTO nhanvien VALUES(?,?,?,?,?,?,?,?,0,?,1)"; 
            PreparedStatement stat2 = conn.prepareStatement(SQL2);
            stat2.setString(1, MNV);
            stat2.setString(2, User);
            stat2.setString(3, Pass);
            stat2.setString(4, Ten);
            stat2.setInt(5, CV);
            stat2.setString(6, CMND);
            stat2.setString(7, SDT);
            stat2.setInt(8, GT);
            stat2.setString(9, nowDate);

            stat2.executeUpdate();
            stat2.close();
            

            JOptionPane.showMessageDialog(null, "Th??m th??nh vi??n th??nh c??ng!",  "", JOptionPane.WARNING_MESSAGE);
            conn.close();
            QLNhanSu reset = new QLNhanSu();
        }catch(SQLException se)
        {
               se.printStackTrace();
        }catch(Exception e){
                // Xu ly cac loi cho Class.forName
                e.printStackTrace();
        }finally{
             
               }// Ket thuc khoi finally    
        
    }//GEN-LAST:event_btXacNhanActionPerformed

    private void cbHienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbHienMouseClicked
        boolean HideShow;
        if(cbHien.isSelected())
            pfMatKhau.setEchoChar((char)0);
        else
           pfMatKhau.setEchoChar('???');
        
       
        
    }//GEN-LAST:event_cbHienMouseClicked

    private void tfTen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTen1ActionPerformed

    private void cbGioiTinh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGioiTinh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGioiTinh1ActionPerformed

    private void cbChucVu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChucVu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChucVu1ActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        String MNV = lbMNV.getText();
        String Ten = tfTen1.getText(); 
        String SDT = tfSDT1.getText(); 
        String CMND = tfCMND1.getText(); 
        String strGT = cbGioiTinh1.getSelectedItem().toString();
        String strChucVu = cbChucVu1.getSelectedItem().toString();
        String strTT = cbTinhTrang.getSelectedItem().toString();
        int GT = 0;
        if(strGT.equals("Nam")){
            GT = 0;
        }
        else {
            GT = 1;
        }
        int TT = 0;
        if(strTT.equals("Ngh??? L??m")){
            TT = 0;
        }
        else {
            TT = 1;
        }
        int CV = 0;
        if(strChucVu.equals("Thu Ng??n")){
            CV = 2;
        }
        if(strChucVu.equals("Qu???n L??")){
            CV = 1;
        }
        if(strChucVu.equals("Th??? Kho")){
            CV = 3;
        }
        String prefixLessTen = "NV0";
        String prefixEqMoreTen = "NV";
        try {
            //Load driver
            Class.forName(driver).newInstance();
            //conn = DriverManager.getConnection(url+dbName+strUnicode,userName,password);
           
            //K???t n???i v???i Font ch??? Unicode
            String urlUnicode = "jdbc:mysql://localhost:3306/quanlycuahang?user=root&password=&useUnicode=true&characterEncoding=utf8";
            //T???o k???t n???i
            conn = DriverManager.getConnection(urlUnicode); 
            //-----
            System.out.println("Connected to the database Them");
          
            //Insert h??a ????n
            String SQL2 = "UPDATE nhanvien SET TenNV = ?, LoaiNV = ?,CMND = ?,sdtNV = ?,GioiTinh = ?,TinhTrang = ? WHERE MaNV = ?"; 
            PreparedStatement stat2 = conn.prepareStatement(SQL2);
            stat2.setString(1, Ten);
            stat2.setInt(2, CV);
            stat2.setString(3, CMND);
            stat2.setString(4, SDT);
            stat2.setInt(5, GT);
            stat2.setInt(6, TT);
            stat2.setString(7, MNV);

            stat2.executeUpdate();
            stat2.close();
            

            JOptionPane.showMessageDialog(null, "C???p nh???t th??nh vi??n th??nh c??ng!",  "", JOptionPane.WARNING_MESSAGE);
            conn.close();
            
            this.dispose();
            QLNhanSu reset = new QLNhanSu();
            reset.setExtendedState(reset.getExtendedState() | QLNhanSu.MAXIMIZED_BOTH);
     
        }catch(SQLException se)
        {
               se.printStackTrace();
        }catch(Exception e){
                // Xu ly cac loi cho Class.forName
                e.printStackTrace();
        }finally{
             
               }// Ket thuc khoi finally  
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
         DefaultTableModel dsThanhVien =(DefaultTableModel) tbNhanSu.getModel();
        String keyword = tfTimKiem.getText();
        
        String keywordTNV = '%'+keyword+'%';
        
        dsThanhVien.setRowCount(0);
        
        try {
            //Load driver
            Class.forName(driver).newInstance();

           
            //K???t n???i v???i Font ch??? Unicode
            String urlUnicode = "jdbc:mysql://localhost:3306/quanlycuahang?user=root&password=&useUnicode=true&characterEncoding=utf8";
            //T???o k???t n???i
            conn = DriverManager.getConnection(urlUnicode); 
            //-----
            System.out.println("Connected to the database");
            String SQL = "SELECT MaNV, TenNV, LoaiNV, CMND, sdtNV, GioiTinh, DiemChuyenCan, NgVaoLam, TinhTrang FROM nhanvien WHERE MaNV = ? OR TenNV LIKE ? OR sdtNV = ?";    
            
            PreparedStatement stat = conn.prepareStatement(SQL);
            stat.setString(1,keyword);
            stat.setString(2,keywordTNV);
            stat.setString(3,keyword);
            
            ResultSet rs = stat.executeQuery();
            
            Vector data = null;
            rs.last();
            int count;
            count = rs.getRow();
            
            
            rs.beforeFirst(); 
//            int i=0; 
            while (rs.next()) {
                
                int TT = rs.getInt("TinhTrang");
                String strTinhTrang="";
                if(TT==1){
                    strTinhTrang ="??ang L??m";
                }
                else{
                    strTinhTrang ="???? Ngh???";
                }
                
                int GT = rs.getInt("GioiTinh");
                String strGioiTinh = "";
                if(GT==1){
                    strGioiTinh ="N???";
                }
                else{
                    strGioiTinh ="Nam";
                }
                
                int CV = rs.getInt("LoaiNV");
                String strLoaiNV = "";
                if(CV==1){
                    strLoaiNV ="Qu???n L??";
                }
                if(CV==2){
                    strLoaiNV ="Thu Ng??n";
                }
                if(CV==3){
                    strLoaiNV ="Th??? Kho";
                }
                data = new Vector();
                data.add(rs.getString("MaNV"));
                data.add(rs.getString("TenNV"));
                data.add(strLoaiNV);
                data.add(rs.getInt("CMND"));
                data.add(rs.getInt("sdtNV"));
                data.add(strGioiTinh);
                data.add(rs.getString("DiemChuyenCan"));
                data.add(rs.getString("NgVaoLam"));                
                data.add(strTinhTrang);
                // Th??m m???t d??ng v??o table model
                DefaultTableModel dsNhanSu =(DefaultTableModel) tbNhanSu.getModel();
                dsNhanSu.addRow(data);
              }
            rs.close();
            stat.close();
            conn.close();
        }catch(SQLException se)
        {
               se.printStackTrace();
        }catch(Exception e){
                // Xu ly cac loi cho Class.forName
                e.printStackTrace();
        }finally{
             
               }// Ket thuc khoi finally
    }//GEN-LAST:event_btTimKiemActionPerformed

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
            java.util.logging.Logger.getLogger(QLNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhanSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanSu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXacNhan;
    private javax.swing.JComboBox<String> cbChucVu;
    private javax.swing.JComboBox<String> cbChucVu1;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbGioiTinh1;
    private javax.swing.JCheckBox cbHien;
    private javax.swing.JComboBox<String> cbTinhTrang;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbMNV;
    private javax.swing.JLabel lbThongBao;
    private javax.swing.JPasswordField pfMatKhau;
    private javax.swing.JTable tbNhanSu;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfCMND1;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfSDT1;
    private javax.swing.JTextField tfTen;
    private javax.swing.JTextField tfTen1;
    private javax.swing.JTextField tfTimKiem;
    private javax.swing.JTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
