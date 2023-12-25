public class Sample{
  public static void main(String[] args) throws Exception {
    int isHungry = 0;
    String food = "おにぎり";
    
    System.out.println("こんにちは！");
    if (isHungry == 0){
      System.out.println("おなかいっぱいです");
    } else {
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
    }
    Thread.sleep(3000);
    System.out.println("ごちそうさまでした。");
  
    
    System.out.println("「メニュー」1: 検索 2: 登録 3: 削除 4: 変更");
    System.out.println("1～4で入力してください");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected){
      case 1:
      System.out.println("検索します");
      break;

      case 2:
      System.out.println("登録します");
      break;

      case 3:
      System.out.println("削除します");
      break;

      case 4:
      System.out.println("変更します");
      break;
    }

    System.out.println("[数あてゲーム]");
    int ans = new java.util.Random().nextInt(10);

    for (int i=1; i <= 5; i++){
      System.out.println(i + "回目");
      System.out.println("0～9の数字を入力してください");

      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans){
        System.out.println("アタリ");
        break;
      } else {
        System.out.println("違います");
        System.out.println(ans);
      }
    }
    System.out.println("ゲームを終了します");
  }
}