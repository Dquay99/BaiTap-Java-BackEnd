package Buoi5.BaiTap.Module1.Phan1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int a = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Tổng của " + a + " và " + b + " là: " + sum);
    }
}
