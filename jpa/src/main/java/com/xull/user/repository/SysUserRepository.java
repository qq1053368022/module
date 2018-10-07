package com.xull.user.repository;

import com.xull.base.repository.BaseRepository;
import com.xull.user.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-25 16:30
 */
@Repository
public interface SysUserRepository extends BaseRepository<SysUser,String > {
}
