public class CharDisplay extends AbstractDisplay { // CharDisplay は、AbstractDisplay のサブクラス
  
  private char ch;
  public CharDisplay(char ch) { // コンストラクタで渡された文字chを
    this.ch = ch;               // フィールドに記憶しておく。
  }
  // スーパークラスでは抽象メソッドだったものを、ここでオーバーライドして実装。
  public void open() {
    System.out.print("<<");
  }
  public void print() {
    System.out.print(ch);
  }
  public void close() {
    System.out.println(">>");
  }
}
