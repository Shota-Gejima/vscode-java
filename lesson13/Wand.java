package lesson13;

public class Wand{
  private String name;
  private double power;

  public String getName(){return this.name;}
  public void setName(String name){
    if (name == null || name.length() < 3){
      throw new IllegalArgumentException("名前が適切ではありません");
    } else {this.name = name;}
    
  }
  public double getPower(){return this.power;}
  public void setPower(double power){
    if (power < 0.5 || power > 100 ){
      throw new IllegalArgumentException("杖による増減幅が適切ではありません");
    } else {this.power = power;}
  }
}
