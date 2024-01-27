import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    // 問題1 以下の整数型の配列が与えられたとき、配列内の奇数の合計を計算して表示するJavaのプログラムを書いてください。
    // int[] numbers = {1, 5, 8, 3, 6, 9, 7, 2, 4, 11};
    int [] numbers = {1,5,8,3,6,9,7,2,4,11};
    int ans = 0;
    for (int i=0; i<numbers.length; i++){
      if (numbers[i]%2!=0){
        ans += numbers[i];
      }
    }
    System.out.println(ans);
    // 問題2 ユーザーに10個の整数を入力させ、それらの整数の合計と平均を計算して表示するJavaのプログラムを書いてください。
    int[] array = new int[10];
    for (int i=0; i<array.length; i++){
      System.out.println("1~9の好きな数じを入力してください");
      int num = new Scanner(System.in).nextInt();
      array[i] = num;
      System.out.println("残り"+(array.length-(i+1))+"個");
    }
    int total=0;
    for (int i: array){
      total += i;
    }
    // キャスト演算子
    double avg = (double)total/array.length;
    System.out.println(array.length+"合計は"+total+"で、平均は"+avg);
  }
}
