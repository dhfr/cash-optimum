/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhfr.cash.optimum.service;

import com.dhfr.cash.optimum.entity.PasswordComplexity;
import com.dhfr.data.core.service.IService;

/**
 *
 * @author denifahri
 */
public interface PasswordComplexityService extends IService<PasswordComplexity>{
       PasswordComplexity getByCode(String code) throws Exception;
}
