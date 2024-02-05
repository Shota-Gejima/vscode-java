import java.util.*;
public class Main {
  public static void main(String[] args){

    // 問題1 以下の整数型の配列が与えられたとき、配列内の奇数の合計を計算して表示するJavaのプログラムを書いてください。
    // int[] numbers = {1, 5, 8, 3, 6, 9, 7, 2, 4, 11};
    int[] numbers = {1, 5, 8, 3, 6, 9, 7, 2, 4, 11};
    int numbersAdd=0;
    for (int i=0; i<numbers.length; i++){
      System.out.print(numbers[i]);
      if (i<(numbers.length-1)){
        System.out.print(",");
      }
    }
    for (int i=0; i<numbers.length; i++){
      if (numbers[i]%2!=0){
        numbersAdd += numbers[i];
      }
    }
    Arrays.sort(numbers);
    System.out.println();
    for (int i=0; i<numbers.length; i++){
      System.out.print(numbers[i]);
      if (i<(numbers.length-1)){
        System.out.print(",");
      }
    }
    System.out.println();
    System.out.println(numbersAdd);
    // 問題2 ユーザーに10個の整数を入力させ、それらの整数の合計と平均を計算して表示するJavaのプログラムを書いてください。
    int[] num = new int[10];
    int total=0;
    double avg =0;
    for (int i=0; i<num.length; i++){
      if (i!=9){
        System.out.println("あと"+(9-i)+"回入力してください");
        num[i] = new Scanner(System.in).nextInt();
      }
    }
    for (int i=0; i<num.length; i++){
      total += num[i];
      avg = (double)total/num.length;
    }
    System.out.println("合計は"+total+"で、平均は"+avg);

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
    // 問題4
    String[] word1 = new String[3];
    word1[0] = "{1,2,3}";
    word1[1] = "{2,3,4}";
    word1[2] = "{3,4,5}";
    for (int i=0; i<word1.length; i++){
      System.out.print(word1[i]);
      if (i<word1.length-1){
        System.out.print(",");
      }
    }
  }
}