public class Main{
  public static void main(String[] args){
    // 要素数20の配列を宣言し、要素に0から5ずつ傘㎜して代入させる
    int[] num = new int[20];
    for (int i=0; i<num.length; i++){
      num[i] = i * 5;
    }
    for (int m=0; m<num.length; m++){
      System.out.print(num[m]);
      if (m<num.length-1){
        System.out.print(",");
      }
    }
    System.out.println();
    // [0]~[10]の奇数のみカンマ区切りで表示
    System.out.print("奇数:");
    for (int i=0; i<=10; i++){
      if (num[i]%2!=0){
        System.out.print(num[i]);
        if (i<10-1){
          System.out.print(",");
        }
      }
    }
    System.out.println();

    // [11]~[19]の偶数のみカンマ区切りで表示
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