// package privateのためソースファイルとクラス名が違ってもいい
class Human{
  private String name;

  public String getName(){
    return this.name;
  }
  // throw new IllegalArgumentExceptionで例外処理
  public void setName(String name){
    if (name == null) {
      throw new IllegalArgumentException
        ("名前がnullである。処理を中断");
    }

    if (name.length() <= 1) {
      throw new IllegalArgumentException
        ("名前が短すぎる。処理を中断");
    }

    if (name.length() >= 8) {
      throw new IllegalArgumentException
        ("名前が長すぎます。処理を中断");
    }
    if (name != "ミナト") {
      throw new IllegalArgumentException
      ("名前が一致しません");
    }

    this.name = name;
  }
    


}