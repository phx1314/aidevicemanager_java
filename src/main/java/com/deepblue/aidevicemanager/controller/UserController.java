package com.deepblue.aidevicemanager.controller;


import com.deepblue.aidevicemanager.common.ret.RetResponse;
import com.deepblue.aidevicemanager.common.ret.RetResult;
import com.deepblue.aidevicemanager.mapper.UserMapper;
import com.deepblue.aidevicemanager.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author df
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/user")
public class UserController {
  @Resource
  private UserService oaUserService;
  @Resource
  private UserMapper UserMapper;

  @PostMapping("/login")
  public RetResult<Integer> login(@RequestParam String phone, @RequestParam String pass) throws Exception {
    if (UserMapper.selectBynameAndPass(phone, pass) != null) {
      return RetResponse.makeOKRsp(0);
    } else {
      return RetResponse.makeErrRsp("用户名密码错误");
    }
  }
}
