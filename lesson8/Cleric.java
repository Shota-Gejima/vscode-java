import java.util.*;

public class Cleric{
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  public void selfAid(){
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println(this.name + "は、mp" + this.mp +
    "を減らすことで" + "hpをMaxまで回復した！");
  }

  public int pray(int sec){
    System.out.println(this.name + "は、" + sec + "秒間祈った！");
    int recovery = new Random().nextInt(3) + sec;
    int recoveryActual = Math.min(this.MAX_MP - this.mp, recovery);
    return recoveryActual;
  }
}