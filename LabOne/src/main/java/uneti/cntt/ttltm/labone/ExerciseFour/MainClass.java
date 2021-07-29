/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ttltm.labone.ExerciseFour;

import java.util.Scanner;

/**
 *
 * @author phaml
 */
public class MainClass {
    //Viet phuong trinh tinh tien dien theo luy tien
    public static void main(String[] args) {
        int soDien;
        double soTien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien su dung:");
        soDien = sc.nextInt();
        if(soDien < 50){
            soTien = soDien * 5000;
            System.out.println("[SD <= 50]Ban dung het "+ soDien + "so dien va phai tra : " + soTien);
        }else{
            soTien = 50*5000 + (soDien - 50) * 1200;
            System.out.println("[SD > 50]Ban dung het "+ soDien + "so dien va phai tra : " + soTien);
        }
    }
}
