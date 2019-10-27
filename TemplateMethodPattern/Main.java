public class Main {
  public static void main(String[] args) {
    // 'H'を持ったCharDisplayのインスタンスを1個作る。
    AbstractDisplay d1 = new CharDisplay('H');
    // "Hello. World!"を持ったStringDisplayのインスタンスを1個作る。
    AbstractDisplay d2 = new StringDisplay("Hello, World!");
    // "こんにちは"をもったStringDisplayのインスタンスを1個作る。
    AbstractDisplay d3 = new StringDisplay("こんにちは");
    d1.display();  // d1, d2, d3 とも、すべて同じAbstractDisplayのサブクラスのインスタンスだから
    d2.display();  // 継承した display メソッドを呼び出すことが出来る。
    d3.display();  // 実際の動作は個々のクラス CharDisplay や StringDisplay で定まる。
  }
}
