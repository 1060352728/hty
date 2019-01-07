package com.likui.hty.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 功能描述:  权限测试
 *
 * @auther: likui
 * @date: 2019/1/7 21:19
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/admin")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public String admin(){
        return "admin";
    }

    @RequestMapping("/find")
    @PreAuthorize("hasAnyRole('USER_SELECT')")
    public String find(){
        return "find";
    }

    @RequestMapping("/set")
    @PreAuthorize("hasAnyRole('USER_CREATE')")
    public String set(){
        return "set";
    }

    @RequestMapping("/update")
    @PreAuthorize("hasAnyRole('USER_EDIT')")
    public String update(){
        return "update";
    }

    @RequestMapping("/delete")
    @PreAuthorize("hasAnyRole('USER_DELETE')")
    public String delete(){
        return "delete";
    }
}
