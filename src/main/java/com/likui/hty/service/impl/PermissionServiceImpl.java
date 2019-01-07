package com.likui.hty.service.impl;

import com.likui.hty.service.PermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * 功能描述: ServiceImpl
 *
 * @auther: likui
 * @date: 2019/1/7 21:25
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class PermissionServiceImpl implements PermissionService {

}
