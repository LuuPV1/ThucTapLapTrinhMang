/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ltjava.lab4.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phaml
 */
public class QuanLySinhVien {
    private List<SinhVien> listSinhVien = new ArrayList<>();

    public boolean ktTrungma(String maSinhVien) {
        for (SinhVien sv : listSinhVien) {
            if (sv.getMaSinhVien().equalsIgnoreCase(maSinhVien)) {
                return true;
            }
        }
        System.out.println("");
        return false;
    }

    public boolean addSinhvien(SinhVien sv) {
        if (ktTrungma(sv.getMaSinhVien())) {
            return false;
        }
        return listSinhVien.add(sv);
    }

    public SinhVien findSinhvien(String masv) {
        for (SinhVien sv : listSinhVien) {
            if (sv.getMaSinhVien().equalsIgnoreCase(masv)) {
                return sv;
            }
        }
        return null;
    }

    public SinhVien updateSinhvien(int index, SinhVien sv) {
        return listSinhVien.set(index, sv);
    }

    public void removeSinhvien(String masv) {
        SinhVien sv = findSinhvien(masv);
        listSinhVien.remove(sv);
    }

    public String toString() {
        return listSinhVien.toString();
    }
    
    public static void main(String[] args) {
        QuanLySinhVien qlsv=new QuanLySinhVien();
        SinhVien sv1 = new SinhVien();
        sv1.setMaSinhVien("SV1");
        sv1.setTenSinhVien("Pham Van X");
        sv1.setLop("Tin11A2");
        sv1.setNamSinh("01/01/1999");
        sv1.setDiaChi("HD");
        qlsv.addSinhvien(sv1);
        SinhVien sv2 = new SinhVien();
        sv2.setMaSinhVien("SV2");
        sv2.setTenSinhVien("Nguyễn Thị Hong Y");
        sv1.setLop("Tin11A1");
        sv1.setNamSinh("01/01/1999");
        sv1.setDiaChi("HN");
        qlsv.addSinhvien(sv2);
        System.out.println(qlsv);
    }
}
