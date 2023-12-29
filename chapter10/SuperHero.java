public class SuperHero extends Hero{
  boolean flying;

  public void attack(Matango m){
    super.attack(m);
    if (this.flying == true){
      super.attack(m);
    }
  }

  public void run(){
    System.out.println(this.name + "は、撤退した！");
  }

  public void fly(){
    this.flying = true;
    System.out.println("飛び上がった");
  }

  public void land(){
    this.flying = false;
    System.out.println("着地した");
  }

  public SuperHero(){
    super("ゲジ");
  }
}