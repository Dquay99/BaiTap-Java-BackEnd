package Buoi5.BaiTap.Module1.Phan3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("nhap vao 1 chuoi :");
        String str = new Scanner(System.in).nextLine();
        StringBuilder daoNguoc = new StringBuilder(str).reverse();
        if(str.equals(daoNguoc.toString())){
            System.out.println("day la chuoi doi xung");
        }else {
            System.out.println("day khong phai chuoi doi xung");
        }

    }
}
