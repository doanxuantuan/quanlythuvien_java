/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.DAO;

import QLTV.POJO.TaiLieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 84328
 */
public class TaiLieu_DAO {
    public static ArrayList<TaiLieu> layDSTaiLieu() {
        ArrayList<TaiLieu> ds = new ArrayList<TaiLieu>();
        try {
            String sql = "select * from TaiLieu";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                TaiLieu tl = new TaiLieu();
                    tl.setMaTaiLieu(resultSet.getString("MaTaiLieu"));
                    tl.setTenTaiLieu(resultSet.getString("TenTaiLieu"));
                    tl.setTacGia(resultSet.getString("TacGia"));
                    tl.setSoLuong(resultSet.getInt("TongSo"));
                    tl.setConLai(resultSet.getInt("ConLai"));
                    tl.setGiaBan(resultSet.getInt("Gia"));
                    tl.setAnh(resultSet.getString("Anh"));
                    ds.add(tl);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<TaiLieu> layDSTaiLieuTheoTen(String ten) {
        ArrayList<TaiLieu> ds = new ArrayList<TaiLieu>();
        try {
            String sql = "SELECT * FROM TAILIEU WHERE TacGia like N'%"+ten+"%' or TenTaiLieu like N'%"+ten+"%' or MaTaiLieu like N'%"+ten+"%'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                TaiLieu tl = new TaiLieu();
                    tl.setMaTaiLieu(resultSet.getString("MaTaiLieu"));
                    tl.setTenTaiLieu(resultSet.getString("TenTaiLieu"));
                    tl.setTacGia(resultSet.getString("TacGia"));
                    tl.setSoLuong(resultSet.getInt("TongSo"));
                    tl.setConLai(resultSet.getInt("ConLai"));
                    tl.setGiaBan(resultSet.getInt("Gia"));
                    tl.setAnh(resultSet.getString("Anh"));
                    ds.add(tl);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<String> layDSMaTaiLieu() {
        ArrayList<String> ds = new ArrayList<String>();
        try {
            String sql = "select * from TAILIEU";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                ds.add(resultSet.getString("MaTaiLieu"));
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static boolean themTaiLieu(TaiLieu tl) {
        boolean kq = false;
        String sql = "INSERT INTO TAILIEU VALUES(N'"+tl.getMaTaiLieu()+"',N'"+tl.getTenTaiLieu()+"',N'"+tl.getTacGia()+"',"+tl.getSoLuong()+","+tl.getConLai()+","+tl.getGiaBan()+",N'"+tl.getAnh()+"')";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if (n == 1) kq = true;
        provider.close();
        return kq;
    }
    
    public static boolean nhapTaiLieu(TaiLieu tl, int n) throws SQLException {
        boolean kq = false;
        int ts = 0;
        int cl = 0;
        String sql = "select * from TaiLieu where matailieu = '"+tl.getMaTaiLieu()+"'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                 ts = resultSet.getInt("tongso");
                 cl= resultSet.getInt("conlai");
            }
            ts+=n;
            cl+=n;
           String sqlx = "update TAILIEU set tongso = '"+ts+"', conlai = '"+cl+"' where matailieu = '"+tl.getMaTaiLieu()+"'";
        
        int x = provider.executeUpdate(sqlx);
        if (x == 1) kq = true;
        provider.close();
        return kq;
    }
    
    public static TaiLieu layThongTinTaiLieu(String ma) {
        TaiLieu tl = new TaiLieu();
        try {
            String sql = "SELECT * FROM TAILIEU WHERE MaTaiLieu = '" + ma + "'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                    tl.setMaTaiLieu(resultSet.getString("MaTaiLieu"));
                    tl.setTenTaiLieu(resultSet.getString("TenTaiLieu"));
                    tl.setTacGia(resultSet.getString("TacGia"));
                    tl.setSoLuong(resultSet.getInt("TongSo"));
                    tl.setConLai(resultSet.getInt("ConLai"));
                    tl.setGiaBan(resultSet.getInt("Gia"));
                    tl.setAnh(resultSet.getString("Anh"));
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tl;
    }
            
    public static boolean xoaTaiLieu(String ma) {
        boolean kq = false;
        String sql = String.format("Delete from TAILIEU where matailieu = ('%s');", ma);
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if (n == 1) kq = true;
        provider.close();
        return kq;
    }
    
    public static boolean suaTaiLieu(TaiLieu tl)
    {
        boolean kq = false;
        String sql = "update TAILIEU set tentailieu = '"+tl.getTenTaiLieu()+"', tacgia = '"+tl.getTacGia()+"', tongso = '"+tl.getSoLuong()+"', conlai = '"+tl.getConLai()+"', gia = '"+tl.getGiaBan()+"', anh = '"+tl.getAnh()+"'  where matailieu = '"+tl.getMaTaiLieu()+"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if (n == 1) kq = true;
        provider.close();
        return kq;
    }
    
    public static String layTenTaiLieu(String ma) {
        String tenTaiLieu = "error";
        try {
            String sql = "select * from TaiLieu where matailieu = '"+ma+"'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                tenTaiLieu = resultSet.getString("TenTaiLieu");
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tenTaiLieu;
    }
    
    public static int layGiaTaiLieu(String ma) {
        int gia = -1;
        try {
            String sql = "select * from TaiLieu where matailieu = '"+ma+"'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                gia = resultSet.getInt("Gia");
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return gia;
    }
}
