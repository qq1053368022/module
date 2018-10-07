package com.xull.book.entity;

import com.xull.base.entity.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-25 16:01
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SysBook extends BaseEntity {
    @Column(name = "fname")
    private String name;
    @Column(name = "fauthor")
    private String author;
}
