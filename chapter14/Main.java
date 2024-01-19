public class Main {
  public static void main(String[] args){
    // 14-2-1
    Empty e = new Empty();
    String s = e.toString();
    System.out.println(s);
    // 14-2-2
    Object o1 = new Empty();
    Object o2 = new Empty();
    Object o3 = "こんにちわ";
    System.out.println(o3);
    // 14-3
    e.printAnything("やっほー");

    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println(h.toString());
  }
}