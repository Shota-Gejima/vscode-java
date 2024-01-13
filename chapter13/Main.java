public class Main{
  public static void main(String[] args){
    Human h = new Human();
    // Heroクラスでnameをprivate宣言しているためフィールドに直接代入できない
    // h.name = "ミナト";
    // System.out.println(h.name);

    // Heroクラスのセッターメソッドで代入し、ゲッターメソッドで呼び出す
    h.setName("ミナト");
    System.out.println(h.getName());
  }
}