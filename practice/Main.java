import java.util.Scanner;
public class Main {
  public static void main(String[] args){

    // 問題1 以下の整数型の配列が与えられたとき、配列内の奇数の合計を計算して表示するJavaのプログラムを書いてください。
    // int[] numbers = {1, 5, 8, 3, 6, 9, 7, 2, 4, 11};
    int [] numbers = new int []{1, 5, 8, 3, 6, 9, 7, 2, 4, 11};
    int totalNum=0;
    for (int i=0; i<numbers.length; i++){
      if (numbers[i]%2!=0){
        System.out.println(numbers[i]);
        totalNum += numbers[i];
      }
    }
    System.out.println(totalNum);
    
    // 問題2 ユーザーに10個の整数を入力させ、それらの整数の合計と平均を計算して表示するJavaのプログラムを書いてください。
    int array[] = new int[10];
    int totalArray = 0;
    double avg = 0;
    for (int i=0; i<array.length; i++){
      System.out.println("好きな数字を入力してください。あと"+(array.length-(i))+"回");
      array[i] = new Scanner(System.in).nextInt();
    }
    for (int m: array){
      totalArray += m;
    }
    avg = (double)totalArray/array.length;
    System.out.println("合計は"+totalArray+"平均は"+avg);

    // 問題3 以下の文字列型の配列が与えられたとき、配列内の文字列の中で最も長い文字列を表示するJavaのプログラムを書いてください。
    // String[] words = {"apple", "banana", "kiwi", "strawberry", "grape"};
    
    String[] words = {"apple", "banana", "kiwi", "strawberry", "grape"};
    String word = "";
    for (int i=0; i<words.length; i++){
      if (words[i].length() > word.length()){
        word = words[i];
      }
    }
    System.out.println(word);
  }
}