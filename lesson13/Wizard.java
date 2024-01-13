package lesson13;

public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;


  public void heal(Hero h){
    int basePoint = 10;
    int recovPoint =
      (int)(basePoint * this.wand.getPower());
    h.setHp(h.getHp() + recovPoint);
    System.out.println(h.getName() + "HPのを" + recovPoint + "回復した!");
  }

  public void setHp(int hp){
    if (hp < 0){this.hp = 0;} else {this.hp = hp;}
  }
  public int getHp(){return this.hp;}
  public void setMp( int mp){
    if (mp < 0){
      throw new IllegalArgumentException("mpの値が異常です");
    } else {this.mp = mp;}
  }
  public int getMp(){ return this.mp;}
  public void setName(String name){
    if (name == null || name.length() < 3){
      throw new IllegalArgumentException("魔法使いの名前が以上です");
    }
    this.name = name; }
  public String getName(){ return this.name; }
  public void setWand(Wand wand){
    if (wand == null){
      throw new IllegalArgumentException("杖がnullです");
    }
    this.wand = wand; 
  }
  public Wand getWand(){ return this.wand; }
}
