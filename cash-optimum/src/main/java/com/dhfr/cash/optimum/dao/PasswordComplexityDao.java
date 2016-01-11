/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhfr.cash.optimum.dao;

import com.dhfr.cash.optimum.entity.PasswordComplexity;
import com.dhfr.data.core.dao.IDAO;

/**
 *
 * @author denifahri
 */
public interface PasswordComplexityDao extends IDAO<PasswordComplexity>{
       public PasswordComplexity getByCode(String code);
}
