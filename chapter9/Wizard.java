public class Wizard{
  String name;
  int hp;
  public void heal(Hero h){
    h.hp += 10;
    System.out.println(this.name + "は、(hp " + this.hp +")" + h.name + "のHPを10回復し、" + h.hp + "になった！");
  }
}