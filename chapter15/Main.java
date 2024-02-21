public class Main {
  public static void main(String[] args){
    // コード15-2
    String s1 = "Java and JavaScriptjava";
    String s2 = "Java";
    String s3 = "java";

    if (s2.equals(s3)){
      System.out.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)){
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    System.out.println("s1の長さは"+s1.length()+"です");
    if (s1.isEmpty()){
      System.out.println("s1は空文字です");
    }
    if (s1.contains("Java")){
      System.out.println("この文字はjavaを含んでいます");
    } else {
      System.out.println("この文字はjavaを含んでいません");
    }
    if (s1.endsWith("java")){
      System.out.println("文字列s1は、javaが末尾にあります");
    }
    System.out.println("文字列s1で最初にandが登場する位置は"+s1.indexOf("and"));
    System.out.println("文字列s1で最後にandが登場する位置は"+s1.lastIndexOf("and"));
    // コード15-3
    String s4 = "Java programming";
    System.out.println("文字列s4の4文字目以降は"+s4.substring(3));
    System.out.println("文字列s4の4文字目以降から7文字目までは"+s4.substring(3,8));
    // コード15-4
    System.out.println(s4.toUpperCase());
  }
}
