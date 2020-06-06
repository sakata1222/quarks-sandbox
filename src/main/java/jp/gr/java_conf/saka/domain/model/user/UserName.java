package jp.gr.java_conf.saka.domain.model.user;

import com.google.common.base.Preconditions;

public class UserName {

  private final String name;

  public UserName(String name) {
    Preconditions.checkNotNull(name);
    Preconditions.checkArgument(
      4 <= name.length() && name.length() <= 32,
      "Length of user name must be between 4 and 32"
    );
    this.name = name;
  }

  public String asString() {
    return name;
  }
}
