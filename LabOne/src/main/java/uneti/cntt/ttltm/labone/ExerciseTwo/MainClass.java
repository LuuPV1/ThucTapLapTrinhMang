/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ttltm.labone.ExerciseTwo;

import java.util.Scanner;

/**
 *
 * @author phaml
 */
public class MainClass {

    /**
     *
     * Yeu cau bai 2 : Tim max min cua 2 so nhap vao
     */
    public static void main(String[] args) {
        int n1, n2, max, min;
        
        Scanner sc = new Scanner(System.in); //Phím tắt CTRL + Space
        System.out.println("Nhap so nguyen thu nhat:");
        n1 = sc.nextInt();
        System.out.println("Nhap so nguyen thu hai:");
        n2 = sc.nextInt();
        
        max = (n1 > n2) ? n1 : n2;
        min = (n1 < n2) ? n1 : n2;
        
        System.out.println("So lon nhat : "+ max + "| so nho nhat : " + min);
    }
}
