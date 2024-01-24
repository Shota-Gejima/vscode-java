public class Main {
  public static void main(String[] args){

    introduceOneself();
    email("テスト","aaa@aaa", "こんにちは");
    email("ccc@ccc","やっほー");
    double triangleArea=calcTriangleArea(10.0,5.0);
    double circleArea=calcCircleArea(5);
    System.out.println(triangleArea);
    System.out.println(circleArea);
  }

  // 練習5-1
  public static void introduceOneself(){
    String name = "湊";
    int age =30;
    double height = 163.3;
    char eto = '酉';
    System.out.println("私の名前は"+name+"です。身長は"+height+"cm、干支は"+eto+"です。");
  }
  // 練習5-2
  public static void email(String title, String address, String text){
    System.out.println(title+"に以下のメールを送信しました。");
    System.out.println("件名:"+title);
    System.out.println("本文:"+text);
  }
  // 練習5-3
  public static void email(String address, String text){
    email("無題", address, text);
  }
    // 練習5-4
  public static double calcTriangleArea(double bottom, double height){
    return (bottom*height)/2;
  }

  public static double calcCircleArea(double redius){
    double pi = 3.14;
    return redius*redius*pi;
  }
}
