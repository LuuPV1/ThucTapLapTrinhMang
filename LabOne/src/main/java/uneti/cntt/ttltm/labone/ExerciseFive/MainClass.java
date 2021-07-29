/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ttltm.labone.ExerciseFive;

import java.util.Scanner;

/**
 *
 * @author phaml
 */
public class MainClass {

    int n;

    public int getN() {
        return n;
    }

    void nhap() {
        boolean check;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap so nguyen duong n:");
                n = Integer.parseInt(sc.nextLine());
                check = true;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("hay nhap dung kieu du lieu" + e.toString());
                check = false;
            }
        } while (check == false);
    }

    float TinhTong(int a) {
        float tong = 0;
        for (int i = 1; i <= a; i++) {
            tong += (float) 1 / i;
        }
        return tong;
    }

    float TinhTongGiaiThua(int a) {
        float tong = 0;
        int gt = 1;
        for (int i = 1; i <= a; i++) {
            gt *= i;
            tong += 1.0 / gt;
        }
        return tong;
    }

    void luaChon() {
        System.out.println("0. Thoat.");
        System.out.println("1. Nhap so nguyen duong n.");
        System.out.println("2. Tinh tong 1 1/2 1/3 ... 1/n.");
        System.out.println("3. Tinh tong 1 1/2! 1/3! ... 1/n!.");
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();

        int n = 0;
        Scanner sc = new Scanner(System.in);

        do {
            boolean check;
            do {
                main.luaChon();
                try {
                    System.out.println("Nhap vao lua chon :");
                    n = Integer.parseInt(sc.nextLine());
                    check = true;
                } catch (NumberFormatException e) {
                    System.out.println("Ban phai nhap la so nguyen duong" + e.toString());
                    check = false;
                }
            } while (check == false);
            switch (n) {
                case 1: {
                    main.nhap();
                    break;
                }
                case 2: {
                    if (main.getN() == 0) {
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    } else {
                        System.out.println("Tong 1+...1/" + n + " la:" + main.TinhTong(main.getN()));
                    }
                    break;
                }
                case 3: {
                    if (main.getN() == 0) {
                        System.out.println("ban chua nhap n!hoac ban de n =0");
                    } else {
                        System.out.println("Tong 1+...1/" + n + "! la:" + main.TinhTongGiaiThua(main.getN()));
                    }
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Hay chon tuy chon nao do");
                    break;
                }
            }

        } while (n != 0);

    }
}
