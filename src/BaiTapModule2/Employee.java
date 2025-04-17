package BaiTapModule2;

public class Employee implements Workable {
   private String name ;
   private int age ;
   private double salary ;

    public void displayInfo(){
        System.out.println("Tên nhân viên : " + name);
        System.out.println("Tuổi nhân viên : " + age);
        System.out.println("Lương của nhân viên : " + salary);
    }

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public void work() {
        System.out.println(name + "đang in tài liệu");
    }

}
