/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ttltm.applicationprogramminginterface.app.productmanagement;

/**
 *
 * @author phaml
 */
public class Product implements Comparable<Product>{
    private Integer id;
    private String tenHangHoa;
    private String tenNhaSanXuat;
    private float giaBan;

    public Product() {
    }

    public Product(Integer id, String tenHangHoa, String tenNhaSanXuat, float giaBan) {
        this.id = id;
        this.tenHangHoa = tenHangHoa;
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.giaBan = giaBan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", tenHangHoa=" + tenHangHoa + ", tenNhaSanXuat=" + tenNhaSanXuat + ", giaBan=" + giaBan + '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getTenHangHoa().compareTo(o.getTenHangHoa());
    }
}
