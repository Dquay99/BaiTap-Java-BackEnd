package Buoi10.BaiTap.Bai1;

import java.util.Scanner;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private int tuoi;
    private double luongCoBan;

    public NhanVien(){}

    public NhanVien(String maNV, String hoTen, int tuoi, double luongCoBan) {
            this.hoTen = hoTen;
            this.maNV = maNV;
            this.tuoi = tuoi;
            this.luongCoBan = luongCoBan;
    }

    public abstract double tinhLuong();

    public void hienThiThongTin() {
        System.out.println("Mã NV: " + maNV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Lương thực nhận: " + tinhLuong());
    }

    public void nhapThongTin(Scanner scanner) {
        System.out.print("Nhập mã NV: ");
        maNV = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = Double.parseDouble(scanner.nextLine());
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
