public class Main{
  public static void main(String[] args){
    FizzBuzz();
    FizzBuzzFor();
  }

  public static void FizzBuzz(){
    System.out.println("数字を入力してください");
    int num = new java.util.Scanner(System.in).nextInt();
    if (num%(3*5)==0){
      System.out.println("FizzBuzz");
    } else if (num%3==0){
      System.out.println("Fizz");
    } else if (num%5==0){
      System.out.println("Buzz");
    }
  }

  public static void FizzBuzzFor(){
    for (int num=1; num<=100; num++){
      if (num%(3*5)==0){
        System.out.println("FizzBuzz"+"("+num+")");
      } else if (num%3==0){
        System.out.println("Fizz"+"("+num+")");
      } else if (num%5==0){
        System.out.println("Buzz"+"("+num+")");
      } else {System.out.println(num);}
    }
  }
}