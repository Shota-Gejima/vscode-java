package lesson13;

public class Wizard {
  int hp;
  int mp;
  String name;
  Wand wand;

  void heal (Hero h){
    int basePoint = 10;
    int recovPoint =
      (int)(basePoint * this.wand.power);
    h.setHp(h.getHP() + recovPoint);
    System.out.println(h.getName() + "HPのを" + recovPoint + "回復した!");
  }
}
