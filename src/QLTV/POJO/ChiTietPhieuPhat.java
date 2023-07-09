/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.POJO;

import java.sql.Date;

/**
 *
 * @author 84328
 */
public class ChiTietPhieuPhat {
    String maPhieu, maPhieuPhat, maPhieuTra, maDocGia, tenDocGia, maTaiLieu, tenTaiLieu, lyDo;
    int soLuong, soTienPhat;
    Date ngayLap;

    public ChiTietPhieuPhat() {
    }

    public ChiTietPhieuPhat(String maPhieuPhat, String maPhieuTra, String maDocGia, String tenDocGia, String maTaiLieu, String tenTaiLieu, String lyDo, int soLuong, int soTienPhat, Date ngayLap) {
        this.maPhieu = maPhieu;
        this.maPhieuPhat = maPhieuPhat;
        this.maPhieuTra = maPhieuTra;
        this.maDocGia = maDocGia;
        this.tenDocGia = tenDocGia;
        this.maTaiLieu = maTaiLieu;
        this.tenTaiLieu = tenTaiLieu;
        this.lyDo = lyDo;
        this.soLuong = soLuong;
        this.soTienPhat = soTienPhat;
        this.ngayLap = ngayLap;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }
    
    public String getMaPhieuPhat() {
        return maPhieuPhat;
    }

    public void setMaPhieuPhat(String maPhieuPhat) {
        this.maPhieuPhat = maPhieuPhat;
    }

    public String getMaPhieuTra() {
        return maPhieuTra;
    }

    public void setMaPhieuTra(String maPhieuTra) {
        this.maPhieuTra = maPhieuTra;
    }

    public String getMaDocGia() {
        return maDocGia;
    }

    public void setMaDocGia(String maDocGia) {
        this.maDocGia = maDocGia;
    }

    public String getTenDocGia() {
        return tenDocGia;
    }

    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(int soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }
    
}
