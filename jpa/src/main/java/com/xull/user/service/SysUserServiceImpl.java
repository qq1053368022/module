package com.xull.user.service;

import com.xull.base.serivice.BaseServiceImpl;
import com.xull.base.repository.BaseRepository;
import com.xull.user.repository.SysUserRepository;
import com.xull.user.entity.SysUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-20 10:03
 */
@Service("sysUserService")
@Transactional
@Slf4j
public class SysUserServiceImpl extends BaseServiceImpl<SysUser, String> implements ISysUserService {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    @PostConstruct
    public BaseRepository<SysUser, String> getBaseRepository() {
        return this.sysUserRepository;
    }
}
