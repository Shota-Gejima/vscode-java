public class PoisonMatango extends Matango{
  int poisonCount = 5;

  public PoisonMatango(char suffix){
    super(suffix);
  }

  public void attack(Hero h){
    System.out.println("勇者の残りのhpは" + h.hp);
    super.attack(h);
    if (this.poisonCount > 0){
      System.out.println("更に毒の胞子をばらまいた");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisonCount--;
      System.out.println(poisonCount);
      System.out.println("勇者の残りのhpは" + h.hp);
    }

  }
}
