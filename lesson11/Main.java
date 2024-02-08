public class Main {
  public static void main(String[] args){
    Book b = new Book("坊っちゃん", 1000, "黒","あああ");
    Computer c = new Computer("パソコン", 30000, "白", "apple");
    b.setWeight(40.5);
    c.setWeight(500.5);
    String bookName = b.getName();
    int bookPrice = b.getPrice();
    String bookColor = b.getColor();
    String bookIsbn = b.getIsbn();
    System.out.println(bookName+bookPrice+bookColor+bookIsbn+b.getWeight());

    String computerName = c.getName();
    int computerPrice = c.getPrice();
    String computerColor = c.getColor();
    String computerIsbn = c.getMakerName();
    System.out.println(computerName+computerPrice+computerColor+computerIsbn+c.getWeight());

    // 練習11-2
  }
  // 練習11-2
  // (ア)Asset
  // (イ)IntangibleAssets
  // (ウ)Patent
}
