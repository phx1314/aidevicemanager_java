package com.deepblue.aidevicemanager.mapper;

import com.deepblue.aidevicemanager.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author df
 * @since 2020-04-20
 */
public interface UserMapper extends BaseMapper<User> {
  OaUser selectBynameAndPass(String phone, String password);
}
