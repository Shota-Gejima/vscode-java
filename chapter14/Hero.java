public class Hero {
  String name;
  int hp;
  static int money;

  public String toString(){
    return "名前："+this.name+"/HP："+this.hp;
  }

  public boolean equals(Object o){
    if (this == o){
      return true;
    }
    if (o instanceof Hero){
      Hero h = (Hero)o;
      if (this.name.equals(h.name)){
        return true;
      }
    }
    return false;
  }

  public static void setRandomMoney(){
    Hero.money = (new java.util.Random().nextInt(3)*1000);
  }
}