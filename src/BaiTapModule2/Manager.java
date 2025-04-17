package BaiTapModule2;

class Manager extends Employee implements Workable  {
    private String department ;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager(String name, double salary, int age) {
        super(name, salary, age);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phòng ban của nhân viên :" + department);
    }

    @Override
    public void work() {
        System.out.println( getName() +" đang quản lý " + department );
    }
}
