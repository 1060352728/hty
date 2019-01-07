package com.likui.hty.security;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 *
 * 功能描述: 返回token
 *
 * @auther: likui
 * @date: 2019/1/7 21:22
 */
@Getter
@AllArgsConstructor
public class AuthenticationToken implements Serializable {

    private final String token;
}
