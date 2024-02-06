public class Main {
  public static void main(String[] args){
    Thief t1 = new Thief("ミナト", 40,5);
    System.out.println(t1.name+ t1.hp+t1.mp);
    Thief t2 = new Thief("アサカ", 35);
    System.out.println(t2.name+ t2.hp+t2.mp);
    Thief t3 = new Thief("スガワラ");
    System.out.println(t3.name+ t3.hp+t3.mp);
  }
}
