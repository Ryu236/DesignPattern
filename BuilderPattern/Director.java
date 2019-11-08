public class Director {
  private Builder builder;
  public Director(Builder builder) { // Builderのサブクラスのインスタンスが与えられるので、
    this.builder = builder; // builderフィールドに保持しておく
  }
  public void construct() {
    builder.makeTitle("Greeting");
    builder.makeString("Mornig to Evening");
    builder.makeItems(new String[] {
      "Good Mornig",
      "Hello",
    });
    builder.makeString("at night");
    builder.makeItems(new String[] {
      "Hello",
      "Good night",
      "Good bye",
    });
    // 文書を完成させる
    builder.close();
  }
}
