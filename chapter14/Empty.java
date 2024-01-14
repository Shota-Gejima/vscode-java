public class Empty extends Object {

  String name;
  int hp;
  // toStringをオーバーライド
  public String toString(){
    return "名前" + this.name + "/HP:" + this.hp;
  }
}
