package 김영한.실전자바_기본편.class1.access;

public class BankAccountMain {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.deposit(10000);
    account.withdraw(3000);
    System.out.println("balance = " + account.getBalance());
  }
}