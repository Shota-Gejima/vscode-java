public class Main  {
  public static void main(String[] args){

    Hero h = new Hero();
    h.hp = 100;
    h.name = "げじ";

    Matango m = new Matango('B');
    
    PoisonMatango pm = new PoisonMatango('A');
    pm.attack(h);
  }
}