package Buoi5.BaiTap.Module1.Phan4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhap so luong phan tu trong mang muon nhap :");
        int number = new Scanner(System.in).nextInt();
        int n = new Scanner(System.in).nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }


    }
}
