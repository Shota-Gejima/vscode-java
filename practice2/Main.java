public class Main{
  public static void main(String[] args){
    int [] num = new int[10];
    for (int i = 0; i<num.length; i++){
      num [i] = i+1;
    }
    for (int i: num){
      System.out.print(i+",");
    }
    System.out.println();
    int counts =0;
    for (int i = 0; i<num.length; i++){
      if (num[i]%2==0){
        System.out.print(num[i]);
        counts++;
        if (i<num.length-1){
          System.out.print(",");
        }
      }
    }
    System.out.println("偶数の数は"+counts+"個です");
  }
}