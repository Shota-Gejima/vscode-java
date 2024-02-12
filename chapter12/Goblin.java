public class Goblin extends Monster{

  public Goblin(String name){
    super(name);
  }
  
  public void run(){
    System.out.println(this.name+"は、腕を振って逃げた!");
  }
}
