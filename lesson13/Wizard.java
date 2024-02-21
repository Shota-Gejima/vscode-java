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
        System.out.println(h.getName()+"のHPを"+recovPoint+"回復した!");
  }

  public void setWand(Wand w){
    if (w==null){
      throw new IllegalArgumentException("設定されようとしている杖が異常です。");
    }
    this.wand = w;
  }
  public Wand getWand(){ return this.wand; }
  public void setHp(int hp){ 
    if (hp<0){
      this.hp = 0;
    }
    this.hp = hp;
  }  
  public int getHp(){ return this.hp; }
  public void setMp(int mp){
    if (mp<0){
      throw new IllegalArgumentException("mpが異常な数値です。処理を中断します。");
    }
    this.mp = mp;
  }
  public int getMp(){ return this.mp; }
  public void setName(String name){ this.name = name; }
  public String getName(){ return this.name; }
}