/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.DAO;

import QLTV.POJO.ChiTietPhieuTra;
import QLTV.POJO.PhieuTra;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 84328
 */
public class PhieuTra_DAO {
    public static ArrayList<PhieuTra> layDSPhieuTra() {
        ArrayList<PhieuTra> ds = new ArrayList<PhieuTra>();
        try {
            String sql = "SELECT dbo.PHIEUTRA.*, dbo.CHITIETPHIEUTRA.MaPhieu FROM dbo.CHITIETPHIEUTRA INNER JOIN dbo.PHIEUTRA ON dbo.CHITIETPHIEUTRA.MaPhieuTra = dbo.PHIEUTRA.MaPhieuTra";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                PhieuTra pt = new PhieuTra();
                pt.setMaPhieuTra(resultSet.getString("MaPhieuTra"));
                pt.setMaPhieu(resultSet.getString("MaPhieu"));
                pt.setMaPhieuMuon(resultSet.getString("MaPhieuMuon"));
                pt.setMaDG(resultSet.getString("MaDocGia"));
                pt.setNgayLap(Date.valueOf(resultSet.getString("NgayLapPhieuTra")));
                pt.setMaNVLap(resultSet.getString("MaNV"));
                ds.add(pt);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<PhieuTra> layDSPhieuTraTheoMa(String ma, int n) {
        ArrayList<PhieuTra> ds = new ArrayList<PhieuTra>();
        String sql = null;
        try {
            switch (n) {
                case 0:
                    sql = "SELECT dbo.PHIEUTRA.*, dbo.CHITIETPHIEUTRA.MaPhieu FROM dbo.CHITIETPHIEUTRA INNER JOIN dbo.PHIEUTRA ON dbo.CHITIETPHIEUTRA.MaPhieuTra = dbo.PHIEUTRA.MaPhieuTra WHERE dbo.PHIEUTRA.MaPhieuTra like '%"+ma+"%'";
                    break;
                case 1:
                    sql = "SELECT dbo.PHIEUTRA.*, dbo.CHITIETPHIEUTRA.MaPhieu FROM dbo.CHITIETPHIEUTRA INNER JOIN dbo.PHIEUTRA ON dbo.CHITIETPHIEUTRA.MaPhieuTra = dbo.PHIEUTRA.MaPhieuTra WHERE dbo.PHIEUTRA.MaPhieuMuon like '%"+ma+"%'";
                case 2:
                    sql = "SELECT dbo.PHIEUTRA.*, dbo.CHITIETPHIEUTRA.MaPhieu FROM dbo.CHITIETPHIEUTRA INNER JOIN dbo.PHIEUTRA ON dbo.CHITIETPHIEUTRA.MaPhieuTra = dbo.PHIEUTRA.MaPhieuTra WHERE dbo.PHIEUTRA.MaNV like '%"+ma+"%'";
                    break;
                default:
                    sql = "SELECT dbo.PHIEUTRA.*, dbo.CHITIETPHIEUTRA.MaPhieu FROM dbo.CHITIETPHIEUTRA INNER JOIN dbo.PHIEUTRA ON dbo.CHITIETPHIEUTRA.MaPhieuTra = dbo.PHIEUTRA.MaPhieuTra WHERE dbo.PHIEUTRA.MaDocGia like '%"+ma+"%'";
                    break;
            }
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                PhieuTra pt = new PhieuTra();
                pt.setMaPhieuTra(resultSet.getString("MaPhieuTra"));
                pt.setMaPhieu(resultSet.getString("MaPhieu"));
                pt.setMaPhieuMuon(resultSet.getString("MaPhieuMuon"));
                pt.setMaDG(resultSet.getString("MaDocGia"));
                pt.setNgayLap(Date.valueOf(resultSet.getString("NgayLapPhieuTra")));
                pt.setMaNVLap(resultSet.getString("MaNV"));
                ds.add(pt);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ChiTietPhieuTra layThongTinChiTietPhieuTra(String maPhieu, String ma) {
        ChiTietPhieuTra ct = new ChiTietPhieuTra();
        try {
            String sql = "select * from CHITIETPHIEUTRA where MaPhieuTra = '" + maPhieu + "' and MaPhieu like '" + ma + "%'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                ct.setMaPhieuTra(resultSet.getString("MaPhieuTra"));
                ct.setMaPhieuMuon(resultSet.getString("MaPhieuMuon"));
                ct.setMaDocGia(resultSet.getString("MaDocGia"));
                ct.setTenDocGia(resultSet.getString("TenDocGia"));
                ct.setMaTaiLieu(resultSet.getString("MaTaiLieu"));
                ct.setTenTaiLieu(resultSet.getString("TenTaiLieu"));
                ct.setSoLuongTra(Integer.valueOf(resultSet.getString("SoLuongTra")));
                ct.setNgayTra(Date.valueOf(resultSet.getString("NgayTra")));
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ct;
    }
    
    public static ArrayList<String> layDSMaTL(String ma) {
        ArrayList<String> ds = new ArrayList<String>();
        try {
            String sql = "select * from CHITIETPHIEUMUON where MaPhieuMuon = '"+ma+"'";
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
    
    public static boolean themPhieuTra(ChiTietPhieuTra ctpt, String maNV, boolean check) {
        boolean kq = false;
        String sqlInsertChiTietPhieuTra = "INSERT INTO ChiTietPhieuTra VALUES(N'"+ctpt.getMaPhieu()+"',N'"+ctpt.getMaPhieuTra()+"',N'"+ctpt.getMaPhieuMuon()+"',N'"+ctpt.getMaDocGia()+"',"
                + "N'"+ctpt.getTenDocGia()+"',N'"+ctpt.getMaTaiLieu()+"',N'"+ctpt.getTenTaiLieu()+"',"+ctpt.getSoLuongTra()+",'"+ctpt.getNgayTra()+"');";
        String sqlInsertPhieuTra = "INSERT INTO PhieuTra VALUES(N'"+ctpt.getMaPhieuTra()+"',N'"+ctpt.getMaPhieuMuon()+"',N'"+ctpt.getMaDocGia()+"','"+ctpt.getNgayTra()+"',N'"+maNV+"');";
        String sqlUpdateTaiLieu = "update TaiLieu set ConLai=ConLai + '"+ctpt.getSoLuongTra()+"' where MaTaiLieu = '"+ctpt.getMaTaiLieu()+"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        if(!check) {
            int y = provider.executeUpdate(sqlInsertPhieuTra);
            if (y != 1) {
                provider.close();
                return false;
            }
        }
        int x = provider.executeUpdate(sqlUpdateTaiLieu);
        if (x == 1) {
            kq = true;
            provider.executeUpdate(sqlInsertChiTietPhieuTra);
        }
        else provider.executeUpdate("delete from PhieuTra where MaPhieuTra='"+ctpt.getMaPhieuTra()+"'");
        provider.close();
        return kq;
    }
    
    public static boolean xoaPhieuTra(String ma) {
        boolean kq = false;
        String sqlDeletePhieuTra = "delete from PhieuTra where MaPhieuTra='"+ma+"'";
        String sqlDeleteChiTietPhieuTra = "delete from ChiTietPhieuTra where MaPhieuTra='"+ma+"'";
        
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sqlDeleteChiTietPhieuTra);
        kq = true;
        provider.executeUpdate(sqlDeletePhieuTra);
        provider.close();
        return kq;
    }
    
    public static boolean suaPhieuTra(ChiTietPhieuTra ctpt, String maNV)
    {
        boolean kq = false;
        String sqlUpdateChiTietPhieuTra = "update CHITIETPhieuTra set maphieu = '"+ctpt.getMaPhieu()+"', maphieumuon='"+ctpt.getMaPhieuMuon()+"', madocgia='"+ctpt.getMaDocGia()+"', tendocgia='"+ctpt.getTenDocGia()+"', matailieu='"+ctpt.getMaTaiLieu()+"', "
                + "tentailieu='"+ctpt.getTenTaiLieu()+"', soluongtra='"+ctpt.getSoLuongTra()+"', ngaytra='"+ctpt.getNgayTra()+"' where maPhieuTra = '"+ctpt.getMaPhieuTra()+"' and maphieu = '"+ctpt.getMaPhieu()+"'";
        String sqlUpdatePhieuTra = "update PhieuTra set maphieumuon='"+ctpt.getMaPhieuMuon()+"', madocgia='"+ctpt.getMaDocGia()+"', ngaylapphieutra='"+ctpt.getNgayTra()+"', manv='"+maNV+"' where maPhieuTra = '"+ctpt.getMaPhieuTra()+"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sqlUpdateChiTietPhieuTra);
        if (n == 1) {
            kq = true;
            provider.executeUpdate(sqlUpdatePhieuTra);
        }
        provider.close();
        return kq;
    }
    
    public static boolean capNhatTrangThaiPhieuMuon(String ma, int trangThai)
    {   // trangThai = 0 ~ Đã Trả       trangThai = 1 ~ Còn Mượn
        boolean kq = false;
        String tinhTrang = null;
        if(trangThai == 0)  
            tinhTrang = "Đã Trả";
        else tinhTrang = "Còn Mượn";
        String sqlUpdatePhieuMuon = "update PhieuMuon set TinhTrang = '"+tinhTrang+"' where maPhieuMuon = '"+ma+"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sqlUpdatePhieuMuon);
        if (n == 1) kq = true;
        provider.close();
        return kq;
    }
    
    public static String getConnectionURL() {
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        return provider.getConnectionURL();
    }
}
