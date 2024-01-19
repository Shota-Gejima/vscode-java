public class FizzBuzz{
  public void game(){
  System.out.println("好きな数字を入力してください");
  int num = new java.util.Scanner(System.in).nextInt();

  if (num%(3*5)==0){
    System.out.println("FizzBuzz");
  } else if (num%3==0){
    System.out.println("Fizz");
  } else if (num%5==0){
    System.out.println("Buzz");
  } else {
    System.out.println(num);
  }
  }
}