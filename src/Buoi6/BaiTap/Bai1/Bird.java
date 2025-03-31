package Buoi6.BaiTap.Bai1;

public class Bird extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping");
    }

    @Override
    public void action() {
        System.out.println("The bird is flying");
    }
}
