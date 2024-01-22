public class Main{
  public static void main(String[] args){
    // ループパターン⓵ループによる全要素の利用
    int [] scores = {10,20,30,50,60};
    for (int i = 0; i<scores.length; i++){
      System.out.println(scores[i]);
    }
    // ループパターン⓶ループによる集計
    int sum = 0;
    int count = 0;
    for(int i=0; i<scores.length;i++){
      // 変数sumにscoresの配列の要素を足して代入
      sum += scores[i];
      // 50点以上の教科をカウント
      if (scores[i]>=50){
        count++;
      }
    }
    int avg = sum / scores.length;
    System.out.println(sum);
    System.out.println(avg);
    System.out.println("50点以上の点数は" + count + "教科");

    // パターン⓷添え字に対応した情報の利用
    int [] seq = new int[10];
    for (int i=0; i<seq.length; i++){
      seq[i] = new java.util.Random().nextInt(4);
      System.out.print(seq[i]);
    }
    for (int i=0; i<seq.length; i++){
      char [] base = {'A','T', 'G','C'};
      int baseType = seq[i];
      char baseChar = base[baseType];
      System.out.print(baseChar + " ");
    }
    // 拡張for文
    for (int i: scores){
      System.out.println(i);
    }
    // コード4-15
    int[] arrayA = {10,20,30,40,50};
    System.out.println(arrayA[0]);
    int[] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;
    System.out.println(arrayA[0]);
    // ガベレージコレクション
    
    boolean judge = true;
    if (judge == true){
      int[] array = {10,20,30};
    }
  }
}