public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack(){
    System.out.println(this.name+"は、"+this.sword.name+"攻撃した");
    System.out.println("敵に5ポイントのダメージを与えた");
  }

  // コンストラクタ hpフィールドを100で初期化 引数ありのコンストラクタ
  public Hero(String name){
    this.hp = 100;
    this.name = name;
  }
  // 引数なしのコンストラクタをオーバーロード
  public Hero(){
    this("ダミー");
  }
}
