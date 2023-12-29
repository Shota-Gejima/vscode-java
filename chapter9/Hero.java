public class Hero{
  String name;
  int hp;
  Sword sword;

  public void attack(){
    System.out.println(this.name + "は、攻撃した!");
    System.out.println("敵に5ポイントのダメージをあたえた！");
    System.out.println(this.name + "は、" + this.sword.name + "で、攻撃した！");
  }

  public Hero(String h){
    this.hp = 100;
    this.name = h;
  }
  public Hero(){
    this.name = "ダミー";
  }
}