package Buoi10.BaiTap.Bai1;

import java.util.Scanner;

public class KySu extends NhanVien {
    private String chuyenMon;

    public KySu() {}

    public KySu(String maNV, String hoTen, int tuoi, double luongCoBan, String chuyenMon) {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.chuyenMon = chuyenMon;
    }

    @Override
    public double tinhLuong() {
        double luongCoBan =0;
        return luongCoBan + 2000000;
    }

    @Override
    public void nhapThongTin(Scanner scanner) {
        super.nhapThongTin(scanner);
        System.out.print("Nhập chuyên môn: ");
        chuyenMon = scanner.nextLine();
    }
}
