package Buoi7.BaiTap.Bai1;

import java.util.Scanner;

public abstract class Animal {
    private int age;
    private String name;
    private String species;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void makeSound();

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập loài: ");
        this.species = scanner.nextLine();
        System.out.print("Nhập màu sắc: ");
        this.color = scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Loài: " + species);
        System.out.println("Màu sắc: " + color);
    }
}
