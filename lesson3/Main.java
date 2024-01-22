public class Main {
  public static void main(String[] args) {
    // 練習3-1
    // int weight = 60;
    // if (weight == 60){
      // System.out.println("60に等しい");}
    // (age1+age2)*2 > 60;
    // age%2==1;
    // char name = '湊';
    // name.equals('湊');
    // 練習3-2選択問題
    // C,D,E

    // 練習3-3
    int isHungry = new java.util.Random().nextInt(2);
    String food = "おにぎり";
    System.out.println("こんにちは");
    if (isHungry==0){
      System.out.println("お腹がいっぱいです。");
    } else {
      System.out.println("腹ペコです");
      System.out.println(food+"をいただきます");
      System.out.println("ごちそう様でした");
    }
    // 練習3-4
    boolean tenki =true;
    if (tenki == true){
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("DVDを見ます");
      System.out.println("寝ます");
    }
    // 練習3-5;
    System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected){
      case 1:
      System.out.print("検索します");
      break;
      case 2:
      System.out.print("登録します");
      break;
      case 3:
      System.out.print("削除します");
      break;
      case 4:
      System.out.print("変更します");
      break;
    }
    // 練習3-6
    System.out.println("[数あてゲームをします]");
    int ans = new java.util.Random().nextInt(10);
    System.out.println(ans);
    for (int i =1; i<=5; i++){
      System.out.println(i+"回目、0~9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (ans == num){
        System.out.println("あたり！");
        break;
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します");
  }
}
