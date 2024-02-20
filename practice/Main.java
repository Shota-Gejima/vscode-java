import java.util.*;
public class Main {
  public static void main(String[] args){

    // 問題1 以下の整数型の配列が与えられたとき、配列内の奇数の合計を計算して表示するJavaのプログラムを書いてください。
    // int[] numbers = {1, 5, 8, 3, 6, 9, 7, 2, 4, 11};
    int[] numbers = {1, 5, 8, 3, 6, 9, 7, 2, 4, 11};
    int totalOddNumber = 0;
    for (int i=0; i<numbers.length; i++){
      if (numbers[i]%2!=0){
        totalOddNumber += numbers[i];
      }
    }
    System.out.println(totalOddNumber);
    
    // 問題2 ユーザーに10個の整数を入力させ、それらの整数の合計と平均を計算して表示するJavaのプログラムを書いてください。
    int userNum [] = new int [10];
    int total = 0;
    // for (int i=0; i<userNum.length; i++){
      // if (i!=9){
        // System.out.println(i+1+"回目の数字を入力してください");
        // userNum[i] = new Scanner(System.in).nextInt();
      // } else {
        // System.out.println("ラスト!"); 
        // userNum[i] = new Scanner(System.in).nextInt();
      // }
    // }
    // for (int i=0; i<userNum.length; i++){
      // System.out.print(userNum[i]);
      // if (i!=10){
        // System.out.print(",");
      // }/
      // total += userNum[i];
    // }
    // System.out.println("合計は"+total);
    // System.out.println("平均は"+(double)total/userNum.length);

    // System.out.println();

    // 問題3 以下の文字列型の配列が与えられたとき、配列内の文字列の中で最も長い文字列を表示するJavaのプログラムを書いてください。
    // String[] words = {"apple", "banana", "kiwi", "strawberry", "grape"};
    String[] words = {"apple", "banana", "kiwi", "strawberry", "grape"};
    String fruits = "";
    for (int i= 0; i<words.length; i++){
      if (fruits.length()<words[i].length()){
        fruits = words[i];
      }
    }
    System.out.println(fruits);

  }
}