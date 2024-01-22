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
    int age = 17;
    if (age > 10 && age <18){
      System.out.println("10歳より大きく、18歳未満です");
    } else {System.out.println("それ以外です");}
    // switch文
    int numFortune = new java.util.Random().nextInt(4);
    switch (numFortune){
      case 1:
      System.out.println("大吉");
      break;
      case 2:
      System.out.println("中吉");
      break;
      case 3:
      System.out.println("吉");
      break;
      case 4:
      System.out.println("凶");
      break;
    }
    // for文
    for (int i=1; i <= 3; i++){
      if (i!=3){
        System.out.print("現在"+i+"週目→");
      } else {
        System.out.print("現在"+i+"週目");
      }
    }
    // コード3-9 九九
    for (int x=1; x<=9; x++){
      for (int y=1; y<=9; y++){
        System.out.print(x*y + " ");
      }
      System.out.println(" ");
    }
    String nameA = "太郎";

    if (nameA.equals("夕日")){
      System.out.println("同じ名前です");
    } else {System.out.println("違う名前です");}
  }
} 
