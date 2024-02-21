public class Main {
 public static void main(String[] args){
  Bank b1 = new Bank();
  b1.accountNumber = "4649";
  b1.balance = 1592;
  Bank b2 = new Bank();
  b2.accountNumber = " 4649";
  b2.balance = 1592;
  System.out.println(b1.toString());
  Hero h1 = new Hero();
  h1.accountNumber = "4649";
  h1.balance = 1592;
  
  if (b1.equals(b2) == true){
    System.out.println("同じ内容です");
  } else { System.out.println("違う内容です");}
 }
}
