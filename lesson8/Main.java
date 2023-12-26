public class Main{
  public static void main(String[] args){
    
    Cleric c = new Cleric();
    c.name = "げじ";

    c.selfAid();
    int returnRecoveryActual = c.pray(2);
    System.out.println("mpが" + returnRecoveryActual + "回復した!");
  }
}
