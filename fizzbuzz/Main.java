public class Main{
  public static void main(String[] args){
    FizzBuzz();
    FizzBuzzFor();
  }

  public static void FizzBuzz(){
    System.out.println("好きな数字を入力してください");
    int num = new java.util.Scanner(System.in).nextInt();
    if (num%(3*5)==0){
      System.out.println("FizzBuzz");
    } else if (num%3==0){
      System.out.println("Fizz");
    } else if (num%5==0){
      System.out.println("Buzz");
    }else {System.out.println(num);}
  }

  public static void FizzBuzzFor(){
    for (int i=0; i<=100; i++){
      if (i%(3*5)==0){
        System.out.println("FizzBuzz");
      } else if(i%3==0){
        System.out.println("Fizz");
      } else if (i%5==0){
        System.out.println("Buzz");
      } else {System.out.println(i);}
    }
  }
}