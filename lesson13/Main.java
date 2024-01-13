package lesson13;
public class Main {
  public static void main(String[] args){
    Hero h = new Hero();
    Wand w = new Wand();
    Wizard wz = new Wizard();

    h.hp = 100;
    wz.setWand().setPower(2.0);
    wz.heal(h);
    // System.out.println(w.getPower());
  }
}
