/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ttltm.labone.ExerciseOne;

import java.util.Scanner;

/**
 *
 * @author phaml
 */
public class MainClass {

    public static void main(String[] args) {
        int i;
        float f;
        double d;
        long l;
        char ch;
        String str;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen:");
        i = sc.nextInt();
        System.out.println("Nhap mot so thuc:");
        f = sc.nextFloat();
        System.out.println("Nhap mot so double:");
        d = sc.nextDouble();
        System.out.println("Nhap mot so long:");
        l = sc.nextLong();
        System.out.println("Nhap mot ki tu:");
        sc.nextLine();
        ch = sc.nextLine().charAt(0);
        System.out.println("Nhap mot chuoi:");
        str = sc.nextLine();
        System.out.println("Du lieu vua nhap:");

        System.out.println("Kieu int : " + i);
        System.out.println("Kieu long : " + l);
        System.out.println("Kieu float : " + f);
        System.out.println("Kieu character :" + ch);
        System.out.println("Kieu chuoi : " + str);
        System.out.println("Kieu double :" + d);
        System.out.println("\nIn tren cung 1 dong: ");
        System.out.println("Kieu int =" + i + ", Kieu float=" + f + ", Kieu long=" + l + ", Kieu double=" + d + ", Kieu character=" + ch + ", Kieu chuoi=" + str);

    }
}
