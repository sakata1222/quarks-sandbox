package jp.gr.java_conf.saka.domain.model.user;

public class UserId {

  private final String id;

  public UserId(String id) {
    this.id = id;
  }

  public String asString() {
    return id;
  }
}
