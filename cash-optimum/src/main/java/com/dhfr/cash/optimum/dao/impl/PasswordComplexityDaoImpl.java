/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhfr.cash.optimum.dao.impl;

import com.dhfr.cash.optimum.dao.PasswordComplexityDao;
import com.dhfr.cash.optimum.entity.PasswordComplexity;
import com.dhfr.data.core.dao.impl.IDAOImpl;
import javax.inject.Named;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

/**
 *
 * @author denifahri
 */
@Repository(value = "passwordComplexityDao")
@Lazy
public class PasswordComplexityDaoImpl extends IDAOImpl<PasswordComplexity> implements PasswordComplexityDao {

    @Override
    public Class<PasswordComplexity> getEntityClass() {
        return PasswordComplexity.class;
    }

    @Override
    public PasswordComplexity getByCode(String code) {
        Criteria criteria = getCurrentSession().createCriteria(getEntityClass());
        criteria.add(Restrictions.eq("code", code));
        return (PasswordComplexity) criteria.uniqueResult();
    }

}
