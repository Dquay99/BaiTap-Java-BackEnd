package Buoi7.BaiTap;

import java.util.Scanner;

abstract class Animal {
    protected String name;
    protected int age;
    protected String species;
    protected String color;

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public abstract void makeSound();

    public void inputInfo(){
        System.out.println("Nhap vao ten dong vat :");
        name = new Scanner(System.in).nextLine();

        System.out.println("Nhap vao tuoi cua dong vat:");
        age = new Scanner(System.in).nextInt();

        System.out.println("Nhap vao loai dong vat :");
        species = new Scanner(System.in).nextLine();

        System.out.println("Nhap vao mau sac cua dong vat :");
        color = new Scanner(System.in).nextLine();
    }

    public void displayInfo(){
        System.out.println("Day la con" + species + "ten la " + name + "," + age + "tuoi , co mau " + color);
    }
}
