package Buoi6.BaiTap.Bai1;


import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Elephant());
        animals.add(new Lion());
        animals.add(new Monkey());
        animals.add(new Bird());

        for (Animal animal : animals) {
            animal.action();
            animal.makeSound();
        }
    }
}
