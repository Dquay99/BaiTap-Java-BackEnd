package Buoi6.BaiTap.Bai2;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1122 , 20000 , 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("so du hien tai la :" + account.getBalance());
        System.out.println("Tien lai hang thang :" + account.getMonthlyInterestRate());
        System.out.println("ngay tai khoan duooc tao : " + account.getDateCreated());

    }
}
