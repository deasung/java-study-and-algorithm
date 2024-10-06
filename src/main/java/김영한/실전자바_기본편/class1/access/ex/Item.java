package 김영한.실전자바_기본편.class1.access.ex;

public class Item {
  private String name;
  private int price;
  private int quantity;
  public Item(String name, int price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  public String getName() {
    return name;
  }
  public int getTotalPrice() {
    return price * quantity;
  }
}