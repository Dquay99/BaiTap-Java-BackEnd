package Buoi2.BaiTap.TrenLop;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        System.out.println("Nhập vào chiều dài hình chữ nhật :");
        int chieuDai = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào chiều rộng hình chữ nhật :");
        int chieuRong = new Scanner(System.in).nextInt();
        int dienTich = chieuRong * chieuDai;
        System.out.println("Diện tích của hình chữ nhật là :" + (chieuDai * chieuRong));

    }
}
