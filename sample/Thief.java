package sample;
public class Thief{
  String name;
  int hp;
  int mp;

  public Thief(String name, int hp, int mp){
    this.name = name;
    this.hp = hp;
    this.mp = mp;
    System.out.println("私の名前は" + name + "です。hpは" + hp + "で、mpは" + mp + "です。");
  }

  public Thief(String name, int hp){
    this(name, hp, 5);
  }

  public Thief(String name){
    this(name, 40, 5);
  }
}