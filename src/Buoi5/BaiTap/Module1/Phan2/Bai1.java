package Buoi5.BaiTap.Module1.Phan2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen :");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Day la so chan");
        }else {
            System.out.println("Day la so le");
        }
    }
}
