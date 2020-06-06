package jp.gr.java_conf.saka.application;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import jp.gr.java_conf.saka.domain.model.user.IUserFactory;
import jp.gr.java_conf.saka.domain.model.user.IUserRepository;
import jp.gr.java_conf.saka.domain.model.user.User;
import jp.gr.java_conf.saka.domain.model.user.UserName;
import jp.gr.java_conf.saka.domain.service.IUserService;

@ApplicationScoped
public class UserRegisterService implements IUserRegisterService {

  private final IUserFactory userFactory;

  private final IUserRepository userRepository;

  private final IUserService userService;

  @Inject
  public UserRegisterService(IUserFactory userFactory,
    IUserRepository userRepository, IUserService userService) {
    this.userFactory = userFactory;
    this.userRepository = userRepository;
    this.userService = userService;
  }

  @Override
  public UserApplicationDto register(UserRegisterCommand command) {
    var userName = new UserName(command.getUserName());
    userService.validateNameConflict(userName);
    User newUser = userFactory.create(userName);
    userRepository.save(newUser);
    return UserApplicationDto.of(newUser);
  }
}
