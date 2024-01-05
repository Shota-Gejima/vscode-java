public class FizzBuzz{
  public static void useForLoop() {
    System.out.println("好きな数字を入力して下さい。");
    int end = new java.util.Scanner(System.in).nextInt();
    if (end%3==0 && end%5==0) {
        System.out.println("Fizz Buzz");
    } else if (end%3==0) {
        System.out.println("Fizz");
    } else if (end%5==0) {
        System.out.println("Buzz");
    } else {
        System.out.println("どれにも当てはまりません");
    }
    // iが50になるまでループ
    for (int i = 1; i <= 50; i++){
      if (i % (3 * 5) == 0){
        System.out.println("fizzBuzz");
      } else if(i % 3 == 0){
        System.out.println("Fizz");
      } else if (i % 5 == 0){
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}