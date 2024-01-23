public class Main {
  public static void main(String[] args){
  // コード5-4,5-5 引数
    System.out.println("メソッドを呼び出します");
    hello("湊", "こんばんは");
    hello("アサカ", "こんにちは");
    hello("スガワラ","さようなら");
    int ans =add(10,30);
    System.out.println(ans);
      // コード5-8 変数で戻り値を受け取らない
    System.out.println(add(add(10,20),add(30,40)));
    // コード5-12 引数に配列を渡す
    int[] array = {1,2,3};
    printArray(array);
    // コード5-13呼び出し先の情報が更新されている
    incArray(array);
    for (int i: array){
      System.out.println(i);
    }
    // コード5-13呼び出し先の情報が更新されている
    int[] num = makeArray(3);
    for (int a: num){
      System.out.print(a + " ");
    }
  }
  public static void hello(String name, String word){
    System.out.println(name+"さん"+word);
  }
  public static int add(int x, int y){
    int ans = x + y;
    return ans;
  }
  public static void printArray(int[] array){
    for (int element: array){
      System.out.println(element);
    }
  }
  // int型配列を受け取り、配列内の要素全てに1を加えるメソッド
  public static void incArray(int[] array){
    for (int i=0; i < array.length; i++){
      array[i]++;
    }
  }
  // 戻り値に配列を用いる
  public static int [] makeArray(int size){
    int [] newArray = new int[size];
    for (int i=0; i<newArray.length; i++){
      newArray[i] = i;
    }
    return newArray;
  }
}
