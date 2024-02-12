public class Main {
  public static void main(String[] args){
    Matango m = new Matango('A');
    PoisonMatango pm = new PoisonMatango('B');
    Hero h = new Hero();
    h.hp = 200;

    m.attack(h);
    pm.attack(h);
  }
} 
