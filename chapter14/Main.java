public class Main {
  public static void main(String[] args){

    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 10;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 10;
    Hero h3 = h2;

    if (h1.equals(h2) == true){
      System.out.println("同じ内容です");
    } else {
      System.out.println("違う内容です");
    }

    if (h2 == h3){
      System.out.println("等値(同アドレスです)");
    } else {
      System.out.println("等価（違うアドレスだけどequalsです)");
    }
  }
}