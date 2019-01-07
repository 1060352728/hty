package com.likui.hty.service;

import com.likui.hty.entity.User;
import org.springframework.cache.annotation.CacheConfig;

/**
 *
 * 功能描述: UserService
 *
 * @auther: likui
 * @date: 2019/1/7 21:25
 */
@CacheConfig(cacheNames = "user")
public interface UserService {

    User findByUsername(String username);
}
