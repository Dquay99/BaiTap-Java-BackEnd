package Buoi3.BaiTap.VeNha;

public class Bai4 {
    public static void main(String[] args) {
        int tong = 200000;
        int menhGia1 = 1000;
        int menhGia2 = 2000;
        int menhGia3 = 5000;

        int tongSoToMenhGia1 = tong / menhGia1;
        int tongSoToMenhGia2 = tong / menhGia2;
        int tongSoToMenhGia3 = tong / menhGia3;

        int soToMenhGia1 =0;
        int soToMenhGia2 =0;
        int soToMenhGia3 = 0;
        int tongTienMenhGia1 = 0;
        int tongTienMenhGia2 = 0;
        int tongTienMenhGia3 = 0;

        for(int i = 1; i <= tongSoToMenhGia1; i++ ){
           soToMenhGia1 = i;
            for(int h = 1; h <= tongSoToMenhGia2;h++){
                soToMenhGia2 = h;
                for(int c = 1; c <= tongSoToMenhGia3;c++ ){
                     soToMenhGia3 = c;

                    tongTienMenhGia1 = soToMenhGia1 * menhGia1;
                    tongTienMenhGia2 = soToMenhGia2 * menhGia2;
                    tongTienMenhGia3 = soToMenhGia3 * menhGia3;

                    if(tong == (tongTienMenhGia1 + tongTienMenhGia2 + tongTienMenhGia3)){
                        System.out.println(String.format("Số tờ 1000 = %d" , "Số tờ 2000 = %d" , "Số tờ 5000 = %d",soToMenhGia1,soToMenhGia2,soToMenhGia3));
                    }
                }
            }

        }

    }
}
