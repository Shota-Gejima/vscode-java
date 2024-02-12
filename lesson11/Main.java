public class Main {
  public static void main(String[] args){
    Book b = new Book("スッキリ", 2000, "緑", "alhfafh");
    Computer c = new Computer("windows", 25000, "銀", "lenovo");
    b.setWeight(500);
    c.setWeight(800);

    System.out.println(b.getName()+ b.getPrice()+ b.getColor()+ b.getIsbn()+ b.getWeight());
    System.out.println(c.getName()+ c.getPrice()+ c.getColor()+ c.getMakerName()+ c.getWeight());
  }
}
