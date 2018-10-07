package com.xull.base.repository;

import com.xull.base.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-25 16:25
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity,S extends Serializable> extends JpaRepository<T,S> ,JpaSpecificationExecutor<T> {
}
