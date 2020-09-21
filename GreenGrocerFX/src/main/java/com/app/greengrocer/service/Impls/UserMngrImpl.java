package com.app.greengrocer.service.Impls;

import com.app.greengrocer.dao.entity.User;
import com.app.greengrocer.dao.repository.contracts.UserRespository;
import com.app.greengrocer.models.UserInfo;
import com.app.greengrocer.service.contracts.UserMngr;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserMngrImpl implements UserMngr {

  @Autowired
  private UserRespository userRespository;

  @Override
  public void addUser(UserInfo userInfo) {
    final User userEntity = new User();
    BeanUtils.copyProperties(userInfo, userEntity);
    userRespository.saveUser(userEntity);
  }

  @Override
  public List<UserInfo> listAllUser() {
    List<UserInfo> userList = new ArrayList<>();
    final List<User> users = userRespository.getUsers();
    users.stream().forEach(user -> {
      final UserInfo userInfo = new UserInfo();
      BeanUtils.copyProperties(user,userInfo);
      userList.add(userInfo);
    });
    return userList;
  }


}
