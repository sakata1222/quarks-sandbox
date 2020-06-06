package jp.gr.java_conf.saka.domain.model.user;

public interface IUserRepository {

  void save(User user);

  User find(UserName name);
}
