// 九九を作成
public class Num99{
  public static void main(String[] args){
    int num;
    for (int i=1; i< 10; i++){
      for (int y=1; y<10; y++){
        System.out.print((i*y) + " ");
      }
      System.out.println("");
    }
  }
}