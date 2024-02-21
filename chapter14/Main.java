public class Main {
  public static void main(String[] args){
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;
    Hero.money = 1000;
    System.out.println(Hero.money+","+h1.money);
    h2.money = 5000;

    
    if (h1.equals(h2) == true){
      System.out.println("同じ内容です");
    } else {
      System.out.println("違う内容です");
    }
    System.out.println(Hero.money+","+h1.money);
  
    Hero.setRandomMoney();
    System.out.println(Hero.money);
    Hero h3 = new Hero();
    System.out.println(h1.money);
  }
}
