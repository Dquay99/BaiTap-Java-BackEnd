package Buoi5.BaiTap.Module1.Phan1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius *radius);
        System.out.println("Diện tích hình tròn là: " + area);

        if (area % 2 == 0) {
            System.out.println("Diện tích làm tròn là số chẵn.");
        } else {
            System.out.println("Diện tích làm tròn là số lẻ.");
        }
    }
}
