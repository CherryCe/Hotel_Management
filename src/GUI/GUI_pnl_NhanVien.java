/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author CherryCe
 */
public class GUI_pnl_NhanVien extends javax.swing.JPanel {

    /**
     * Creates new form GUI_pnl_NhanVien
     */
    public GUI_pnl_NhanVien() {
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

        scrNhanVien = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        lblChucVu = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblTenNhanVien = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblMaNhanVien = new javax.swing.JLabel();
        lblCCCD = new javax.swing.JLabel();
        lblLuong = new javax.swing.JLabel();
        lblSetTrangThai = new javax.swing.JLabel();
        lblNgayTao = new javax.swing.JLabel();
        lblQuanLiNhanVien = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtCCCD = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        dateNgayTao = new com.toedter.calendar.JDateChooser();
        cboGioiTinh = new javax.swing.JComboBox<>();
        cboChucVu = new javax.swing.JComboBox<>();
        dateNgaySinh = new com.toedter.calendar.JDateChooser();
        lblTrangThai = new javax.swing.JLabel();
        lblLamMoi = new javax.swing.JLabel();
        spt_1 = new javax.swing.JSeparator();
        lblThem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1150, 730));
        setPreferredSize(new java.awt.Dimension(1150, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrNhanVien.setBackground(new java.awt.Color(255, 255, 255));

        tblNhanVien.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Giới Tính", "Ngày Sinh", "Chức Vụ", "Số Điện Thoại", "CCCD", "Lương", "Ngày Tạo", "Trạng Thái", "Tài Khoản", "Sửa", "Xóa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setRowHeight(30);
        tblNhanVien.setShowHorizontalLines(false);
        scrNhanVien.setViewportView(tblNhanVien);

        add(scrNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1130, 430));

        lblChucVu.setBackground(new java.awt.Color(255, 255, 255));
        lblChucVu.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblChucVu.setForeground(new java.awt.Color(153, 153, 153));
        lblChucVu.setText("Chức Vụ");
        add(lblChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 60, 30));

        lblNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        lblNgaySinh.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNgaySinh.setForeground(new java.awt.Color(153, 153, 153));
        lblNgaySinh.setText("Ngày Sinh");
        add(lblNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 60, 30));

        lblTenNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lblTenNhanVien.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTenNhanVien.setForeground(new java.awt.Color(153, 153, 153));
        lblTenNhanVien.setText("Tên Nhân Viên");
        add(lblTenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, 30));

        lblSoDienThoai.setBackground(new java.awt.Color(255, 255, 255));
        lblSoDienThoai.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblSoDienThoai.setForeground(new java.awt.Color(153, 153, 153));
        lblSoDienThoai.setText("Số Điện Thoại");
        add(lblSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 30));

        lblGioiTinh.setBackground(new java.awt.Color(255, 255, 255));
        lblGioiTinh.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblGioiTinh.setForeground(new java.awt.Color(153, 153, 153));
        lblGioiTinh.setText("Giới Tính");
        add(lblGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 60, 30));

        lblMaNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lblMaNhanVien.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblMaNhanVien.setForeground(new java.awt.Color(153, 153, 153));
        lblMaNhanVien.setText("Mã Nhân Viên");
        add(lblMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 30));

        lblCCCD.setBackground(new java.awt.Color(255, 255, 255));
        lblCCCD.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblCCCD.setForeground(new java.awt.Color(153, 153, 153));
        lblCCCD.setText("CCCD");
        add(lblCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 40, 30));

        lblLuong.setBackground(new java.awt.Color(255, 255, 255));
        lblLuong.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblLuong.setForeground(new java.awt.Color(153, 153, 153));
        lblLuong.setText("Lương");
        add(lblLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 50, 30));

        lblSetTrangThai.setBackground(new java.awt.Color(255, 255, 255));
        lblSetTrangThai.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblSetTrangThai.setForeground(new java.awt.Color(62, 73, 95));
        lblSetTrangThai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        add(lblSetTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 80, 20));

        lblNgayTao.setBackground(new java.awt.Color(255, 255, 255));
        lblNgayTao.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblNgayTao.setForeground(new java.awt.Color(153, 153, 153));
        lblNgayTao.setText("Ngày Tạo");
        add(lblNgayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 60, 30));

        lblQuanLiNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lblQuanLiNhanVien.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        lblQuanLiNhanVien.setForeground(new java.awt.Color(62, 73, 95));
        lblQuanLiNhanVien.setText("QUẢN LÍ NHÂN VIÊN :");
        add(lblQuanLiNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        txtMaNhanVien.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtMaNhanVien.setForeground(new java.awt.Color(62, 73, 95));
        txtMaNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhanVienActionPerformed(evt);
            }
        });
        add(txtMaNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 20));

        txtTenNhanVien.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtTenNhanVien.setForeground(new java.awt.Color(62, 73, 95));
        txtTenNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtTenNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNhanVienActionPerformed(evt);
            }
        });
        add(txtTenNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, 20));

        txtSoDienThoai.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtSoDienThoai.setForeground(new java.awt.Color(62, 73, 95));
        txtSoDienThoai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDienThoaiActionPerformed(evt);
            }
        });
        add(txtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 20));

        txtCCCD.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtCCCD.setForeground(new java.awt.Color(62, 73, 95));
        txtCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDActionPerformed(evt);
            }
        });
        add(txtCCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, 20));

        txtLuong.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        txtLuong.setForeground(new java.awt.Color(62, 73, 95));
        txtLuong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuongActionPerformed(evt);
            }
        });
        add(txtLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 70, 20));

        dateNgayTao.setBackground(new java.awt.Color(255, 255, 255));
        dateNgayTao.setForeground(new java.awt.Color(62, 73, 95));
        dateNgayTao.setDateFormatString("dd-MM-yyyy");
        add(dateNgayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 90, 20));

        cboGioiTinh.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cboGioiTinh.setForeground(new java.awt.Color(62, 73, 95));
        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboGioiTinh.setBorder(null);
        add(cboGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 70, 20));

        cboChucVu.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        cboChucVu.setForeground(new java.awt.Color(62, 73, 95));
        cboChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChucVu.setBorder(null);
        add(cboChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 80, 20));

        dateNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        dateNgaySinh.setForeground(new java.awt.Color(62, 73, 95));
        dateNgaySinh.setDateFormatString("dd-MM-yyyy");
        add(dateNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 90, 20));

        lblTrangThai.setBackground(new java.awt.Color(255, 255, 255));
        lblTrangThai.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblTrangThai.setForeground(new java.awt.Color(153, 153, 153));
        lblTrangThai.setText("Trạng Thái");
        add(lblTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 70, 30));

        lblLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        lblLamMoi.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblLamMoi.setForeground(new java.awt.Color(33, 150, 243));
        lblLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add (1).png"))); // NOI18N
        lblLamMoi.setText("Làm Mới");
        lblLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLamMoiMouseClicked(evt);
            }
        });
        add(lblLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 180, 90, 30));

        spt_1.setForeground(new java.awt.Color(62, 73, 95));
        add(spt_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1110, 20));

        lblThem.setBackground(new java.awt.Color(255, 255, 255));
        lblThem.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblThem.setForeground(new java.awt.Color(33, 150, 243));
        lblThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add (1).png"))); // NOI18N
        lblThem.setText("Thêm");
        lblThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThemMouseClicked(evt);
            }
        });
        add(lblThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 180, 70, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhanVienActionPerformed

    private void txtTenNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNhanVienActionPerformed

    private void txtSoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDienThoaiActionPerformed

    private void txtCCCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDActionPerformed

    private void txtLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuongActionPerformed

    private void lblLamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLamMoiMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblLamMoiMouseClicked

    private void lblThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblThemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboChucVu;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private com.toedter.calendar.JDateChooser dateNgaySinh;
    private com.toedter.calendar.JDateChooser dateNgayTao;
    private javax.swing.JLabel lblCCCD;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblLamMoi;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaNhanVien;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblQuanLiNhanVien;
    private javax.swing.JLabel lblSetTrangThai;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTenNhanVien;
    private javax.swing.JLabel lblThem;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JScrollPane scrNhanVien;
    private javax.swing.JSeparator spt_1;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtCCCD;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
