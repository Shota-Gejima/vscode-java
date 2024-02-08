public class Hero{
  String name = "ミナト";
  int hp =100;

// メソッドにfinalを付けるとクラスの継承は許可するがメソッドのオーバーライドは禁止にすることができる 
  // public final void run(){
  public void run(){
    System.out.println(this.name + "は、逃げ出した！");
  }

  public void attack(Matango m){
    m.hp -= 5;
    System.out.println(this.name + "の攻撃!");
    System.out.println(m.name + "は" + "5のダメージ");
  }
  public Hero(){
    System.out.println("Heroのコンストラクタが起動");
  }
}