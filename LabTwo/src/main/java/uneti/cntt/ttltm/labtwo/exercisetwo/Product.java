/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ttltm.labtwo.exercisetwo;

/**
 *
 * @author phaml
 */
public class Product {
    private String maHH;
    private String tenHH;
    private int soLuong;
    private float giaSP;

    public Product() {
    }

    public Product(String maHH, String tenHH, float giaSP, int soLuong) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.giaSP = giaSP;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(float giaSP) {
        this.giaSP = giaSP;
    }

    @Override
    public String toString() {
        return "ProductManagement{" + "maHH=" + maHH + ", tenHH=" + tenHH + ", soLuong=" + soLuong + ", giaSP=" + giaSP + '}';
    }
    
}
