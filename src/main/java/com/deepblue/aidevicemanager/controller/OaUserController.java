package com.deepblue.aidevicemanager.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.deepblue.aidevicemanager.common.ret.RetResponse;
import com.deepblue.aidevicemanager.common.ret.RetResult;
import com.deepblue.aidevicemanager.entity.OaUser;
import com.deepblue.aidevicemanager.mapper.OaUserMapper;
import com.deepblue.aidevicemanager.service.OaUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author df
 * @since 2020-04-20
 */
@RestController
@RequestMapping("/oaUser")
public class OaUserController {
  @Resource
  private OaUserService oaUserService;
  @Resource
  private OaUserMapper oaUserMapper;

  @PostMapping("/login")
  public RetResult<Integer> login(@RequestParam String phone, @RequestParam String pass) throws Exception {
    if (oaUserMapper.selectBynameAndPass(phone, pass) != null) {
      return RetResponse.makeOKRsp(0);
    } else {
      return RetResponse.makeErrRsp("用户名密码错误");
    }
  }
}
