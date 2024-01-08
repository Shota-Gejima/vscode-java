import java.util.*;
public class FizzBuzz {
  public static void main(String[] args){
    // 好きな数字
    System.out.println("好きな数字を入力してください");
    int num = new Scanner(System.in).nextInt();
    if (num%(3*5)==0){
      System.out.println("FizzBuzz");
    } else if (num%3==0){
      System.out.println("Fizz");
    } else if (num%5==0){
      System.out.println("Buzz");
    } else {
      System.out.println(num + "はどれにも当てはまりません");
    }
    // 100までループ
    for (int i=1; i<=100; i++){
      if (i%(3*5)==0){
        System.out.println("FizzBuzz"+"  "+i);
      } else if (i%3==0){
        System.out.println("Fizz"+"  "+i);
      } else if (i%5==0){
        System.out.println("Buzz"+"  "+i);
      } else {
        System.out.println(i);
      }
    }
    // 3回好きな数字をループで回す
    for (int s=1; s<=3; s++){
      System.out.println("あと"+(4-s)+"回");
      System.out.println("好きな数字を入力してください");
      int numLike = new Scanner(System.in).nextInt();
      if (numLike%(3*5)==0){
        System.out.println("FizzBuzz");
      } else if (numLike%3==0){
        System.out.println("Fizz");
      } else if (numLike%5==0){
        System.out.println("Buzz");
      } else {
        System.out.println(numLike);
      }
    }
  }

}
