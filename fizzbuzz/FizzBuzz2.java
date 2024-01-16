public class FizzBuzz2{
  public void use(){
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
    public void ForLoop(){
      for (int end =1; end<=100; end++){
        if (end%(3*5)==0){
          System.out.println("FizzBuzz");
        } else if (end%3==0){
          System.out.println("Fizz");
        } else if (end%5==0){
          System.out.println("Buzz");
        } else {
          System.out.println(end);
        }
      }
      System.out.println("終了します。");
    }

}