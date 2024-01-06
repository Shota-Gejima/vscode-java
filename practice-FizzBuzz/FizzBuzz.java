public class FizzBuzz {
  public static void main(String[] args){
    System.out.println("好きな数字を入力してください");
    int num = new java.util.Scanner(System.in).nextInt();
    if (num%(3*5)==0){
      System.out.println("FizzBuzz");
    } else if (num%3==0){
      System.out.println("Fizz");
    } else if (num%5==0){
      System.out.println("Buzz");
    } else {
      System.out.println(num + "はどれにも当てはまりません");
    }

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
  }
  
}
