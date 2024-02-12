public class Main {
  // 練習12-1
  // (1)Sword, Item, Sword, Item
  // (2)Monster, Slime, Slime, Monster
  public static void main(String[] args){
    // 練習12-2
    // ⓵
    X obj = new A();
    obj.a();
    // obj.b();
    // obj.c();
    // ⓶
    Y y1 = new A();
    Y y2 = new B();
    y1.a();
    y2.a();
    // Aa, Ba

    // 練習12-3
    // ⓵ X
    // ⓶ 
    Y [] y = new Y [2];
    y[0] = new A();
    y[1] = new B();

    for (Y arrayY : y){
      arrayY.b();
    }
  }
}
