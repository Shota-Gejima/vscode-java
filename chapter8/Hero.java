public class Hero {
  // 属性の定義
  // フィールドの追加
  String name;
  int hp;
  int level = 10;
  // 操作の定義
  public void attack(){}
  public void sleep(){
    this.hp =100;
    System.out.println(this.name+"は眠って回復した");
  }
  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name+"は"+sec+"秒座った");
    System.out.println("hpが"+sec+"ポイント回復した");
  }
  public void slip(){
    this.hp -= 5;
    System.out.println(this.name+"は転んだ");
    System.out.println("5のダメージ");
  }
  public void run(){
    System.out.println(this.name+"は、逃げ出した");
    System.out.println("GAME OVER");
    System.out.println("最終HPは"+this.hp+"でした");
  }
}
// フィールドを用いるときは明示的にthisをつける