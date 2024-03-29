import java.util.Scanner;
public class Main{  
  public static void main(String[] args){
    // 例題2
    // 要素数20の配列を宣言し、要素に0から5ずつ傘㎜して代入させる
    int array[] = new int [20];
    for (int i=0; i<array.length; i++){
      array[i] = i*5;
    }

    for (int i=0; i<array.length; i++){
      System.out.print(array[i]);
      if (i!=19){
        System.out.print(",");
      }
    }
    System.out.println();
    // [0]~[10]の奇数のみカンマ区切りで表示
    for (int i=0; i<=10; i++){
      if (array[i]%2!=0){
        System.out.print(array[i]);
        if (i!=10-1){
          System.out.print(",");
        }
      }
    }
    System.out.println();
    // [11]~[19]の偶数のみカンマ区切りで表示
    for (int i=11; i<=19; i++){
      if (array[i]%2==0){
        System.out.print(array[i]);
        if (i!=19-1){
          System.out.print(",");
        }
      }
    }
    System.out.println();
    // 例題3 要素10の文字列配列を宣言し、配列に「apple」「orange」「banana」
    // 「grape」「kiwi」「mango」「peach」「strawberry」「blueberry」「raspberry
    // 」の果物の名前を代入してください。その後、配列の要素をカンマ区切りで表示するJavaのコードを書いてください。
    String[] arrayFruits = {"apple", "orange","banana", "grape", "kiwi", "mango", "peach", "strawberry", "blueberry", "rasberry"};
    for (int i=0; i<arrayFruits.length; i++){
      System.out.print(arrayFruits[i]);
      if (i!=10-1){
        System.out.print(",");
      }
    }
    System.out.println();
    // 例題4 変数 num1 と num2 にそれぞれ整数 5 と 10 を代入し、それらの変数を足して結果を表示するJavaのコードを書いてください。
    int num1 = 5; int num2 = 10;
    System.out.println("num1+num2="+ (num1 + num2));
    // 例題5 半径が 3.0 の円の面積を計算し、結果を表示するJavaのコードを書いてください。円周率は3.14とします。
    final double PI = 3.14;
    double radius = 3.0;
    double circleArea = radius*radius*PI;
    System.out.println("円の面積は"+circleArea+"です");

    // 例題6 ユーザーに名前を尋ね、入力された名前を使って挨拶メッセージを表示するJavaのコードを書いてください。
    System.out.println("あなたの名前をおしえてください。");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("こんにちは！"+name+"さん。");
    // 例題7 ユーザーに身長（メートル）と体重（キログラム）を入力させ、BMI（Body Mass Index）を計算して表示するJavaのプログラムを書いてください。BMIの計算式はBMI = 体重 / (身長 * 身長)です。
    System.out.println("あなたの身長をおしえてください  ");
    double height = new java.util.Scanner(System.in).nextDouble();
    System.out.println("あなたの体重を教えて下さい");
    double weight = new java.util.Scanner(System.in).nextDouble();
    System.out.println("あなたのBMIは"+(weight/(height*height)));
  }
}