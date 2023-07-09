/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.DAO;

import QLTV.POJO.ChiTietPhieuMuon;
import QLTV.POJO.PhieuMuon;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PhieuMuon_DAO {
    public static ArrayList<PhieuMuon> layDSPhieuMuon() {
        ArrayList<PhieuMuon> ds = new ArrayList<PhieuMuon>();
        try {
            String sql = "SELECT dbo.PHIEUMUON.*, dbo.CHITIETPHIEUMUON.MaPhieu FROM dbo.CHITIETPHIEUMUON "
                    + "INNER JOIN dbo.PHIEUMUON ON dbo.CHITIETPHIEUMUON.MaPhieuMuon = dbo.PHIEUMUON.MaPhieuMuon";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                PhieuMuon pm = new PhieuMuon();
                pm.setMaPhieuMuon(resultSet.getString("MaPhieuMuon"));
                pm.setMaPhieu(resultSet.getString("MaPhieu"));
                pm.setMaNVLap(resultSet.getString("MaNV"));
                pm.setMaDG(resultSet.getString("MaDocGia"));
                pm.setTinhTrang(resultSet.getString("TinhTrang"));
                pm.setNgayLap(Date.valueOf(resultSet.getString("NgayLapPhieuMuon")));
                ds.add(pm);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<PhieuMuon> layDSPhieuMuonTheoMa(String ma, int n) {
        ArrayList<PhieuMuon> ds = new ArrayList<PhieuMuon>();
        String sql = null;
        try {
            switch (n) {
                case 0:
                    sql = "SELECT dbo.PHIEUMUON.*, dbo.CHITIETPHIEUMUON.MaPhieu FROM dbo.CHITIETPHIEUMUON INNER JOIN dbo.PHIEUMUON ON dbo.CHITIETPHIEUMUON.MaPhieuMuon = dbo.PHIEUMUON.MaPhieuMuon WHERE dbo.PHIEUMUON.MaPhieuMuon like '%"+ma+"%'";
                    break;
                case 1:
                    sql = "SELECT dbo.PHIEUMUON.*, dbo.CHITIETPHIEUMUON.MaPhieu FROM dbo.CHITIETPHIEUMUON INNER JOIN dbo.PHIEUMUON ON dbo.CHITIETPHIEUMUON.MaPhieuMuon = dbo.PHIEUMUON.MaPhieuMuon WHERE dbo.PHIEUMUON.MaNV like '%"+ma+"%'";
                    break;
                default:
                    sql = "SELECT dbo.PHIEUMUON.*, dbo.CHITIETPHIEUMUON.MaPhieu FROM dbo.CHITIETPHIEUMUON INNER JOIN dbo.PHIEUMUON ON dbo.CHITIETPHIEUMUON.MaPhieuMuon = dbo.PHIEUMUON.MaPhieuMuon WHERE dbo.PHIEUMUON.MaDocGia like '%"+ma+"%'";
                    break;
            }
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                PhieuMuon pm = new PhieuMuon();
                pm.setMaPhieuMuon(resultSet.getString("MaPhieuMuon"));
                pm.setMaPhieu(resultSet.getString("MaPhieu"));
                pm.setMaNVLap(resultSet.getString("MaNV"));
                pm.setMaDG(resultSet.getString("MaDocGia"));
                pm.setTinhTrang(resultSet.getString("TinhTrang"));
                pm.setNgayLap(Date.valueOf(resultSet.getString("NgayLapPhieuMuon")));
                ds.add(pm);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<String> layDSMaPhieuMuon() {
        ArrayList<String> ds = new ArrayList<String>();
        try {
            String sql = "select * from PhieuMuon";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                ds.add(resultSet.getString("MaPhieuMuon"));
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ChiTietPhieuMuon layThongTinChiTietPhieuMuon(String maPhieu, String ma) {
        ChiTietPhieuMuon ct = new ChiTietPhieuMuon();
        try {
            String sql = "select * from CHITIETPHIEUMUON where MaPhieuMuon = '" + maPhieu + "' and MaPhieu like '" + ma + "%'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                ct.setMaPhieuMuon(resultSet.getString("MaPhieuMuon"));
                ct.setMaDocGia(resultSet.getString("MaDocGia"));
                ct.setTenDocGia(resultSet.getString("TenDocGia"));
                ct.setMaTaiLieu(resultSet.getString("MaTaiLieu"));
                ct.setTenTaiLieu(resultSet.getString("TenTaiLieu"));
                ct.setSoLuongMuon(Integer.valueOf(resultSet.getString("SoLuongMuon")));
                ct.setNgayMuon(Date.valueOf(resultSet.getString("NgayMuon")));
                ct.setHanTra(Date.valueOf(resultSet.getString("HanTra")));
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ct;
    }
    
    public static boolean themPhieuMuon(ChiTietPhieuMuon ctpm, String maNV, boolean check) {
        boolean kq = false;
        String sqlInsertChiTietPhieuMuon = "INSERT INTO CHITIETPHIEUMUON VALUES(N'"+ctpm.getMaPhieu()+"',N'"+ctpm.getMaPhieuMuon()+"',N'"+ctpm.getMaDocGia()+"',"
                + "N'"+ctpm.getTenDocGia()+"',N'"+ctpm.getMaTaiLieu()+"',N'"+ctpm.getTenTaiLieu()+"',"+ctpm.getSoLuongMuon()+",'"+ctpm.getNgayMuon()+"','"+ctpm.getHanTra()+"');";
        String sqlInsertPhieuMuon = "INSERT INTO PHIEUMUON VALUES(N'"+ctpm.getMaPhieuMuon()+"',N'"+maNV+"',N'"+ctpm.getMaDocGia()+"',N'Đang Mượn','"+ctpm.getNgayMuon()+"');";
        String sqlUpdateTaiLieu = "update TaiLieu set ConLai=ConLai - '"+ctpm.getSoLuongMuon()+"' where MaTaiLieu = '"+ctpm.getMaTaiLieu()+"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        if(!check) {
            int y = provider.executeUpdate(sqlInsertPhieuMuon);
            if (y != 1) {
                provider.close();
                return false;
            }
        }
        int x = provider.executeUpdate(sqlInsertChiTietPhieuMuon);
        if (x == 1) {
            kq = true;
            provider.executeUpdate(sqlUpdateTaiLieu);
        }
        else provider.executeUpdate("delete from PHIEUMUON where MaPhieuMuon='"+ctpm.getMaPhieuMuon()+"'");
        provider.close();
        return kq;
    }
    
    public static boolean xoaPhieuMuon(String ma) {
        boolean kq = false;
        String sqlDeletePhieuMuon = "delete from PHIEUMUON where MaPhieuMuon='"+ma+"'";
        String sqlDeleteChiTietPhieuMuon = "delete from CHITIETPHIEUMUON where MaPhieuMuon='"+ma+"'";
        
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        provider.executeUpdate(sqlDeleteChiTietPhieuMuon);
        kq = true;
        provider.executeUpdate(sqlDeletePhieuMuon);
        provider.close();
        return kq;
    }
    
    public static boolean suaPhieuMuon(ChiTietPhieuMuon ctpm, String maNV) {
        boolean kq = false;
        String sqlUpdateChiTietPhieuMuon = "update CHITIETPHIEUMUON set madocgia='"+ctpm.getMaDocGia()+"', tendocgia='"+ctpm.getTenDocGia()+"', matailieu='"+ctpm.getMaTaiLieu()+"', "
                + "tentailieu='"+ctpm.getTenTaiLieu()+"', soluongmuon='"+ctpm.getSoLuongMuon()+"', ngaymuon='"+ctpm.getNgayMuon()+"', hantra='"+ctpm.getHanTra()+"' where maphieumuon = '"+ctpm.getMaPhieuMuon()+"' and maphieu = '"+ctpm.getMaPhieu()+"'";
        String sqlUpdatePhieuMuon = "update PHIEUMUON set manv='"+maNV+"', madocgia='"+ctpm.getMaDocGia()+"', tinhtrang=N'Đang Mượn', ngaylapphieumuon='"+ctpm.getNgayMuon()+"' where maphieumuon = '"+ctpm.getMaPhieuMuon()+"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sqlUpdateChiTietPhieuMuon);
        if (n == 1) {
            kq = true;
            provider.executeUpdate(sqlUpdatePhieuMuon);
        }
        provider.close();
        return kq;
    }
    
    public static String layHanTra(String maPM, String maTL) {
        String sl = "error";
        try {
            String sql = "select * from CHITIETPHIEUMUON where maphieumuon = '"+maPM+"' and MaTaiLieu = '"+maTL+"'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                sl = resultSet.getString("HanTra");
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sl;
    }
    
    public static int laySoLuongMuon(String maPM, String maTL) {
        int sl = -1;
        try {
            String sql = "select * from CHITIETPHIEUMUON where maphieumuon = '"+maPM+"' and MaTaiLieu = '"+maTL+"'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                sl = resultSet.getInt("soluongmuon");
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sl;
    }
    
    public static int laySoLuongConLai(String ma) {
        int sl = -1;
        try {
            String sql = "select * from TAILIEU where MaTaiLieu = '"+ma+"'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                sl = resultSet.getInt("ConLai");
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sl;
    }
    
    public static String getConnectionURL() {
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        return provider.getConnectionURL();
    }
}
