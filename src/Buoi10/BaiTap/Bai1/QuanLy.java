package Buoi10.BaiTap.Bai1;

import java.util.Scanner;

public class QuanLy extends NhanVien{
    private double heSoChucVu;

    public QuanLy() {}

    public QuanLy(String maNV, String hoTen, int tuoi, double luongCoBan, double heSoChucVu) {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.heSoChucVu = heSoChucVu;
    }

    @Override
    public double tinhLuong() {
        double luongCoBan=0;
        return luongCoBan * heSoChucVu;
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhập hệ số chức vụ: ");
        heSoChucVu = Double.parseDouble(scanner.nextLine());
    }
}
