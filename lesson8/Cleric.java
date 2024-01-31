import java.util.*;
public class Cleric {
  String name;
  int hp;
  final int MAX_HP = 50;
  int mp;
  final int MAX_MP = 10;

  public void dmg(){
    this.hp -= 30;
    System.out.println("聖職者のhpは"+this.hp+"になった");
  }
  public void selfAid(){
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("mpを5減らすことで"+this.MAX_HP+"まで回復した");
  }

  public int pray(int sec){
    System.out.println(sec+"秒間祈った");
    int recovery = new Random().nextInt(3)+sec;
    System.out.println(recovery);
    int realRecovery = Math.min(MAX_MP-this.mp, recovery);
    this.mp += realRecovery;
    return realRecovery;
  }
}
