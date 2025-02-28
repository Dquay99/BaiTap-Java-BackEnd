package Buoi2.BaiTap.VeNha;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                if (a == b || a == c || b == c) {
                    System.out.println("Đây là tam giác vuông cân.");
                } else {
                    System.out.println("Đây là tam giác vuông.");
                }
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }

        } else {
            System.out.println("Ba cạnh trên không tạo thành tam giác.");
        }

    }
}