public class Hero {
  private int hp;
  private String name;

  public void setName(String name){
    if (name.length()<3){
      throw new IllegalArgumentException("名前が短いです。処理を中断します。");
    }
    this.name = name;
  }
  public String getName(){
    return this.name;
  }

  public void setHp(int hp){
    this.hp = hp;
  }
  public int getHp(){
    return this.hp;
  }
}
