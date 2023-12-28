public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    h.name = "ゲジ";
    h.hp = 100;
    
    System.out.println(h.hp);
    PoisonMatango mp = new PoisonMatango('A');
    mp.attack(h);
    System.out.println(h.hp);
  } 
}