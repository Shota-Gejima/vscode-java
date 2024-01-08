public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    // Heroクラスでnameをprivate宣言しているためフィールドに直接代入できない
    // h.name = "ミナト";
    // System.out.println(h.name);

    // Heroクラスのセッターメソッドで代入し、ゲッターメソッドで呼び出す
    h.setName("すがわら");
    System.out.println(h.getName());
  }
}