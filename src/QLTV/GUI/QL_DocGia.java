/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package QLTV.GUI;

import QLTV.DAO.DocGia_DAO;
import QLTV.POJO.DocGia;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class QL_DocGia extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    boolean check = false;
    /**
     * Creates new form QL_DocGiaNew
     */
    public QL_DocGia() {
        initComponents();
        dtm.addColumn("Mã Đọc giả");
        dtm.addColumn("Họ Tên");
        dtm.addColumn("Ngày Sinh");
        dtm.addColumn("Địa Chỉ");
        dtm.addColumn("Lớp");
        dtm.addColumn("Khoa");
        dtm.addColumn("Email");        
        dtm.addColumn("Số Điện Thoại");
        setEnable_False();
        hienThiDanhSach();
        tblDSDocGia.setModel(dtm);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaDG = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtLop = new javax.swing.JTextField();
        txtKhoa = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        lblAVT = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSDocGia = new javax.swing.JTable();
        nen = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(865, 555));
        setMinimumSize(new java.awt.Dimension(865, 555));
        setPreferredSize(new java.awt.Dimension(865, 555));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("QUẢN LÍ ĐỌC GIẢ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel11)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 770, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin đọc giả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 153, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Mã đọc giả:");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Họ Tên:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Ngày sinh:");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Địa chỉ:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Số điện thoại:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Lớp:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("Khoa:");

        txtMaDG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaDG.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDGActionPerformed(evt);
            }
        });

        txtHoTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHoTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        txtNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgaySinh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySinhActionPerformed(evt);
            }
        });

        txtDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiaChi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        txtLop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLop.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLopActionPerformed(evt);
            }
        });

        txtKhoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtKhoa.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKhoaActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSDT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        lblAVT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        lblAVT.setText("Avatar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(lblAVT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblAVT, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 750, 190));

        btnThem.setBackground(new java.awt.Color(255, 204, 51));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(102, 0, 102));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 90, -1));

        btnXoa.setBackground(new java.awt.Color(255, 204, 51));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(102, 0, 102));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 90, -1));

        btnSua.setBackground(new java.awt.Color(255, 204, 51));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(102, 0, 102));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 90, -1));

        btnMoi.setBackground(new java.awt.Color(255, 204, 51));
        btnMoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMoi.setForeground(new java.awt.Color(102, 0, 102));
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        getContentPane().add(btnMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 90, -1));

        txtTimKiem.setBackground(new java.awt.Color(204, 255, 204));
        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 410, -1));

        btnTKiem.setBackground(new java.awt.Color(255, 204, 51));
        btnTKiem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTKiem.setForeground(new java.awt.Color(102, 0, 102));
        btnTKiem.setText("Tìm kiếm");
        btnTKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btnTKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 170, -1));

        tblDSDocGia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblDSDocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Ca trực", "Tên đăng nhập", "Đăng nhập gần nhất", "Loại nhân viên"
            }
        ));
        tblDSDocGia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDSDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSDocGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSDocGia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 760, 190));

        nen.setBackground(java.awt.Color.pink);
        nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nen.png"))); // NOI18N
        nen.setMaximumSize(new java.awt.Dimension(865, 555));
        nen.setMinimumSize(new java.awt.Dimension(865, 555));
        nen.setOpaque(true);
        nen.setPreferredSize(new java.awt.Dimension(865, 555));
        getContentPane().add(nen, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 5, 865, 555));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(txtHoTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Họ tên Đọc giả !!!");
            txtHoTen.requestFocus();
            return;
        } else if(txtLop.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Lớp của Đọc giả !!!");
            txtLop.requestFocus();
            return;
        } else if(txtKhoa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Khoa của Đọc giả !!!");
            txtKhoa.requestFocus();
            return;
        }
        
        String maDG, tenDG, ngaySinh, diaChi, lop, khoa, mail, sdt;
        maDG = txtMaDG.getText();
        tenDG = txtHoTen.getText();
        ngaySinh = txtNgaySinh.getText();
        diaChi = txtDiaChi.getText();
        lop = txtLop.getText();
        khoa = txtKhoa.getText();
        mail = txtEmail.getText();
        sdt = txtSDT.getText(); 
        
        DocGia dg = new DocGia();
        dg.setMaDG(maDG);
        dg.setTenDG(tenDG);
        Date NgaySinh = null;
        try { 
            NgaySinh = Date.valueOf(ngaySinh);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nhập sai Ngày Sinh!! Định dạng: yyyy-MM-dd");
            txtNgaySinh.setText("");
            txtNgaySinh.requestFocus();
            return;
        }
        dg.setNgaySinh(NgaySinh);
        dg.setDiaChi(diaChi);
        dg.setKhoa(khoa);
        dg.setLop(lop);
        dg.setMail(mail);
        dg.setSdt(sdt);
        
        boolean kq = DocGia_DAO.themDocGia(dg);
        if (kq == true) {
            JOptionPane.showMessageDialog(this, "Thêm Đọc giả Thành công !!");
            setEnable_False();
            hienThiDanhSach();
        }
        else JOptionPane.showMessageDialog(this, "Thêm Đọc giả Thất Bại");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKiemActionPerformed
        String str = txtTimKiem.getText();
        ArrayList<DocGia> ds = DocGia_DAO.layDSDocGiaTheoYC(str);
        dtm.setRowCount(0);
        for(DocGia dg: ds) {
            Vector<Object> v = new Vector<Object>();
            v.add(dg.getMaDG());
            v.add(dg.getTenDG());
            v.add(dg.getNgaySinh());
            v.add(dg.getDiaChi());
            v.add(dg.getLop());
            v.add(dg.getKhoa());
            v.add(dg.getMail());
            v.add(dg.getSdt());
            dtm.addRow(v);
        }
        tblDSDocGia.setModel(dtm);
    }//GEN-LAST:event_btnTKiemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (txtMaDG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Đọc giả !!!");
            return;
        }
        int delete = JOptionPane.showConfirmDialog(null, "Chắc chắn muốn Xóa Đọc giả có mã: "+txtMaDG.getText()+" ?", "Thông báo",JOptionPane.YES_NO_CANCEL_OPTION);
        if (delete == 0) {
            boolean kq = DocGia_DAO.xoaDocGia(txtMaDG.getText());
            if (kq == true) {
                JOptionPane.showMessageDialog(this, "Xóa Đọc giả Thành công !!");
                setEnable_False();
                hienThiDanhSach();
            }
            else JOptionPane.showMessageDialog(this, "Xóa Đọc giả Thất Bại");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (txtMaDG.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Đọc giả !!!");
            check = false; 
            return;
        }
        if (check) {
            String maDG, tenDG, ngaySinh, diaChi, lop, khoa, mail, sdt;
            maDG = txtMaDG.getText();
            tenDG = txtHoTen.getText();
            ngaySinh = txtNgaySinh.getText();
            diaChi = txtDiaChi.getText();
            lop = txtLop.getText();
            khoa = txtKhoa.getText();
            mail = txtEmail.getText();
            sdt = txtSDT.getText(); 

            DocGia dg = new DocGia();
            dg.setMaDG(maDG);
            dg.setTenDG(tenDG);
            Date NgaySinh = null;
            try { 
                NgaySinh = Date.valueOf(ngaySinh);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Nhập sai Ngày Sinh!! Định dạng: yyyy-MM-dd");
                txtNgaySinh.setText("");
                txtNgaySinh.requestFocus();
                return;
            }
            dg.setNgaySinh(NgaySinh);
            dg.setDiaChi(diaChi);
            dg.setKhoa(khoa);
            dg.setLop(lop);
            dg.setMail(mail);
            dg.setSdt(sdt);
            
            boolean kq = DocGia_DAO.suaDocGia(dg);
            if (kq == true) {
                JOptionPane.showMessageDialog(this, "Cập nhật Đọc giả có mã: " + txtMaDG.getText() + " thành công!!!");
                setEnable_False();
                hienThiDanhSach();
            }
            else JOptionPane.showMessageDialog(this, "Cập nhật Thông tin Đọc giả Thất Bại !");
            btnSua.setText("Sửa");
            check = false;
        } else {
            int update = JOptionPane.showConfirmDialog(null, "Chỉnh sửa Đọc giả có mã: "+txtMaDG.getText()+" ?", "Thông báo",JOptionPane.YES_NO_CANCEL_OPTION);
            if (update == 0) {
                check = true;
                setEnable_True();
                btnSua.setText("Lưu");
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        btnThem.setEnabled(true);
        String str = "DG", strMa = "";
        int sl = tblDSDocGia.getRowCount() - 1;
        strMa = (String) String.valueOf(tblDSDocGia.getValueAt(sl, 0));
        strMa = strMa.substring(2, 4);
        int num = Integer. parseInt(strMa) + 1;
        if (num < 10)
           str = "DG0" + num;
        else str = "DG" + num;
        txtMaDG.setText(str);
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtHoTen.setText("");
        txtKhoa.setText("");
        txtLop.setText("");
        txtNgaySinh.setText("");
        txtSDT.setText("");
        setEnable_True();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void tblDSDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSDocGiaMouseClicked
        int row = this.tblDSDocGia.getSelectedRow();
        txtMaDG.setText((String) tblDSDocGia.getValueAt(row, 0));
        txtHoTen.setText((String) tblDSDocGia.getValueAt(row, 1));
        txtNgaySinh.setText((String) String.valueOf(tblDSDocGia.getValueAt(row, 2)));
        txtDiaChi.setText((String) tblDSDocGia.getValueAt(row, 3));
        txtLop.setText((String) tblDSDocGia.getValueAt(row, 4));
        txtKhoa.setText((String) tblDSDocGia.getValueAt(row, 5));
        txtEmail.setText((String) tblDSDocGia.getValueAt(row, 6));
        txtSDT.setText((String) tblDSDocGia.getValueAt(row, 7));
    }//GEN-LAST:event_tblDSDocGiaMouseClicked

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKhoaActionPerformed

    private void txtLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLopActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySinhActionPerformed

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void txtMaDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDGActionPerformed

    private void setEnable_False() {
        txtMaDG.setEnabled(false);
        txtDiaChi.setEnabled(false);
        txtSDT.setEnabled(false);
        txtEmail.setEnabled(false);
        txtKhoa.setEnabled(false);
        txtNgaySinh.setEnabled(false);
        txtHoTen.setEnabled(false);
        txtLop.setEnabled(false);
        btnThem.setEnabled(false);
    }
    
    private void setEnable_True() {
        txtDiaChi.setEnabled(true);
        txtSDT.setEnabled(true);
        txtEmail.setEnabled(true);
        txtKhoa.setEnabled(true);
        txtNgaySinh.setEnabled(true);
        txtHoTen.setEnabled(true);
        txtLop.setEnabled(true);
    }
    
    private void hienThiDanhSach() {
        ArrayList<DocGia> ds = DocGia_DAO.layDSDocGia();
        dtm.setRowCount(0);
        for(DocGia dg: ds) {
            Vector<Object> v = new Vector<Object>();
            v.add(dg.getMaDG());
            v.add(dg.getTenDG());
            v.add(dg.getNgaySinh());
            v.add(dg.getDiaChi());
            v.add(dg.getLop());
            v.add(dg.getKhoa());
            v.add(dg.getMail());
            v.add(dg.getSdt());
            dtm.addRow(v);
        }
        tblDSDocGia.setModel(dtm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTKiem;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAVT;
    private javax.swing.JLabel nen;
    private javax.swing.JTable tblDSDocGia;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
