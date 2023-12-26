public class Main{
  public static void main(String[] args){
    Thief t1;
    t1 = new Thief("ゲジ", 100, 10);
    System.out.println(t1.name + "のhpは" + t1.hp +"で、mpは" + t1.mp);

    Thief t2;
    t2 = new Thief("みなと", 50);
    System.out.println(t2.name + "のhpは" + t2.hp +"で、mpは" + t2.mp);

    Thief t3;
    t3 = new Thief("すがわら");
    System.out.println(t3.name + "のhpは" + t3.hp +"で、mpは" + t3.mp);

    int baseHp = 25;
    Thief t = new Thief("アサカ", baseHp);
    System.out.println(baseHp + " : " + t.hp);
    heal(baseHp);
    heal(t);
    System.out.println(baseHp + " :  " + t.hp);

  }
    public static void heal(int hp){
      hp += 10;
    }

    public static void heal(Thief thief){
      thief.hp += 10;
    }
   
}