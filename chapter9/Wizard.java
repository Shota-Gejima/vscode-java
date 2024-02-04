public class Wizard {
  String name;
  int hp;

  public int heal(Hero h){
    h.hp += 10;
    System.out.println(h.name + "のHPを10回復した!");
    return h.hp;
  }
}
