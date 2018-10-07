package com.xull.base.serivice;

import com.xull.base.entity.BaseEntity;
import com.xull.base.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-20 10:04
 */
public abstract class BaseServiceImpl<T extends BaseEntity, ID extends Serializable> implements IBaseService<T, ID> {
    public abstract BaseRepository<T, ID> getBaseRepository();
    @Override
    public <S extends T> void save(S entity) {
        getBaseRepository().save(entity);
    }

    @Override
    public List<T> findAll() {
        return getBaseRepository().findAll();
    }

    @Override
    public T findById(ID id) {
        return getBaseRepository().getOne(id);
    }

    @Override
    public <S extends T> S saveAndFlush(S entity) {
        return getBaseRepository().saveAndFlush(entity);
    }

    @Override
    public void deleteById(ID id) {
        getBaseRepository().deleteById(id);
    }

    @Override
    public <S extends T> void delete(S entity) {
        getBaseRepository().delete(entity);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return getBaseRepository().findAll(pageable);
    }

    @Override
    public Page<T> findAll(Specification<T> spec, Pageable pageable) {
        return getBaseRepository().findAll(spec, pageable);
    }
}
