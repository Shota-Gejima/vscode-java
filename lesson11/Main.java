public class Main{
  public static void main(String[] args){
    Book b = new Book("坊ちゃん", 1000, "Black", "おもしろい");
    // b.isbn = "おもしろい";
    String bookName = b.getName();
    int bookPrice = b.getPrice();
    String bookColor = b.getColor();
    String bookIsbn = b.getIsbn();
    System.out.println(bookName + bookPrice + bookColor + bookIsbn);

    Computer p = new Computer("パソコン", 20000, "white", "Apple");
    // p.makerName = "Apple";
    String computerName = p.getName();
    int computerPrice = p.getPrice();
    String computerColor = p.getColor();
    String computerIsbn = p.getMakerName();
    System.out.println(computerName + computerPrice + computerColor + computerIsbn);
  }
}