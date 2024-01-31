public class Main {
  public static void main(String[] args){
    Cleric c = new Cleric();
    c.hp=50;
    c.mp=10;
    c.dmg();
    c.selfAid();
    System.out.println("聖職者のmpは"+c.mp);
    int mpRecovery = c.pray(1);
    System.out.println("聖職者のmpは"+c.mp+"になり、回復量は"+mpRecovery);
  }
}
