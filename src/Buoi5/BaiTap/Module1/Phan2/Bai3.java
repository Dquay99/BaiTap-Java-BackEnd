package Buoi5.BaiTap.Module1.Phan2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("nhap so chuyen di :");
        int move = new Scanner(System.in).nextInt();
        int price = 10000;
        double discount = 0;
        if(move >10){
            discount = 0.2;
        }else if ( move > 5){
            discount = 0.1;
        }
        double total = move * price * (1-discount);
        System.out.println("so tien phai tra la :" + total + "VND");
    }
}
