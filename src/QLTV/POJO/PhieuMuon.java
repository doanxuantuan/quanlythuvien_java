/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTV.POJO;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class PhieuMuon {
    String maPhieu, maPhieuMuon, maNVLap, maDG, tinhTrang;
    Date ngayLap;

    public PhieuMuon() {
    }

    public PhieuMuon(String maPhieu, String maPhieuMuon, String maNVLap, String maDG, String tinhTrang, Date ngayLap) {
        this.maPhieu = maPhieu;
        this.maPhieuMuon = maPhieuMuon;
        this.maNVLap = maNVLap;
        this.maDG = maDG;
        this.tinhTrang = tinhTrang;
        this.ngayLap = ngayLap;
    }
    
    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }
    
    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public String getMaNVLap() {
        return maNVLap;
    }

    public void setMaNVLap(String maNVLap) {
        this.maNVLap = maNVLap;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

}
