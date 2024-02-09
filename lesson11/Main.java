public class Main {
  public static void main(String[] args){
    Computer c = new Computer("PC",30000, "白", "Apple");
    Book b = new Book("鬼滅の刃",500, "黒", "126465434");
    c.setWeight(500);
    b.setWeight(150);
    System.out.println(c.getName()+c.getPrice()+c.getColor()+c.getMakerName()+c.getWeight());
    System.out.println(b.getName()+b.getPrice()+b.getColor()+b.getIsbn()+b.getWeight());
  }
}
