package com.app.greengrocer.dao.repository.contracts;

import com.app.greengrocer.dao.entity.User;

import java.util.List;

public interface UserRespository {

  void saveUser(User user);

  List<User> getUsers();
}
