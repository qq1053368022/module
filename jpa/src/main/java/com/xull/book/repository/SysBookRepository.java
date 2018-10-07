package com.xull.book.repository;

import com.xull.base.repository.BaseRepository;
import com.xull.book.entity.SysBook;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-25 16:28
 */
@Repository
public interface SysBookRepository extends BaseRepository<SysBook,String > {
}
