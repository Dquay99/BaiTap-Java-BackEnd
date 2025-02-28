package Buoi2.BaiTap.TrenLop;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        System.out.println("Nhập vào số A :");
        int soA = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số B :");
        int soB = new Scanner(System.in).nextInt();
        tinhTong(soA,soB);
        tinhTich(soA,soB);
        chiaHaiSo(soA,soB);
    }

    public static void tinhTong(int soA , int soB){
        System.out.println("Tong so A và B là : " + (soA +soB));
    }
    public static void tinhTich(int soA , int soB){
        System.out.println("Tích số A và B là : " + (soA * soB));
    }
    public static void chiaHaiSo(int soA , int soB){
        System.out.println("Thương của 2 số là :" + (soA / soB));
        System.out.println("Số dư của thương 2 số là :" + (soA % soB));
    }
}
