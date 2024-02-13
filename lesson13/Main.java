public class Main {
  // 練習13-1
  public static void main(String[] args){
    Wand w = new Wand();
    Wizard wz = new Wizard();
    Hero h = new Hero();
    wz.setName("ミナト");
    h.setHp(100);
    h.setName("アサカ");
    wz.setWand(w);
    w.setPower(1.2);
    wz.heal(h);
    // 練習13-2
    // Wizard.wandが未定義 Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Wand.getPower()" because "this.wand" is null
    // 練習13-3

  }
}
