package jp.gr.java_conf.saka.infrastrcture.dummy;

import javax.enterprise.context.ApplicationScoped;
import jp.gr.java_conf.saka.domain.model.user.IUserRepository;
import jp.gr.java_conf.saka.domain.model.user.User;
import jp.gr.java_conf.saka.domain.model.user.UserName;

@ApplicationScoped
public class UserRepositoryDummyImpl implements IUserRepository {

  @Override
  public void save(User user) {

  }

  @Override
  public User find(UserName name) {
    return null;
  }
}
