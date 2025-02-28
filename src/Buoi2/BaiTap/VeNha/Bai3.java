package Buoi2.BaiTap.VeNha;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        int giaCoBan = 1000;
        int giaVuotMuc = 1200;
        int tongTien;
        if (soDien <= 50) {
            tongTien = soDien * giaCoBan;
        } else {
            tongTien = (50 * giaCoBan) + ((soDien - 50) * giaVuotMuc);
        }
        System.out.println("Tổng tiền điện phải trả: " + tongTien + " VND");
    }
}
