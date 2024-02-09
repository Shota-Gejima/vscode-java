public class PoisonMatango extends Matango{
  int count=5;

  public PoisonMatango(char suffix){
    super(suffix);
  }

  public void attack(Hero h){
    super.attack(h);
    if(count>0){
      System.out.println("さらに毒の胞子をばらまいた");
      int dmg = h.hp/5;
      h.hp-=dmg;
      System.out.println(dmg+"ポイントのダメージ!");
      count--;
      System.out.println("ヒーローのhpが"+h.hp+"になった");
      System.out.println("残りの回数は"+count+"回");
    }
  }
}
