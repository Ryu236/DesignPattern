package factory;

public abstract class Link extends Item {
  protected String url;
  public Link(String cpature, String url) {
    super(caption);
    this.url = url;
  }
}
