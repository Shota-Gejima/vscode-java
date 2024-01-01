package practice;
public class Main{
  public static void main(String[] args){

    Cleric c = new Cleric();
    c.selfAid();
    int ans = c.pray(2);
    System.out.println("実際に回復した量は" + ans + "ポイントで、最終mp数は" + c.mp );
  }
}