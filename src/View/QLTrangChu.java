package View;

import java.awt.BorderLayout;

public class QLTrangChu extends javax.swing.JFrame {

    public QLTrangChu() {
        initComponents();
        
        QLBanHangJPN new_one = new QLBanHangJPN();
        this.jpnView.removeAll();
        this.jpnView.setLayout(new BorderLayout());
        this.jpnView.add(new_one);
        this.jpnView.validate();
        this.jpnView.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        btnBanHang = new javax.swing.JButton();
        btnThanhVien = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnKhoHang = new javax.swing.JButton();
        btnKhoHang1 = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 500));
        setResizable(false);

        btnBanHang.setBackground(new java.awt.Color(75, 139, 197));
        btnBanHang.setFont(new java.awt.Font("DejaVu Sans", 1, 22)); // NOI18N
        btnBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnBanHang.setText("Bán Hàng");
        btnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBanHangMouseClicked(evt);
            }
        });

        btnThanhVien.setBackground(new java.awt.Color(75, 139, 197));
        btnThanhVien.setFont(new java.awt.Font("DejaVu Sans", 1, 22)); // NOI18N
        btnThanhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnThanhVien.setText("Thành Viên");
        btnThanhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThanhVienMouseClicked(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(75, 139, 197));
        btnNhanVien.setFont(new java.awt.Font("DejaVu Sans", 1, 22)); // NOI18N
        btnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
        });
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(75, 139, 197));
        btnThongKe.setFont(new java.awt.Font("DejaVu Sans", 1, 22)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setText("Thống Kê");
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeMouseClicked(evt);
            }
        });

        btnKhoHang.setBackground(new java.awt.Color(75, 139, 197));
        btnKhoHang.setFont(new java.awt.Font("DejaVu Sans", 1, 22)); // NOI18N
        btnKhoHang.setForeground(new java.awt.Color(255, 255, 255));
        btnKhoHang.setText("Kho Hàng");
        btnKhoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhoHangMouseClicked(evt);
            }
        });

        btnKhoHang1.setBackground(new java.awt.Color(75, 139, 197));
        btnKhoHang1.setFont(new java.awt.Font("DejaVu Sans", 1, 22)); // NOI18N
        btnKhoHang1.setForeground(new java.awt.Color(255, 255, 255));
        btnKhoHang1.setText("Đăng Xuất");
        btnKhoHang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhoHang1MouseClicked(evt);
            }
        });
        btnKhoHang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoHang1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThanhVien, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhoHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhoHang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnThanhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnKhoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnKhoHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jpnRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseClicked
        QLBanHangJPN new_one = new QLBanHangJPN();
        this.jpnView.removeAll();
        this.jpnView.setLayout(new BorderLayout());
        this.jpnView.add(new_one);
        this.jpnView.validate();
        this.jpnView.repaint();
    }//GEN-LAST:event_btnBanHangMouseClicked

    private void btnThanhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThanhVienMouseClicked
        QLKhachHangJPN new_one = new QLKhachHangJPN();
        this.jpnView.removeAll();
        this.jpnView.setLayout(new BorderLayout());
        this.jpnView.add(new_one);
        this.jpnView.validate();
        this.jpnView.repaint();
    }//GEN-LAST:event_btnThanhVienMouseClicked

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
        QLNhanSuJPN new_one = new QLNhanSuJPN();
        this.jpnView.removeAll();
        this.jpnView.setLayout(new BorderLayout());
        this.jpnView.add(new_one);
        this.jpnView.validate();
        this.jpnView.repaint();
    }//GEN-LAST:event_btnNhanVienMouseClicked

    private void btnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseClicked
        QLThongKeJPN new_one = new QLThongKeJPN();
        this.jpnView.removeAll();
        this.jpnView.setLayout(new BorderLayout());
        this.jpnView.add(new_one);
        this.jpnView.validate();
        this.jpnView.repaint();
    }//GEN-LAST:event_btnThongKeMouseClicked

    private void btnKhoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoHangMouseClicked
        QLKhoHangJPN new_one = new QLKhoHangJPN();
        this.jpnView.removeAll();
        this.jpnView.setLayout(new BorderLayout());
        this.jpnView.add(new_one);
        this.jpnView.validate();
        this.jpnView.repaint();
    }//GEN-LAST:event_btnKhoHangMouseClicked

    private void btnKhoHang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoHang1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKhoHang1MouseClicked

    private void btnKhoHang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoHang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKhoHang1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLTrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLTrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnKhoHang;
    private javax.swing.JButton btnKhoHang1;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnThanhVien;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
