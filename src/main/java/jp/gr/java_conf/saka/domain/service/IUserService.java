package jp.gr.java_conf.saka.domain.service;

import jp.gr.java_conf.saka.domain.model.user.UserName;

public interface IUserService {

  void validateNameConflict(UserName userName);

}
