public class Hero{
  String name = "ミナト";
  int hp;

  public void attack(Matango m){
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた！");
  }

  public void run(){
    System.out.println(this.name + "は、逃げ出した！");
  }

  public Hero(String name){
    this.name = name;
  }
}