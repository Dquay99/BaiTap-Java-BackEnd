package Buoi6.BaiTap;

public class Monkey extends Animal{
    @Override
    public void Action() {
        System.out.println("The monkey is climbing trees.");
    }

    @Override
    public void makeSound() {
        System.out.println("Khec khec khec");
    }
}
