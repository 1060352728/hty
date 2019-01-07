package com.likui.hty.repository;

import com.likui.hty.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * 功能描述: 角色dao
 *
 * @auther: likui
 * @date: 2019/1/7 21:21
 */
public interface RoleRepository extends JpaRepository<Role, Long>, JpaSpecificationExecutor {

    /**
     * findByName
     * @param name
     * @return
     */
    Role findByName(String name);
}
