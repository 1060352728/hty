package com.likui.hty.controller;

import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "测试admin的权限")
    @RequestMapping("/admin")
    @PreAuthorize("hasAnyRole('ADMIN')")
    public String admin(){
        return "admin";
    }

    @ApiOperation(value = "测试find的权限")
    @RequestMapping("/find")
    @PreAuthorize("hasAnyRole('USER_SELECT')")
    public String find(){
        return "find";
    }

    @ApiOperation(value = "测试set的权限")
    @RequestMapping("/set")
    @PreAuthorize("hasAnyRole('USER_CREATE')")
    public String set(){
        return "set";
    }

    @ApiOperation(value = "测试update的权限")
    @RequestMapping("/update")
    @PreAuthorize("hasAnyRole('USER_EDIT')")
    public String update(){
        return "update";
    }

    @ApiOperation(value = "测试delete的权限")
    @RequestMapping("/delete")
    @PreAuthorize("hasAnyRole('USER_DELETE')")
    public String delete(){
        return "delete";
    }
}
