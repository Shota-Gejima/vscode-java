public class Wand {
  private String name;
  private double power;

  public void setPower(double power){
    if (0.5 > power || power > 100.0){
      throw new IllegalArgumentException ("杖の増幅値が異常値です。処理を中断します");
    }
    this.power = power;
  }
  public double getPower(){
    return this.power;
  }
  public void setName(String name){
    if (name == null || name.length() < 3){
      throw new IllegalArgumentException ("杖の名前が短いです。処理を中断します。");
    }
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}
