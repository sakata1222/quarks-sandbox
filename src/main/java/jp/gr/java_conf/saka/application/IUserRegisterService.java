package jp.gr.java_conf.saka.application;

public interface IUserRegisterService {

  UserApplicationDto register(UserRegisterCommand command);
}
