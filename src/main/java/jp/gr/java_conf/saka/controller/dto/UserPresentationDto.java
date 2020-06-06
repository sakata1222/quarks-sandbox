package jp.gr.java_conf.saka.controller.dto;

import java.util.Optional;
import lombok.Builder;
import lombok.Getter;
import org.checkerframework.checker.nullness.qual.Nullable;

@Builder
@Getter
public class UserPresentationDto {

  @Nullable
  private final String id;

  @Nullable
  private final String name;

  public Optional<String> getId() {
    return Optional.ofNullable(id);
  }

  public Optional<String> getName() {
    return Optional.ofNullable(name);
  }
}
