package jp.gr.java_conf.saka.application;

import jp.gr.java_conf.saka.domain.model.user.User;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserApplicationDto {

  private final String id;

  private final String name;

  public static UserApplicationDto of(User user) {
    return UserApplicationDto.builder()
      .id(user.getUserIdAsString())
      .name(user.getUserNameAsString())
      .build();
  }
}
