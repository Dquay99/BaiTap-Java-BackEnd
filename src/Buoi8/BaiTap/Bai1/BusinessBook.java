package Buoi8.BaiTap.Bai1;

import java.util.Scanner;

public class BusinessBook extends  Book {
    private String businessField;

    public BusinessBook(int id, String title, int year, String author, String vũTrụ) {
        super(id, title, year, author);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Business Field :" + businessField);
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("Enter Business Field :");
        businessField = new Scanner(System.in).nextLine();
    }
}
