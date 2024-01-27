public class Main{
  public static void main(String[] args){
    // 要素数20の配列を宣言し、要素に0から5ずつ傘㎜して代入させる
    int[] num = new int[20];
    for (int i=0; i<num.length; i++){
      num[i] = i * 5;
    }
    for (int m=0; m<num.length; m++){
      System.out.print(num[m]);
      if (m<num.length-1){
        System.out.print(",");
      }
    }
    System.out.println();
    // [0]~[10]の奇数のみカンマ区切りで表示
    System.out.print("奇数:");
    for (int i=0; i<=10; i++){
      if (num[i]%2!=0){
        System.out.print(num[i]);
        if (i<10-1){
          System.out.print(",");
        }
      }
    }
    System.out.println();

    // [11]~[19]の偶数のみカンマ区切りで表示
    System.out.print("偶数:");
    for (int i=11; i<=19; i++){
      if (num[i]%2==0){
        System.out.print(num[i]);
        if (i<19-1){
          System.out.print(",");
        }
      }
    }
    System.out.println();
    // 例題3 要素10の文字列配列を宣言し、配列に「apple」「orange」「banana」
    // 「grape」「kiwi」「mango」「peach」「strawberry」「blueberry」「raspberry
    // 」の果物の名前を代入してください。その後、配列の要素をカンマ区切りで表示するJavaのコードを書いてください。
    String[] fruits = {"apple", "orange","banana","grape","kiwi","mango","peach","strawberry","blueberry","rasberry"};
    for (int m=0; m<fruits.length; m++){
      System.out.print(fruits[m]);
      if (m<fruits.length-1){
        System.out.print(",");
      }
    }
    System.out.println();
    // 例題4 変数 num1 と num2 にそれぞれ整数 5 と 10 を代入し、それらの変数を足して結果を表示するJavaのコードを書いてください。
    int num1 = 5; int num2 = 10;
    System.out.println("num1+num2="+ (num1 + num2));
    
  }
}