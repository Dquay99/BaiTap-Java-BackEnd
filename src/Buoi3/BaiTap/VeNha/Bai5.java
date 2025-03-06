package Buoi3.BaiTap.VeNha;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Vui lòng nhập số nguyên dương!");
        } else {
            String binary = "";
            int temp = n;

            while (temp > 0) {
                binary = (temp % 2) + binary;
                temp /= 2;
            }

            System.out.println("Số nhị phân của " + n + " là: " + binary);
        }
    }
}
