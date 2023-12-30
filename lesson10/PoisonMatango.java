public class PoisonMatango extends Matango  {
  int count = 5;
  
  public void attack(Hero h)  {
    super.attack(h);
    if (this.count > 0){
      System.out.println("さらに毒の胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      count--;
      System.out.println("残りカウントは、" + count + "で、" + h.name + "の残りhpは、" + h.hp);
    }
  }

  public PoisonMatango(char suffix){
    super(suffix);
  }

}