public class Matango {
  int hp =50;
  char suffix;

  public Matango (char suffix){
    this.suffix = suffix;
  }

  public void attack(Hero h){
    System.out.println("キノコ"+ this.suffix+"の、攻撃");
    System.out.println("5のダメージ");
    h.hp -= 5;
    System.out.println(h.name+"のHPが"+h.hp+"になった");
  }
}
