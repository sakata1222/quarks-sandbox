package jp.gr.java_conf.saka.controller.dto;

import javax.enterprise.context.ApplicationScoped;
import jp.gr.java_conf.saka.application.UserApplicationDto;
import jp.gr.java_conf.saka.application.UserRegisterCommand;

@ApplicationScoped
public class UserPresentationDtoTranslator {

  public UserRegisterCommand toRegisterCommand(UserPresentationDto presentationDto) {
    return UserRegisterCommand.builder()
      .userName(presentationDto.getName()
        .orElseThrow(() -> new IllegalArgumentException("Name must not be empty")))
      .build();
  }

  public UserPresentationDto toPresentationDto(UserApplicationDto applicationDto) {
    return UserPresentationDto.builder()
      .id(applicationDto.getId())
      .name(applicationDto.getName())
      .build();
  }
}
