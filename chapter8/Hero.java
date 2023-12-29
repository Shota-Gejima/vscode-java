public class Hero {
  String name;
  int hp;

  public void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した");
    System.out.println("残り" + this.hp);
  }

  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った!");
    System.out.println(this.name + "は、" + sec + "ポイント回復した");
    System.out.println("残り" + this.hp);
  }

  public void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
    System.out.println("残り" + this.hp);
  }

  public void run(){
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終hpは、" + this.hp +"でした。");
  }
}