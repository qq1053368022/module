package com.xull.book.service;

import com.xull.base.repository.BaseRepository;
import com.xull.base.serivice.BaseServiceImpl;
import com.xull.book.entity.SysBook;
import com.xull.book.repository.SysBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-25 16:41
 */
@Service("sysBookService")
@Transactional
@Slf4j
public class SysBookServiceImpl extends BaseServiceImpl<SysBook,String > implements ISysBookService {

    @Autowired
    SysBookRepository sysBookRepository;

    @Override
    @PostConstruct
    public BaseRepository<SysBook, String> getBaseRepository() {
        return sysBookRepository;
    }
}
