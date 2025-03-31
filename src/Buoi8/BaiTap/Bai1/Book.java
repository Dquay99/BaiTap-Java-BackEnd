package Buoi8.BaiTap.Bai1;

import java.util.Scanner;

public abstract class Book {
    private int id;
    private String title;
    private int year;
    private String author;

    public void displayInfo(){
        System.out.println("ID :" + id);
        System.out.println("Title :" + title);
        System.out.println("Year :" + year);
        System.out.println("Author :" + author);
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID :");
        id = sc.nextInt();
        System.out.println("Enter Title :");
        title = sc.nextLine();
        System.out.println("Enter Year :");
        year = sc.nextInt();
        System.out.println("Enter Author");
        author = sc.nextLine();
    }

    public Book(int id, String title, int year, String author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }
}
