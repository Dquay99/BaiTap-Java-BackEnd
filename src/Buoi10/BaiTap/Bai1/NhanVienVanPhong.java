package Buoi10.BaiTap.Bai1;

public class NhanVienVanPhong extends NhanVien {
    private int soNgayLamViec;

    public NhanVienVanPhong() {}

    public NhanVienVanPhong(String maNV, String hoTen, int tuoi, double luongCoBan, int soNgayLamViec) {
        super(maNV, hoTen, tuoi, luongCoBan);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public double tinhLuong() {
        double luongCoBan = 0;
        return luongCoBan + soNgayLamViec * 100000;
    }
}
