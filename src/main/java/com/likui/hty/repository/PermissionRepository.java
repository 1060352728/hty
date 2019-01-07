package com.likui.hty.repository;

import com.likui.hty.entity.Permission;
import com.likui.hty.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.util.Set;

/**
 *
 * 功能描述: 权限dao
 *
 * @auther: likui
 * @date: 2019/1/7 21:21
 */
public interface PermissionRepository extends JpaRepository<Permission, Long>, JpaSpecificationExecutor {

    /**
     * findByRoles
     * @param roleSet
     * @return
     */
    Set<Permission> findByRoles(Set<Role> roleSet);
}
