public class Hero {
  String name;
  int hp;
  static int money;

  public static void setRandomMoney(){
    Hero.money = (int)(Math.random() * 1000);
    // ↓以下はstatic付いていないフィールドを使用しようとしているためコンパイル
    // System.out.println(this.name + "たちの所持金を初期化しました");
  }

}
