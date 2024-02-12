public class Main {
  public static void main(String[] args){
    Monster[] monsters = new Monster[3];
    monsters[0] = new Goblin("ゴブリン");
    monsters[1] = new Slime("スライム");
    monsters[2] = new DeathBat("地獄コウモリ");

    for (Monster m: monsters){
      m.run();
    }
  }
}
