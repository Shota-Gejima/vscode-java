package lesson12;

public class Main {
  public static void main(String[] args){
    X obj = new A();
    obj.a();
    // obj.b();
    // obj.c();

    Y y1 = new A();
    Y y2 = new B();

    y1.a();
    y2.a();

    Y[] array = new Y[2];
    array[0] = new A();
    array[1] = new B();

    for (Y num : array){
      num.b();
    }
  }
  
}
