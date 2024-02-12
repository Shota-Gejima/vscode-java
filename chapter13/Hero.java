public class Hero {
  // アクセス修飾子 private, package private, protected, public
  private int hp;
  private String name;
  // Sword sword;

    void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した!");
  }

  private void die(){
    System.out.println(this.name + "は、死んでしまった!");
    System.out.println("GAME OVERです");
  }

  public void attack(){
  }

  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if (name == null){
      throw new IllegalArgumentException ("名前がnullである。処理を中断");
    } 
    if (name.length() <= 1){
      throw new IllegalArgumentException ("名前が短すぎます。処理を中断");
    }
    if (name.length() >= 8){
      throw new IllegalArgumentException ("名前が長すぎます。処理を中断");
    }
    this.name = name;
  }
}
