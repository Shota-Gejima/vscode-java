public abstract class Monster {
  int hp =50;
  String name;

  public Monster(String name){
    this.name = name;
  }

  public abstract void run();
  
}
