package com.deepblue.aidevicemanager.mapper;

import com.deepblue.aidevicemanager.entity.OaUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author df
 * @since 2020-04-20
 */
public interface OaUserMapper extends BaseMapper<OaUser> {

  OaUser selectBynameAndPass(String phone, String password);

}
