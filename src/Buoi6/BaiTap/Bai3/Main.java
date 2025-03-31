package Buoi6.BaiTap.Bai3;

import Buoi6.BaiTap.Bai2.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Account[] accounts = new Account[10];
       int i;
       for (i = 0 ; i < 10 ; i++){
           accounts[i] = new Account(i,100,0);
       }

        System.out.println("Nhap id tai khoan :");
        int id = new Scanner(System.in).nextInt();
        if (id<0 || id >9){
            System.out.println("id khong hop le , hay nhap lai id :");
        }
    }
}
