package com.app.greengrocer.service.contracts;

import com.app.greengrocer.models.UserInfo;

import java.util.List;

public interface UserMngr {

  void addUser(UserInfo userInfoData);

  List<UserInfo> listAllUser();
}
