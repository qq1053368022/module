package com.xull;

import com.xull.book.entity.SysBook;
import com.xull.book.service.ISysBookService;
import com.xull.user.entity.SysUser;
import com.xull.user.service.ISysUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class SetData extends BasicUtClass{
    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private ISysBookService sysBookService;
    @Test
    public void setSysUserService() {
        SysUser sysUser=new SysUser();
        sysUser.setUsername("admin");
        sysUser.setPassword("123456");
        sysUserService.save(sysUser);
        SysBook sysBook = new SysBook();
        sysBook.setAuthor("admin");
        sysBook.setName("admin");
        sysBookService.save(sysBook);
    }

}
