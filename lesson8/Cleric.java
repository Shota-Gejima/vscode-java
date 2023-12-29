public class Cleric{
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;
  String name;

  public void selfAid(){
    this.mp -= 5;
    this.hp = MAX_HP;
    System.out.println("mpを" + this.mp + "ポイント犠牲にすることでhpがMAXの" + MAX_HP + "まで回復した！");
  }

  public int pray(int sec){
    int secMp = new java.util.Random().nextInt(3) + sec;
    int ansMp = Math.min(this.MAX_MP - this.mp, secMp);
    this.mp += ansMp;
    return ansMp;
  }
}