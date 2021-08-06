/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti.cntt.ltjava.lab3;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author phaml
 */
public class BaiTapMot {

    public static void main(String[] args) throws IOException {
        BufferedReader br;
        int n = 0, c = 0;
        br = new BufferedReader(new InputStreamReader(System.in));
        int arr[];
        System.out.print("Nhap so luong so can nhap: ");
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int count = 0; count < arr.length; count++) {
            System.out.println("Nhap so thu " + count + ": ");
            arr[count] = Integer.parseInt(br.readLine());
        }
        for (int i : arr) {
            System.out.println("arr[" + c++ + "]: " + i);
        }

    }
}
