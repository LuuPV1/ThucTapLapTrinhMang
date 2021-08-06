/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ltjava.lab4.ex1;

/**
 *
 * @author phaml
 */
public class SinhVien {

    private String maSinhVien;
    private String tenSinhVien;
    private String namSinh;
    private String diaChi;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String tenSinhVien, String namSinh, String diaChi, String lop) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", namSinh=" + namSinh + ", diaChi=" + diaChi + ", lop=" + lop + '}';
    }
}
