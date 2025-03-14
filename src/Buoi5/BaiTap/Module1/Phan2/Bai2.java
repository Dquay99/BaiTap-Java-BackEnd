package Buoi5.BaiTap.Module1.Phan2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhap vao so tu 1 den 7 :");
        int days = new Scanner(System.in).nextInt();
        switch (days) {
            case 1:
                System.out.println("Day la chu nhat");
                break;
            case 2:
                System.out.println("Day la thu hai");
                break;
            case 3:
                System.out.println("Day la thu ba");
                break;
            case 4:
                System.out.println("Day la thu tu");
                break;
            case 5:
                System.out.println("Day la thu nam");
                break;
            case 6:
                System.out.println("Day la thu sau");
                break;
            case 7:
                System.out.println("Day la thu bay");
                break;
        }
    }
}
