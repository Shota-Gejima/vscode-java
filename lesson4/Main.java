public class Main {
  public static void main(String[] args){
    // 練習4-1
    int[] points = new int[4];
    double [] weights = new double[5];
    boolean [] answers = new boolean[3];
    String [] names = new String [3];
    // 練習4-2
    int [] moneyList = new int[3];
    moneyList[0] = 121902;
    moneyList[1] = 8302;
    moneyList[2] = 55100;
    for (int m=0; m<moneyList.length; m++){
      System.out.println(moneyList[m] + " ");
      System.out.println(" ");
    }
    for (int m: moneyList){
      System.out.print(m + " ");
    }
    // 練習4-4
    int [] numbers = {3,4,9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int num: numbers){
      if (num==input){
        System.out.println("アタリ");
      } else{System.out.println("はずれ");}
    }
  }
}