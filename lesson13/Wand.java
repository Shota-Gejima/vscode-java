public class Wand {
  private String name;
  private double power;

  public void setPower(double power){
    if (power<0.5 || power>100){
      throw new IllegalArgumentException("増幅率の値が異常です。処理を中断します");
    }
    this.power = power;
  }
  public double getPower(){
    return this.power;
  }

  public void setName(String name){
    if (name.length()<3){
      throw new IllegalArgumentException("名前が短いです。処理を中断します。");
    }
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
}
