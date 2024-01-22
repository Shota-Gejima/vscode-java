public class Main {
  public static void main(String[] args){
    // import java.util.*;
    System.out.println("私の好きな記号は二重引用付(\")です");
    int m = Math.max(100,200);
    System.out.println(m);

    for (int i=0; i <=10; i++){
      System.out.print(i);
      if (i!=10){
        System.out.print(",");
      }
    }
    // コード2-12
    int a = 1;
    int b = 2;
    int maxNum = Math.max(a,b);
    System.out.println("aとb大きい方は・・・"+maxNum);
    // コード2-13
    String age = "30";
    int n = Integer.parseInt(age);
    System.out.println("今年は"+n+"です。"+"来年は"+(n+1)+"になります");
    // コード2-14
    int r = new java.util.Random().nextInt(4);
    System.out.println(r);
  }
}