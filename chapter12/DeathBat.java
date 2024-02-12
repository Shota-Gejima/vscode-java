public class DeathBat extends Monster{
  
  public DeathBat(String name){
    super(name);
  }

  public void run(){
    System.out.println(this.name+"は、羽ばたいて逃げた!");
  }
}
