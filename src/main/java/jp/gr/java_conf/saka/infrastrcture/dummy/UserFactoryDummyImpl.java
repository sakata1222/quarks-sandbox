package jp.gr.java_conf.saka.infrastrcture.dummy;

import java.util.UUID;
import javax.enterprise.context.ApplicationScoped;
import jp.gr.java_conf.saka.domain.model.user.IUserFactory;
import jp.gr.java_conf.saka.domain.model.user.User;
import jp.gr.java_conf.saka.domain.model.user.UserId;
import jp.gr.java_conf.saka.domain.model.user.UserName;

@ApplicationScoped
public class UserFactoryDummyImpl implements IUserFactory {

  @Override
  public User create(
    UserName userName) {
    var id = new UserId(UUID.randomUUID().toString());
    return new User(id, userName);
  }
}
