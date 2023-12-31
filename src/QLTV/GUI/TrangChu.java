/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package QLTV.GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienChinh
     */
    public TrangChu(String user) {
        this.setTitle("Quản lý Thư viện");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        initComponents();
        //set_Layout_Root();
        txtUser.setText(user);
    }
    
    public TrangChu() {
        this.setTitle("Quản lý Thư viện");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //set_Layout_Root();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQLNV = new javax.swing.JButton();
        btnQLS = new javax.swing.JButton();
        btnQLDG = new javax.swing.JButton();
        btnQLMT = new javax.swing.JButton();
        btnPP = new javax.swing.JButton();
        btnQLMuon = new javax.swing.JButton();
        btnQLTra = new javax.swing.JButton();
        pnl_Main = new javax.swing.JDesktopPane();
        icon = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        Nen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnQLNV.setBackground(new java.awt.Color(255, 153, 153));
        btnQLNV.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLNV.setForeground(new java.awt.Color(255, 102, 0));
        btnQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thiết kế chưa có tên (3).png"))); // NOI18N
        btnQLNV.setText("Quản lý Nhân viên");
        btnQLNV.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        btnQLNV.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLNV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLNV.setPreferredSize(new java.awt.Dimension(1800, 1086));
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNVActionPerformed(evt);
            }
        });
        getContentPane().add(btnQLNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 200, 80));

        btnQLS.setBackground(new java.awt.Color(255, 153, 153));
        btnQLS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLS.setForeground(new java.awt.Color(255, 102, 0));
        btnQLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thiết kế chưa có tên (3).png"))); // NOI18N
        btnQLS.setText("Quản lý Tài liệu");
        btnQLS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        btnQLS.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSActionPerformed(evt);
            }
        });
        getContentPane().add(btnQLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, 80));

        btnQLDG.setBackground(new java.awt.Color(255, 153, 153));
        btnQLDG.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLDG.setForeground(new java.awt.Color(255, 102, 0));
        btnQLDG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thiết kế chưa có tên (3).png"))); // NOI18N
        btnQLDG.setText("Quản lý Đọc giả");
        btnQLDG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        btnQLDG.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLDG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDGActionPerformed(evt);
            }
        });
        getContentPane().add(btnQLDG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 200, 80));

        btnQLMT.setBackground(new java.awt.Color(255, 153, 153));
        btnQLMT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLMT.setForeground(new java.awt.Color(255, 102, 0));
        btnQLMT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thiết kế chưa có tên (3).png"))); // NOI18N
        btnQLMT.setText("Quản lý Mượn - Trả");
        btnQLMT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        btnQLMT.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLMT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLMT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMTActionPerformed(evt);
            }
        });
        getContentPane().add(btnQLMT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 200, 80));

        btnPP.setBackground(new java.awt.Color(255, 153, 153));
        btnPP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPP.setForeground(new java.awt.Color(255, 102, 0));
        btnPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thiết kế chưa có tên (3).png"))); // NOI18N
        btnPP.setText("Quản lý Phiếu Phạt");
        btnPP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        btnPP.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnPP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPPActionPerformed(evt);
            }
        });
        getContentPane().add(btnPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 200, 80));

        btnQLMuon.setBackground(new java.awt.Color(255, 153, 153));
        btnQLMuon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLMuon.setForeground(new java.awt.Color(255, 102, 0));
        btnQLMuon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thiết kế chưa có tên (3).png"))); // NOI18N
        btnQLMuon.setText("Quản lý Mượn");
        btnQLMuon.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        btnQLMuon.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLMuon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMuonActionPerformed(evt);
            }
        });
        getContentPane().add(btnQLMuon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-111, -111, 160, 50));

        btnQLTra.setBackground(new java.awt.Color(255, 153, 153));
        btnQLTra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnQLTra.setForeground(new java.awt.Color(255, 102, 0));
        btnQLTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thiết kế chưa có tên (3).png"))); // NOI18N
        btnQLTra.setText("Quản lý Trả");
        btnQLTra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null, new java.awt.Color(255, 255, 255)));
        btnQLTra.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLTra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTraActionPerformed(evt);
            }
        });
        getContentPane().add(btnQLTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-111, -111, 160, 50));

        pnl_Main.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_Main.setMaximumSize(new java.awt.Dimension(899, 555));
        pnl_Main.setMinimumSize(new java.awt.Dimension(899, 555));
        getContentPane().add(pnl_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 865, 555));

        icon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hopstarter-Soft-Scraps-User-Administrator-Blue.16.png"))); // NOI18N
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 20, 30));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logout.setLabelFor(this);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 40, 30));

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUser.setText("User");
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 110, 30));

        Nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thiết kế chưa có tên (1).png"))); // NOI18N
        Nen.setMaximumSize(new java.awt.Dimension(990, 600));
        Nen.setMinimumSize(new java.awt.Dimension(990, 600));
        Nen.setPreferredSize(new java.awt.Dimension(990, 600));
        getContentPane().add(Nen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDGActionPerformed
        set_Layout_Root();
        QL_DocGia qLDocGia = new QL_DocGia();
        // ẩn tiêu đề
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= qLDocGia.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null); 
        //
        qLDocGia.setVisible(true);
        this.pnl_Main.removeAll();
        this.pnl_Main.add(qLDocGia);
    }//GEN-LAST:event_btnQLDGActionPerformed

    private void btnPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPPActionPerformed
        set_Layout_Root();
        QL_PhieuPhat qLPhieuPhat = new QL_PhieuPhat();
        // ẩn tiêu đề
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= qLPhieuPhat.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null); 
        //
        qLPhieuPhat.setVisible(true);
        this.pnl_Main.removeAll();
        this.pnl_Main.add(qLPhieuPhat);
    }//GEN-LAST:event_btnPPActionPerformed

    private void btnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNVActionPerformed
        set_Layout_Root();
        QL_NhanVien qLNhanVien = new QL_NhanVien();
        // ẩn tiêu đề
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= qLNhanVien.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null); 
        //
        qLNhanVien.setVisible(true);
        this.pnl_Main.removeAll();
        this.pnl_Main.add(qLNhanVien);
    }//GEN-LAST:event_btnQLNVActionPerformed

    private void btnQLMTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMTActionPerformed
        btnQLNV.setSize(200, 60);
        btnQLS.setSize(200, 60);
        btnQLDG.setSize(200, 60);
        btnQLMT.setSize(200, 60);
        btnPP.setSize(200, 60);
        
        btnQLNV.setLocation(10, 70);
        btnQLS.setLocation(10, 150);
        btnQLDG.setLocation(10, 230);
        btnQLMT.setLocation(10, 310);
        btnPP.setLocation(10, 510);
        
        btnQLMuon.setLocation(30, 380);
        btnQLTra.setLocation(30, 440);
    }//GEN-LAST:event_btnQLMTActionPerformed

    private void btnQLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSActionPerformed
        set_Layout_Root();
        QL_TaiLieu qLSach = new QL_TaiLieu();
        // ẩn tiêu đề
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= qLSach.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null); 
        //
        qLSach.setVisible(true);
        this.pnl_Main.removeAll();
        this.pnl_Main.add(qLSach);
    }//GEN-LAST:event_btnQLSActionPerformed

    private void btnQLTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTraActionPerformed
        QL_TraTaiLieu qLTra = new QL_TraTaiLieu();
        // ẩn tiêu đề
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= qLTra.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null); 
        //
        qLTra.setVisible(true);
        this.pnl_Main.removeAll();
        this.pnl_Main.add(qLTra);
    }//GEN-LAST:event_btnQLTraActionPerformed

    private void btnQLMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMuonActionPerformed
        QL_MuonTaiLieu qLMuon = new QL_MuonTaiLieu();
        // ẩn tiêu đề
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu= qLMuon.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null); 
        //
        qLMuon.setVisible(true);
        this.pnl_Main.removeAll();
        this.pnl_Main.add(qLMuon);
    }//GEN-LAST:event_btnQLMuonActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int logout = JOptionPane.showConfirmDialog(null, "Bạn muốn đăng xuất ?", "Thông báo",JOptionPane.YES_NO_CANCEL_OPTION);
        if (logout == 0) {
            this.setVisible(false);
            DangNhap_GUI dangNhap_GUI = new DangNhap_GUI();
            dangNhap_GUI.setLocationRelativeTo(null);
            dangNhap_GUI.setVisible(true);
        }
    }//GEN-LAST:event_logoutMouseClicked

    public void set_Enable_False() {
        btnQLNV.setEnabled(false);
    }
    
    private void set_Layout_Root() {
        btnQLNV.setSize(200, 80);
        btnQLS.setSize(200, 80);
        btnQLDG.setSize(200, 80);
        btnQLMT.setSize(200, 80);
        btnPP.setSize(200, 80);
        
        btnQLNV.setLocation(10, 70);
        btnQLS.setLocation(10, 170);
        btnQLDG.setLocation(10, 270);
        btnQLMT.setLocation(10, 370);
        btnPP.setLocation(10, 470);
        btnQLMuon.setLocation(-100, -100);
        btnQLTra.setLocation(-100, -100);
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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nen;
    private javax.swing.JButton btnPP;
    private javax.swing.JButton btnQLDG;
    private javax.swing.JButton btnQLMT;
    private javax.swing.JButton btnQLMuon;
    private javax.swing.JButton btnQLNV;
    private javax.swing.JButton btnQLS;
    private javax.swing.JButton btnQLTra;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel logout;
    private javax.swing.JDesktopPane pnl_Main;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
