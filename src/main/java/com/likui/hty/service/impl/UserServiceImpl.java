package com.likui.hty.service.impl;

import com.likui.hty.entity.User;
import com.likui.hty.repository.UserRepository;
import com.likui.hty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * 功能描述: UserServiceImpl
 *
 * @auther: likui
 * @date: 2019/1/7 21:25
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
