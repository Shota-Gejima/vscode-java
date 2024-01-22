public class Main {
  public static void main(String[] args){
    // コード3-1 if文
    boolean tenki = true;
    if (tenki == true){
      System.out.println("洗濯をします");
      System.out.println("散歩にいきます");
    } else {
      System.out.println("DVDをみます");
    }
    // コード3-2 while文
    boolean doorClose=true;
    while (doorClose==true){
      for (int i=1; i<=3; i++){
        System.out.println("ノックする");
        System.out.println("1分待つ");
      }
      break;
    }
    System.out.println("もう空きません");
    int age =18;
    if (!(age < 18)){System.out.println("18歳未満です");}
  } 
}
