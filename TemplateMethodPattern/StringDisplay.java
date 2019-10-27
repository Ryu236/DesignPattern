public class StringDisplay extends AbstractDisplay {
  private String string;
  private int width;
  public StringDisplay(String string) { // コンストラクタで渡された文字列stirngを
    this.string = string;               // フィールドに記憶。
    this.width = string.getBytes().length; // それからバイト単位の幅もフィールドに記憶して後で使う。
  }
  public void open() {
    printLine();
  }
  public void print() {
    System.out.println("|" + string + "|");
  }
  public void close() {
    printLine();
  }
  private void printLine() {
    System.out.print("+");
    for (int i = 0; i < width; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }
}
