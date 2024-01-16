public class Main{
  public static void main(String[] args){
    int [] heights = {172, 149, 152, 191, 155};
    java.util.Arrays.sort(heights);
    for (int i: heights){
      System.out.println(i);
    }

    int[] num = new int[2];
    num[0] = 10;
    num[1] = 20;

    int result = num[0] + num[1];
    System.out.println(result);
  }


}