public class Main {
  public static void main(String[] args){
  // コード5-4,5-5 引数
    System.out.println("メソッドを呼び出します");
    hello("湊", "こんばんは");
    hello("アサカ", "こんにちは");
    hello("スガワラ","さようなら");
  }
  public static void hello(String name, String word){
    System.out.println(name+"さん"+word);
  }
}
