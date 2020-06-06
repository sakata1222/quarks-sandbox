package jp.gr.java_conf.saka.domain.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import jp.gr.java_conf.saka.domain.model.user.IUserRepository;
import jp.gr.java_conf.saka.domain.model.user.UserName;

@ApplicationScoped
public class UserService implements IUserService {

  private final IUserRepository userRepository;

  @Inject
  public UserService(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }


  @Override
  public void validateNameConflict(UserName userName) {

  }
}
