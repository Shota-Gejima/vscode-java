public class Bank {
  // 口座番号
  String accountNumber;
  // 残高
  int balance;

  public String toString(){
    return "¥¥" + this.balance + "("+accountNumber+")";
  }

  public boolean equals(Object o){
    if (this==o){
      return true;
    }
    if (o instanceof Bank){
      Bank a = (Bank)o;
      String an1 = this.accountNumber.trim();
      String an2 = a.accountNumber.trim();
      if (an1.equals(an2)){
        return true;
      }
    }
    System.out.println("クラスが違います");
    return false;
  }
}
