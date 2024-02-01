import java.util.*;
public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid(){
    this.mp -= 5;
    this.hp = MAX_HP;
  }

  public void dmg(){
    this.hp -= 20;
  }

  public int pray(int sec){
    // 理論上の回復量
    int recovery = new Random().nextInt(3)+sec;
    // 実際の回復量
    int realRecovery = Math.min(this.MAX_MP-this.mp, recovery);
    this.mp += realRecovery;
    return realRecovery;
  }
}
