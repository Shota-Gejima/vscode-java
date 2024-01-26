public class Main {
  public static void main(String[] args){
    int [] num = new int[20];
    // 配列の要素に5ずつ加算して代入
    for (int i=0; i<num.length; i++){
      num [i] = i * 5;
    }
    // 配列の仮表示
    for (int m=0; m<num.length; m++){
      System.out.print(num[m]);
      if (m<20-1){
        System.out.print(",");
      }
    }
    System.out.println();
    // [0]~[10]の奇数の値を取り出す
    System.out.print("奇数:");
    for (int i=0; i<=10; i++){
      if (num[i]%2 == 0){
        System.out.print(num[i]);
        if (i<10-1){
          System.out.print(",");
        }
      }
    }
    System.out.println();

    // [11]~[19]の偶数の値を取り出す
    System.out.print("偶数:");
    for (int i=11; i<=19; i++){
      if (num[i]%2==0){
        System.out.print(num[i]);
        if (i<19-1){
          System.out.print(",");
        }
      }
    }
  }
}
