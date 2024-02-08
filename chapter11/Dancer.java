public class Dancer extends Character {

  public void dance(){
    System.out.println(this.name+"は、情熱的に踊った");
  }
  // 親クラス(Character)はabstract(抽象クラス)であり、attackメソッドは抽象メソッドなので
  // 必ずオーバーライドをしなければならない
  public void attack(Matango m){
    System.out.println(this.name+"の攻撃");
    System.out.println("敵に3ポイントのダメージ!");
    m.hp -= 3;
  }
}
