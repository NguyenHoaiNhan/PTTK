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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  


/**
 *
 * @author PC
 */
public class QLBanHang extends javax.swing.JFrame {

  
    private Connection conn; 
    String driver = "com.mysql.jdbc.Driver";
    int Tong=0;
    int TichLuy=0;
    int clicks=0; 
    Vector<Vector> cthd = new Vector<Vector>();
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDateTime now = LocalDateTime.now();
    String nowDate = dtf.format(now);
    
    public QLBanHang() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        this.setLocationRelativeTo(null);
        tbBanHang.getColumnModel().getColumn(1).setPreferredWidth(250);
        tbBanHang.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
                
        tbHoaDon.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbHoaDon.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbHoaDon.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbHoaDon.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        JTableHeader tableHeader = tbBanHang.getTableHeader();
        tableHeader.setBackground(new java.awt.Color(75, 139, 197));
        tableHeader.setForeground(Color.white);
        tableHeader.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        tbTraCuu.getColumnModel().getColumn(0).setPreferredWidth(110);
        tbTraCuu.getColumnModel().getColumn(1).setPreferredWidth(500);
        tbTraCuu.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbTraCuu.getColumnModel().getColumn(3).setPreferredWidth(200);
        tbTraCuu.getColumnModel().getColumn(4).setPreferredWidth(100);
        tbTraCuu.getColumnModel().getColumn(5).setPreferredWidth(250);
        tbTraCuu.getColumnModel().getColumn(6).setPreferredWidth(250);
        tbTraCuu.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        JTableHeader tableHeader1 = tbTraCuu.getTableHeader();
        tableHeader1.setBackground(new java.awt.Color(75, 139, 197));
        tableHeader1.setForeground(Color.white);
        tableHeader1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        
        
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
           
            String SQL = "SELECT MaLoai, TenLoai, GiaTien, DiemSanPham FROM loaihang WHERE TongSLHienTai > 0";    
            
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(SQL);
            Vector data = null;
            rs.last();
            int count;
            count = rs.getRow();
            
            
            rs.beforeFirst(); 
//            int i=0; 
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getString("MaLoai"));
                data.add(rs.getString("TenLoai"));
                data.add(rs.getString("GiaTien"));
                data.add(rs.getInt("DiemSanPham"));
                // Th??m m???t d??ng v??o table model
                DefaultTableModel defaultTable =(DefaultTableModel) tbBanHang.getModel();
                defaultTable.addRow(data);
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
    
    public  String getMaNhanVien(){
        String MNV = tfMaNhanVien.getText();
        return MNV;
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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        tfDiemDung = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        tfTichLuy = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfMaNhanVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfTimKiemMSP = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBanHang = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfTraCuu = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTraCuu = new javax.swing.JTable();
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuahangtienloi/Image/IconReload.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1890, 150, 30, 30);

        jPanel1.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("S??? ??i???n tho???i:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 110, 100, 15);

        tfSDT.setText("0792983750");
        tfSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSDTActionPerformed(evt);
            }
        });
        jPanel1.add(tfSDT);
        tfSDT.setBounds(110, 110, 180, 20);

        tfDiemDung.setText("3");
        tfDiemDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiemDungActionPerformed(evt);
            }
        });
        jPanel1.add(tfDiemDung);
        tfDiemDung.setBounds(110, 140, 100, 27);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("??i???m d??ng:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 140, 70, 15);

        jButton13.setText("Ch???n");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(220, 140, 70, 20);
        jPanel1.add(tfTichLuy);
        tfTichLuy.setBounds(350, 140, 80, 27);

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaSP", "T??n s???n ph???m", "??i???m s???n ph???m", "Gi??", "S??? l?????ng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbHoaDon);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(0, 190, 450, 330);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jButton1.setText("In h??a ????n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(220, 540, 200, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("L???p h??a ????n");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 30, 150, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("M?? nh??n vi??n:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 80, 90, 15);

        tfMaNhanVien.setText("NV01");
        tfMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMaNhanVienActionPerformed(evt);
            }
        });
        jPanel1.add(tfMaNhanVien);
        tfMaNhanVien.setBounds(110, 80, 60, 27);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuahangtienloi/Image/IconExtra.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 140, 30, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1420, 250, 450, 610);

        tfTimKiemMSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTimKiemMSPActionPerformed(evt);
            }
        });
        getContentPane().add(tfTimKiemMSP);
        tfTimKiemMSP.setBounds(420, 230, 210, 20);

        tbBanHang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbBanHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M?? s???n ph???m", "T??n s???n ph???m", "Gi??", "??i???m"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBanHang.setIntercellSpacing(new java.awt.Dimension(20, 10));
        tbBanHang.setRowHeight(30);
        tbBanHang.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tbBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBanHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbBanHang);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(420, 260, 800, 300);

        jButton3.setText("T??m");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(640, 230, 60, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("Tra c???u th??ng tin s???n ph???m");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(710, 620, 250, 24);

        jLabel13.setText("M?? s???n ph???m:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(430, 670, 87, 15);
        getContentPane().add(tfTraCuu);
        tfTraCuu.setBounds(520, 670, 130, 20);

        jButton4.setText("Tra c???u");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(660, 670, 80, 20);

        tbTraCuu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tbTraCuu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "M??", "T??n", "X.X???", "Gi??", "??i???m", "Ng.Nh???p", "HSD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTraCuu.setIntercellSpacing(new java.awt.Dimension(20, 10));
        tbTraCuu.setMinimumSize(new java.awt.Dimension(60, 0));
        tbTraCuu.setRowHeight(30);
        jScrollPane1.setViewportView(tbTraCuu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(420, 700, 800, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cuahangtienloi/Image/Background.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1920, 1090);

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
        this.dispose();
        DangNhap login = new DangNhap();
        login.setVisible(true);
        login.setExtendedState(login.getExtendedState() | DangNhap.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        QLBanHang reset = new QLBanHang();
        reset.setExtendedState(reset.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tfTimKiemMSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTimKiemMSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTimKiemMSPActionPerformed

    private void tfSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSDTActionPerformed

    private void tfDiemDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiemDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiemDungActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed


    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        DefaultTableModel dsHoaDon =(DefaultTableModel) tbHoaDon.getModel();
        
        int SL=0;
        
        
        for(int i = 0; i<clicks; i++){
            SL = Integer.parseInt(dsHoaDon.getValueAt(i,4).toString());
            cthd.get(i).add(SL);
            //fix l???i l???p c???t s??? khi add v??o.
            cthd.get(i).remove(4);
            
            int tien = Integer.parseInt(String.valueOf(cthd.get(i).get(3)));
            int ThanhTien = SL*tien;
            Tong = Tong + ThanhTien;
            cthd.get(i).add(ThanhTien);
            System.out.println(cthd);
        }
        
        String MNV = tfMaNhanVien.getText();
        String SDT = tfSDT.getText();
        String TL = tfTichLuy.getText();
        String DD = tfDiemDung.getText();
        
        int iDD = Integer.parseInt(tfDiemDung.getText());
        String strTong = String.valueOf(Tong);
        //if("Diem Du Sai")
        int GiamGia = iDD*1000;
        String strGiamGia = String.valueOf(GiamGia);
        int TongTien = Tong - GiamGia;
        String strTongTien = String.valueOf(TongTien);
                

         
        try {
                String urlUnicode = "jdbc:mysql://localhost:3306/quanlycuahang?user=root&password=&useUnicode=true&characterEncoding=utf8";
                String driver = "com.mysql.jdbc.Driver";
                Class.forName(driver).newInstance();
                conn = (Connection) DriverManager.getConnection(urlUnicode);
                        
                
                //L???y ??i???m t??ch l??y hi???n t???i c???a kh??ch h??ng
                String SQL2="SELECT TenNV FROM nhanvien WHERE MaNV = ? ";

                PreparedStatement stat2 = conn.prepareStatement(SQL2);
                stat2.setString(1,MNV);
                ResultSet rs2 = stat2.executeQuery();
                rs2.beforeFirst();
                rs2.next();
                String TNV = rs2.getString(1);

                MessageDialogHoaDon alert = new MessageDialogHoaDon();
                DefaultTableModel confirmHoaDon =(DefaultTableModel)  alert.getHoaDon().getModel();
                alert.setSize(480, 700);
                alert.getNhanVien().setText(TNV);
                alert.getNgayLap().setText(nowDate);
                alert.getKhachHang().setText(SDT);
                alert.getDiemTichLuy().setText(TL);
                alert.getTong().setText(strTong);
                alert.getGiamGia().setText(strGiamGia);
                alert.getTongTien().setText(strTongTien);
                
                for(int i = 0; i<clicks; i++){
                    
                    String MSP = dsHoaDon.getValueAt(i,0).toString();
                    String SQL5 = "SELECT TongSLHienTai,TenLoai FROM loaihang WHERE MaLoai = ?"; 
                    PreparedStatement stat5 = conn.prepareStatement(SQL5);
                    stat5.setString(1, MSP);

                    ResultSet rs5 = stat5.executeQuery();
                    rs5.next();
                    String TLoai = rs5.getString("TenLoai");
                    String strSLHT = rs5.getString("TongSLHienTai");
                    int SLHT = Integer.parseInt(strSLHT);
                    rs5.close();
                    stat5.close();
                    if(SLHT < SL){
                        String MessageAlert = TLoai+" ch??? c??n "+strSLHT+" !";
                        JOptionPane.showMessageDialog(null,MessageAlert,  "", JOptionPane.WARNING_MESSAGE);
                        break;
                        
                    }
                    
                    confirmHoaDon.addRow(cthd.get(i));
                }

                
            //  JOptionPane.showInputDialog("tet");

        } catch (SQLException ex) {
            Logger.getLogger(QLBanHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLBanHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(QLBanHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(QLBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void tbBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBanHangMouseClicked
        DefaultTableModel dsBanHang =(DefaultTableModel) tbBanHang.getModel();//L???y th??ng tin b??n
        DefaultTableModel dsHoaDon =(DefaultTableModel) tbHoaDon.getModel();
        int SelectedRows = tbBanHang.getSelectedRow();
        
        
        
        
        Vector data = new Vector();
        data.add(dsBanHang.getValueAt(SelectedRows,0).toString());
        data.add(dsBanHang.getValueAt(SelectedRows,1).toString());//Th??m th??ng tin v??o vector
        data.add(dsBanHang.getValueAt(SelectedRows,3).toString());
        data.add(dsBanHang.getValueAt(SelectedRows,2).toString());
        
        cthd.add(clicks,data);
        dsHoaDon.addRow(data);
        
        
        TichLuy = TichLuy + Integer.parseInt(dsBanHang.getValueAt(SelectedRows,3).toString());
        String strTichLuy = String.valueOf(TichLuy);
        tfTichLuy.setText(strTichLuy);
               
        clicks++;
        

    }//GEN-LAST:event_tbBanHangMouseClicked

    private void tfMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMaNhanVienActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        DefaultTableModel dsBanHang =(DefaultTableModel) tbBanHang.getModel();
        String keywordMSP = tfTimKiemMSP.getText();
        
        String keywordTSP = '%'+keywordMSP+'%';
        
        dsBanHang.setRowCount(0);
        
        try {
            //Load driver
            Class.forName(driver).newInstance();

           
            //K???t n???i v???i Font ch??? Unicode
            String urlUnicode = "jdbc:mysql://localhost:3306/quanlycuahang?user=root&password=&useUnicode=true&characterEncoding=utf8";
            //T???o k???t n???i
            conn = DriverManager.getConnection(urlUnicode); 
            //-----
            System.out.println("Connected to the database");
            System.out.println(keywordMSP);
            System.out.println(keywordTSP);
            String SQL = "SELECT MaLoai, TenLoai, GiaTien, DiemSanPham FROM loaihang WHERE MaLoai = ? OR TenLoai LIKE ?"; 
            
            
            PreparedStatement stat = conn.prepareStatement(SQL);
            stat.setString(1,keywordMSP);
            stat.setString(2,keywordTSP);
            
            ResultSet rs = stat.executeQuery();
            
            Vector data = null;
            rs.last();
            int count;
            count = rs.getRow();
            
            System.out.println(rs.getString("MaLoai"));
            
            rs.beforeFirst(); 
//            int i=0; 
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getString("MaLoai"));
                data.add(rs.getString("TenLoai"));
                data.add(rs.getString("GiaTien"));
                data.add(rs.getInt("DiemSanPham"));
                // Th??m m???t d??ng v??o table model
                DefaultTableModel defaultTable =(DefaultTableModel) tbBanHang.getModel();
                defaultTable.addRow(data);
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel dsBanHang =(DefaultTableModel) tbTraCuu.getModel();
        String keywordTraCuu = tfTraCuu.getText();
        
      
        dsBanHang.setRowCount(0);
        
        try {
            //Load driver
            Class.forName(driver).newInstance();

           
            //K???t n???i v???i Font ch??? Unicode
            String urlUnicode = "jdbc:mysql://localhost:3306/quanlycuahang?user=root&password=&useUnicode=true&characterEncoding=utf8";
            //T???o k???t n???i
            conn = DriverManager.getConnection(urlUnicode); 
            //-----
            System.out.println("Connected to the database");

            String SQL = "SELECT MaCTNH , TenLoai, XXu, GiaTien, DiemSanPham, NgNhap, NgHetHan FROM loaihang, nhaphang, ctnh WHERE MaCTNH = ? AND ctnh.MaLoHang=nhaphang.MaLoHang AND nhaphang.MaLoai=loaihang.MaLoai"; 
            
            PreparedStatement stat = conn.prepareStatement(SQL);
            stat.setString(1,keywordTraCuu);
            
            ResultSet rs = stat.executeQuery();
            
            Vector data = null;
            rs.last();
            int count;
            count = rs.getRow();
            
            rs.beforeFirst(); 
//            int i=0; 
            while (rs.next()) {
                data = new Vector();
                data.add(rs.getString("MaCTNH"));
                data.add(rs.getString("TenLoai"));
                data.add(rs.getString("XXu"));
                data.add(rs.getString("GiaTien"));
                data.add(rs.getInt("DiemSanPham"));
                data.add(rs.getString("NgNhap"));
                data.add(rs.getString("NgHetHan"));
                // Th??m m???t d??ng v??o table model
                DefaultTableModel defaultTable =(DefaultTableModel) tbTraCuu.getModel();
                defaultTable.addRow(data);
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
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(QLBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLBanHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLBanHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbBanHang;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbTraCuu;
    private javax.swing.JTextField tfDiemDung;
    private javax.swing.JTextField tfMaNhanVien;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfTichLuy;
    private javax.swing.JTextField tfTimKiemMSP;
    private javax.swing.JTextField tfTraCuu;
    // End of variables declaration//GEN-END:variables
}
