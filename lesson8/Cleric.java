import java.util.*;
public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp =10;
  final int MAX_MP = 10;

  public void dmg(){
    this.hp -= 30;
    System.out.println("聖職者のhpが"+this.hp+"になった");
  }

  public void selfAid(){
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("mpが"+this.mp+"になったが聖職者のhpが"+MAX_HP+"になった");
  }

  public int pray(int sec){
    // 理論上の回復量
    int recovery = new Random().nextInt(3)+sec;
    System.out.println("理論上の回復量が"+recovery);
    // 実際の回復量
    int realRecovery = Math.min(MAX_MP-this.mp, recovery);
    this.mp += realRecovery;
    return realRecovery;
  }

}
