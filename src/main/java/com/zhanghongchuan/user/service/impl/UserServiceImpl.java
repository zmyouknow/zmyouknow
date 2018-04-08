package com.zhanghongchuan.user.service.impl;

import com.zhanghongchuan.user.entity.User;
import com.zhanghongchuan.user.mapper.UserMapper;
import com.zhanghongchuan.user.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhanghongchuan
 * @since 2018-04-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
