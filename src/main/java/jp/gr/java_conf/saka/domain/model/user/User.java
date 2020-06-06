package jp.gr.java_conf.saka.domain.model.user;

import com.google.common.base.Preconditions;

public class User {

  private final UserId userId;
  private final UserName userName;

  public User(UserId userId, UserName userName) {
    this.userId = Preconditions.checkNotNull(userId);
    this.userName = Preconditions.checkNotNull(userName);
  }

  public String getUserIdAsString() {
    return userId.asString();
  }

  public String getUserNameAsString() {
    return userName.asString();
  }
}
