/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ltjava.lab4.ex2;

/**
 *
 * @author phaml
 */
public class SanPham {
    private String tenSanPham;
    private float gia;

    public SanPham() {
    }

    public SanPham(String tenSanPham, float gia) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "tenSanPham=" + tenSanPham + ", gia=" + gia + '}';
    }
    
    
}
