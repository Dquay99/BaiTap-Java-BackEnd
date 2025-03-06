package Buoi3.BaiTap.VeNha;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số nguyên dương n: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Vui lòng nhập số nguyên dương!");
            } else {
                long factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
                System.out.println(n + "! = " + factorial);
            }
    }
}
