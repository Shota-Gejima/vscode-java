import calcapp.logics.*;

public class Calc {
  public static void main(String[] args){
    int a = 20;
    int b = 4;
    int total = CalcLogic.tasu(a,b);
    int delta = calcapp.logics.CalcLogic.hiku(a,b);

    System.out.println("足すと" + total + "、引くと" + delta);
  }
}