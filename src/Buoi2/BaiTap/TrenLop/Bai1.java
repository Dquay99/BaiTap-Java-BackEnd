package Buoi2.BaiTap.TrenLop;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        System.out.print("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
        String ngaySinh = scanner.nextLine();

        System.out.print("Nhập quê quán: ");
        String queQuan = scanner.nextLine();

        System.out.print("Nhập tên trường học: ");
        String truongHoc = scanner.nextLine();

        System.out.println("\nXin chào " + hoTen + " đến từ " + queQuan +
                ", sinh ngày " + ngaySinh + ", học tại trường " + truongHoc + ".");
    }
}
