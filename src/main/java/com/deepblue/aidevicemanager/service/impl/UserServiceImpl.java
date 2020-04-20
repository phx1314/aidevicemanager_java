package com.deepblue.aidevicemanager.service.impl;

import com.deepblue.aidevicemanager.entity.User;
import com.deepblue.aidevicemanager.mapper.UserMapper;
import com.deepblue.aidevicemanager.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author df
 * @since 2020-04-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
