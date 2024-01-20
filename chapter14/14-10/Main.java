public class Main {
  public static void main(String[] args) {
    Hero.money = 100;
    System.out.println(Hero.money);

    Hero.setRandomMoney();
    System.out.println(Hero.money);

    Hero h1 = new Hero(); 
    System.out.println(h1.money);
  }
}
