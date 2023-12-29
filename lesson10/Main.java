public class Main  {
  public static void main(String[] args){
    Matango m = new Matango('B');

    PoisonMatango pm = new PoisonMatango('A');

    Hero h = new Hero();
    h.name = "ゲジ";
    h.hp = 100;

    pm.attack(h);
  }
}