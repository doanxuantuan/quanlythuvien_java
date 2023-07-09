/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.DAO;

import QLTV.POJO.ChiTietPhieuPhat;
import QLTV.POJO.PhieuPhat;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 84328
 */
public class PhieuPhat_DAO {
    public static ArrayList<PhieuPhat> layDSPhieuPhat() {
        ArrayList<PhieuPhat> ds = new ArrayList<PhieuPhat>();
        try {
            String sql = "select * from PhieuPhat";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                PhieuPhat pp = new PhieuPhat();
                pp.setMaPhieuPhat(resultSet.getString("maphieuphat"));
                pp.setMaPhieuTra(resultSet.getString("maphieutra"));
                pp.setMaDocGia(resultSet.getString("madg"));
                pp.setMaNV(resultSet.getString("manv"));
                pp.setNgayLap(resultSet.getDate("ngaylapphieu"));
                ds.add(pp);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ArrayList<PhieuPhat> layDSPhieuPhatTheoMa(String ma, int n) {
        ArrayList<PhieuPhat> ds = new ArrayList<PhieuPhat>();
        String sql = null;
        try {
            switch (n) {
                case 0:
                    sql = "select * from PhieuPhat WHERE MaPhieuPhat like '"+ma+"%'";
                    break;
                case 1:
                    sql = "select * from PhieuPhat WHERE MaPhieuTra like '"+ma+"%'";
                case 2:
                    sql = "select * from PhieuPhat WHERE MaNV like '"+ma+"%'";
                    break;
                default:
                    sql = "select * from PhieuPhat WHERE MaDG like '"+ma+"%'";
                    break;
            }
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                PhieuPhat pp = new PhieuPhat();
                pp.setMaPhieuPhat(resultSet.getString("maphieuphat"));
                pp.setMaPhieuTra(resultSet.getString("maphieutra"));
                pp.setMaDocGia(resultSet.getString("madg"));
                pp.setMaNV(resultSet.getString("manv"));
                pp.setNgayLap(resultSet.getDate("ngaylapphieu"));
                ds.add(pp);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static int demSoNgayQuaHan(String ma) {
        int num = 0;
        try {
            String sql = "select * from ChiTietPhieuTra where maphieuphat = '"+ma+"'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                String hanTra, ngayTra, maPM, maTL;
                maPM = resultSet.getString("MaPhieuMuon");
                maTL = resultSet.getString("MaTaiLieu");
                hanTra = PhieuMuon_DAO.layHanTra(maPM, maTL);
                Date NgayTra = Date.valueOf(java.time.LocalDate.now());
                ngayTra = String.valueOf(NgayTra);
                hanTra = hanTra.substring(8);
                ngayTra = ngayTra.substring(8);
                num += Integer.valueOf(ngayTra) - Integer.valueOf(hanTra);
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return num;
    }
        
    public static ArrayList<String> layDSMaPhieuTra() {
        ArrayList<String> ds = new ArrayList<String>();
        try {
            String sql = "select * from PhieuTra";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                ds.add(resultSet.getString("MaPhieuTra"));
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ds;
    }
    
    public static ChiTietPhieuPhat layThongTinChiTietPhieuPhat(String maPhieu) {
        ChiTietPhieuPhat ct = new ChiTietPhieuPhat();
        try {
            String sql = "select * from CHITIETPHIEUPHAT where MaPhieuPhat = '" + maPhieu + "'";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next()) {
                ct.setMaPhieuPhat(resultSet.getString("MaPhieuPhat"));
                ct.setMaPhieuTra(resultSet.getString("MaPhieuTra"));
                ct.setLyDo(resultSet.getString("LyDo"));
                ct.setSoLuong(Integer.valueOf(resultSet.getString("SoLuong")));
                ct.setSoTienPhat(Integer.valueOf(resultSet.getString("SoTienPhat")));
                ct.setMaDocGia(resultSet.getString("MaDocGia"));
                ct.setTenDocGia(resultSet.getString("TenDocGia"));
                ct.setMaTaiLieu(resultSet.getString("MaTaiLieu"));
                ct.setTenTaiLieu(resultSet.getString("TenTaiLieu"));
                ct.setNgayLap(Date.valueOf(resultSet.getString("NgayLapPhieu")));
            }
            provider.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ct;
    }
    
    public static boolean themPhieuPhat(ChiTietPhieuPhat ctpp, String maNV) {
        boolean kq = false;
        String sqlInsertChiTietPhieuPhat = "INSERT INTO ChiTietPhieuPhat VALUES(N'"+ctpp.getMaPhieu()+"',N'"+ctpp.getMaPhieuPhat()+"',N'"+ctpp.getMaPhieuTra()+"',N'"+ctpp.getLyDo()+"',"+ctpp.getSoLuong()+","
                + ""+ctpp.getSoTienPhat()+",N'"+ctpp.getMaDocGia()+"',N'"+ctpp.getTenDocGia()+"',N'"+ctpp.getMaTaiLieu()+"',N'"+ctpp.getTenTaiLieu()+"','"+ctpp.getNgayLap()+"');";
        String sqlInsertPhieuPhat = "INSERT INTO PhieuPhat VALUES(N'"+ctpp.getMaPhieuPhat()+"',N'"+ctpp.getMaPhieuTra()+"',N'"+ctpp.getMaDocGia()+"',N'"+maNV+"','"+ctpp.getNgayLap()+"');";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sqlInsertPhieuPhat);
        if (n == 1) {
            kq = true;
            int m = provider.executeUpdate(sqlInsertChiTietPhieuPhat);
            if (m != 1) {
                kq = false;
                provider.executeUpdate("delete from PhieuPhat where MaPhieuPhat='"+ctpp.getMaPhieuPhat()+"'");
            }
        }
        provider.close();
        return kq;
    }
    
    public static boolean xoaPhieuPhat(String ma) {
        boolean kq = false;
        String sqlDeletePhieuTra = "delete from PhieuPhat where MaPhieuPhat='"+ma+"'";
        String sqlDeleteChiTietPhieuTra = "delete from ChiTietPhieuPhat where MaPhieuPhat='"+ma+"'";
        
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sqlDeleteChiTietPhieuTra);
        if (n == 1) {
            kq = true;
            provider.executeUpdate(sqlDeletePhieuTra); 
        }
        provider.close();
        return kq;
    }
    
    public static boolean suaPhieuPhat(ChiTietPhieuPhat ctpp, String maNV)
    {
        boolean kq = false;
        String sqlUpdateChiTietPhieuPhat = "update CHITIETPhieuPhat set maphieutra='"+ctpp.getMaPhieuTra()+"', lydo='"+ctpp.getLyDo()+"', soluong='"+ctpp.getSoLuong()+"', sotienphat='"+ctpp.getSoTienPhat()+"', "
        + "madocgia='"+ctpp.getMaDocGia()+"', tendocgia='"+ctpp.getTenDocGia()+"', matailieu='"+ctpp.getMaTaiLieu()+"', tentailieu='"+ctpp.getTenTaiLieu()+"', ngaylapphieu='"+ctpp.getNgayLap()+"' where maPhieuPhat = '"+ctpp.getMaPhieuPhat()+"'";
        String sqlUpdatePhieuPhat = "update PhieuPhat set maphieutra='"+ctpp.getMaPhieuTra()+"', madocgia='"+ctpp.getMaDocGia()+"', manv='"+maNV+"', ngaylapphieu='"+ctpp.getNgayLap()+"' where maPhieuPhat = '"+ctpp.getMaPhieuPhat()+"'";
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sqlUpdateChiTietPhieuPhat);
        if (n == 1) {
            kq = true;
            provider.executeUpdate(sqlUpdatePhieuPhat);
        }
        provider.close();
        return kq;
    }
    
    public static String getConnectionURL() {
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        return provider.getConnectionURL();
    }
}
