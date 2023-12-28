public class PoisonMatango extends Matango{
  int poisonCount = 5;

  public PoisonMatango(char suffix){
    super(suffix);
  }

  public void attack(Hero h){
    super.attack(h);
    if (this.poisonCount > 0){
      System.out.println("さらに胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisonCount--;
    }
    System.out.println(h.name + h.hp +"　"+ poisonCount);
  }
}