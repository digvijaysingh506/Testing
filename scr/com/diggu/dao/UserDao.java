package com.diggu.dao;

import com.diggu.model.Login;

import com.diggu.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);

}
