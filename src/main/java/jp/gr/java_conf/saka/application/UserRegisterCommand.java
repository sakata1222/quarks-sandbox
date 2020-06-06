package jp.gr.java_conf.saka.application;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class UserRegisterCommand {

  @NonNull
  private final String userName;
}
