/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.DAO;

import QLTV.POJO.DocGia;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 84328
 */
public class DocGia_DAO {
    public static ArrayList<DocGia> layDSDocGia() {
        ArrayList<DocGia> ds = new ArrayList<DocGia>();
        try {
            String sql = "select * from docgia";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                DocGia dg = new DocGia();
                dg.setMaDG(resultSet.getString("madocgia"));
                dg.setTenDG(resultSet.getString("hoten"));
                dg.setNgaySinh(resultSet.getDate("ngaysinh"));
                dg.setDiaChi(resultSet.getString("diachi"));
                dg.setLop(resultSet.getString("lop"));
                dg.setKhoa(resultSet.getString("khoa"));
                dg.setMail(resultSet.getString("Email"));
                dg.setSdt(resultSet.getString("sdt"));
                ds.add(dg);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<DocGia> layDSDocGiaTheoYC(String str) {
        ArrayList<DocGia> ds = new ArrayList<DocGia>();
        try {
            String sql = "SELECT * FROM DOCGIA WHERE HoTen like N'%"+str+"%' or Lop like N'%"+str+"%' or Khoa like N'%"+str+"%'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                DocGia dg = new DocGia();
                dg.setMaDG(resultSet.getString("madocgia"));
                dg.setTenDG(resultSet.getString("hoten"));
                dg.setNgaySinh(resultSet.getDate("ngaysinh"));
                dg.setDiaChi(resultSet.getString("diachi"));
                dg.setLop(resultSet.getString("lop"));
                dg.setKhoa(resultSet.getString("khoa"));
                dg.setMail(resultSet.getString("Email"));
                dg.setSdt(resultSet.getString("sdt"));
                ds.add(dg);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<String> layDSMaDocGia() {
        ArrayList<String> ds = new ArrayList<String>();
        try {
            String sql = "select * from DOCGIA";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                ds.add(resultSet.getString("madocgia"));
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static boolean themDocGia(DocGia dg) {
        boolean kq = false;
        String sql = "INSERT INTO DocGia VALUES(N'"+dg.getMaDG()+"', N'"+dg.getTenDG()+"',N'"+dg.getNgaySinh()+"',N'"+dg.getDiaChi()+"',"
                + "'"+dg.getLop()+"',N'"+dg.getKhoa()+"',N'"+dg.getMail()+"',N'"+dg.getSdt()+"',0)";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if (n == 1) kq = true;
        provider.close();
        return kq;
    }
    
    public static boolean xoaDocGia(String ma) {
        boolean kq = false;
        String sql = String.format("Delete from docgia where madocgia = ('%s');", ma);
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if (n == 1) kq = true;
        provider.close();
        return kq;
    }
    
    public static boolean suaDocGia(DocGia dg)
    {
        boolean kq = false;
        String sql = "update docgia set hoten='"+dg.getTenDG()+"', ngaysinh='"+dg.getNgaySinh()+"', diachi='"+dg.getDiaChi()+"', lop='"+dg.getLop()+"', "
            + "khoa='"+dg.getKhoa()+"', email='"+dg.getMail()+"', sdt='"+dg.getSdt()+"' where madocgia = '"+dg.getMaDG()+"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if (n == 1) kq = true;
        provider.close();
        return kq;
    }
    
    public static String layHoTenDocGia(String ma) {
        String hoTenDG = "error";
        try {
            String sql = "select * from docgia where madocgia = '"+ma+"'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                hoTenDG = resultSet.getString("hoten");
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return hoTenDG;
    }
}
