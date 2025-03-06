package Buoi3.BaiTap.VeNha;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n;
        do {
            System.out.print("Nhập một số nguyên dương n: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next();
            }
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập một số nguyên dương.");
            }
        } while (n <= 0);
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 3);
        }

        System.out.println("Tổng S(" + n + ") = " + sum);
    }
}
