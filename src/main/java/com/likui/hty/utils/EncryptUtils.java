package com.likui.hty.utils;

import org.springframework.util.DigestUtils;

/**
 *
 * 功能描述: 加密
 *
 * @auther: likui
 * @date: 2019/1/7 21:27
 */
public class EncryptUtils {

    /**
     * 密码加密
     * @param password
     * @return
     */
    public static String encryptPassword(String password){
        return  DigestUtils.md5DigestAsHex(password.getBytes());
    }

    public static void main(String[] args) {
        System.out.println(encryptPassword("123456"));
    }
}
