public class Account {
  // 口座番号
  String accountNumber;
  // 残高
  int balance;
  // ⓵文字列表現のメソッド
  public String toString(){
    return "¥¥" + this.balance + "(口座番号 : " + this.accountNumber + ")";
  }
  // ⓶等価判定メソッド
  public boolean equals(Object o){
    if (this == o){ return true; }
    if (o instanceof Account){
      Account a = (Account)o;
      String an1 = this.accountNumber.trim();
      String an2 = a.accountNumber.trim();
      if (an1.equals(an2)){
        return true;
      }
    }
    return false;
  }
}
