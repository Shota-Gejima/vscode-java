// ⓵全てのメソッドが抽象メソッドであること
// ⓶フィールドを持たないこと
  // これらを満たすものだけがinterfaceとして宣言できる
  // 抽象クラスの親玉みたいなもの
public interface Creature {
  public static final double PI = 3.14;
  // interface宣言されたメソッドは自動的にpublicかつabstractになるため省略できる
  void run();
  
}
