package Buoi5.BaiTap.Module1.Phan3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("nhap vao 1 chuoi :");
        String str = new Scanner(System.in).nextLine();

        StringBuilder daoNguoc = new StringBuilder(str).reverse();
        System.out.println("chuoi dao nguoc la :" + daoNguoc);
    }
}
