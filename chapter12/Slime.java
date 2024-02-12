public class Slime extends Monster{

  public Slime(String name){
    super(name);
  }

  public void run(){
    System.out.println(this.name+"は、体をうねらせて逃げた!");
  }
}
