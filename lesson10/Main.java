public class Main {
  public static void main(String[] args){
    // 練習10-1
    // ⓶、⓷、⓹

    // 練習10-2
    // [1]electronics→phone→iphone
    // [2]vehicle→car→bus
    // [3]book→dictionary→botanical dictionary

    // 練習10-3
    Hero h = new Hero();
    Matango m = new Matango('A');
    PoisonMatango pm = new PoisonMatango('B');
    m.attack(h);
    pm.poisonAttack(h);
    pm.poisonAttack(h);
    pm.poisonAttack(h);
    pm.poisonAttack(h);
    pm.poisonAttack(h);
    pm.poisonAttack(h);
  }
}