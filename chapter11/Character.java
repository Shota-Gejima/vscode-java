// ⓶ 抽象メソッドを１つでも含むクラスは抽象クラスにしなければならない
// 抽象クラスとして宣言  インスタンス化(new)できなくなる
public abstract class Character {
  String name;
  int hp;
  public void run(){
    System.out.println(this.name + "は、逃げ出した");
  }

  // ⓵ abstractを付けると抽象メソッドになる
  public abstract void attack(Matango m);
}
