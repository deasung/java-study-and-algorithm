package 김영한.실전자바_기본편.class1.oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}
