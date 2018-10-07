package com.xull.user.entity;

import com.xull.base.entity.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @description:
 * @author: xull
 * @date: 2018-09-20 9:03
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SysUser extends BaseEntity {
    private static final long serialVersionUID = -5191055038084933410L;
    @Column(name = "fusername")
    private String username;
    @Column(name = "fpassword")
    private String password;
}
