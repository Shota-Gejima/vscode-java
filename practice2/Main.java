public class Main{
  public static void main(String[] args){
    int [] heights = {172, 149, 152, 191, 155};
    java.util.Arrays.sort(heights);
    for (int i: heights){
      System.out.println(i);
    }
  }
}