package Buoi6.BaiTap;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Elephant());
        animals.add(new Monkey());

        for (Animal animal : animals) {
            animal.makeSound();
            animal.Action();
            System.out.println();
        }
    }
}
