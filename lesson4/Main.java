public class Main {
  public static void main(String[] args){
    // 練習4-1
    int [] points = {10,20,30,40};
    double [] weight = {1.1,2.2,3.3,4.4};
    boolean [] answers = {true,false,true,false};
    String [] names = {"あ","い","う"};
    // 練習4-2
    int[] moneyList = {121902,8302,55100};
    for (int i=0; i<moneyList.length; i++){
      System.out.print(moneyList[i]+" ");
    }
    for (int i:moneyList){
      System.out.print(i+" ");
    }
    // 練習4-4
    int[] numbers = {3,4,9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int i : numbers){
      if (input == i){
        System.out.println("あたり");
      } 
    }
  }
}
