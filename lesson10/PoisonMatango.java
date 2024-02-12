public class PoisonMatango extends Matango{
  int poisonCount = 5;

  public PoisonMatango(char suffix){
    super (suffix);
  }

  public void attack(Hero h){
    super.attack(h);
    if (poisonCount>=0){
      System.out.println("さらに毒の胞子をばら撒いた！");
      int dmg = h.hp/5;
      h.hp -= dmg;
      System.out.println("勇者の残りのHPは"+h.hp);
      System.out.println(dmg + "ポイントのダメージ!");
      poisonCount--;
      System.out.println("残りの毒攻撃の回数は"+ poisonCount+"回");
    }
  }
}
