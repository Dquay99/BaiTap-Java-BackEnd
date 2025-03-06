package Buoi3.BaiTap.VeNha;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao 1 so nguyen :");
            int number = 0;
            number = sc.nextInt();
            int reverse = 0;
            int digit = 0;
            while (number != 0){
                digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number /10;
            }
        System.out.println("so dao nguoc la : " + reverse);
    }
}
