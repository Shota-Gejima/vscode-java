public class Main {
  public static void main(String[] args){
    Wizard wz = new Wizard();
    Hero h = new Hero();
    Wand w = new Wand();
    wz.setWand(w);
    w.setPower(0.5);
    h.setName("ミナト");
    h.setHp(100);
    wz.heal(h);
  }
}
