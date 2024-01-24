import java.util.Arrays;
import java.util.Collections;
public class Main {
  public static void main(String[] args){
    int [] heights = {172,138,180,190,162};
    Arrays.sort(heights);
    // 昇順 日本語も対応
    for (int i:heights){
      System.out.println(i);
    }
    String [] japanese = {"い","う","お","あ","え"};
    Arrays.sort(japanese);
    for (String i:japanese){
      System.out.println(i);
    }
    // 降順-1
    for (int f=0, l=heights.length-1; f<l; f++, l--){
      int temp = heights[f];
      heights[f] = heights[l];
      heights[l] = temp;
    }
    System.out.println(Arrays.toString(heights));
    // 降順-2
    Integer [] array= {1,2,3,4,5};
    Arrays.sort(array, Collections.reverseOrder());
    for (int i:array){
      System.out.println(i);
    }
    String [] japaneseReverse = {"い","う","お","あ","え"};
    Arrays.sort(japaneseReverse, Collections.reverseOrder());
    for (String i:japaneseReverse){
      System.out.println(i);
    }
  }
}
