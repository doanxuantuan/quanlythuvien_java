/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.DAO;

import QLTV.POJO.DangNhap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84328
 */
public class DangNhap_DAO {
    static String id = "nv00";
    public static boolean checkAccount(DangNhap dn) {
        boolean kq = false;
        String sql = "select * from TAIKHOAN where TenDangNhap = '"+ dn.getTenDN() +"' and MatKhau = '"+ dn.getMatKhau() +"'";
        String sqlID = "select * from NHANVIEN where TenDangNhap = '"+ dn.getTenDN() +"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        try {
            ResultSet resultSet = provider.executeQuery(sql);
            if (resultSet.next()) {
                kq = true;
                ResultSet resultSetID = provider.executeQuery(sqlID);
                if (resultSetID.next()) 
                    id = resultSetID.getString("manv");
            }
            else kq = false;
        } catch (SQLException ex) {
            Logger.getLogger(DangNhap_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        provider.open();
        return kq;
    }
    
    public static boolean checkRoleAccount(DangNhap dn) {
        String sql = "select * from TAIKHOAN where Quyen = 'AD' and TenDangNhap = '"+ dn.getTenDN() +"' and MatKhau = '"+ dn.getMatKhau() +"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        try {
            ResultSet resultSet = provider.executeQuery(sql);
            if (resultSet.next())
                return true;
            else return false;
        } catch (SQLException ex) {
            Logger.getLogger(DangNhap_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        provider.open();
        return false;
    }
    
    public static String layMaNhanVien() {
        return id;
    }
}
