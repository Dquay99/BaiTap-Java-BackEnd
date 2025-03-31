package Buoi10.BaiTap.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    private ArrayList<NhanVien> danhSachNV = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themNhanVien(NhanVien nv) {
        nv.nhapThongTin(scanner);
        danhSachNV.add(nv);
    }

    public void hienThiDanhSach() {
        for (NhanVien nv : danhSachNV) {
            nv.hienThiThongTin();
            System.out.println("---------------------------");
        }
    }

    public void menu() {
        int choice;
        do {
            System.out.println("\n----- Quản lý nhân viên -----");
            System.out.println("1. Thêm nhân viên văn phòng");
            System.out.println("2. Thêm kỹ sư");
            System.out.println("3. Thêm quản lý");
            System.out.println("4. Hiển thị danh sách nhân viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    themNhanVien(new NhanVienVanPhong());
                    break;
                case 2:
                    themNhanVien(new KySu());
                    break;
                case 3:
                    themNhanVien(new QuanLy());
                    break;
                case 4:
                    hienThiDanhSach();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }
}
