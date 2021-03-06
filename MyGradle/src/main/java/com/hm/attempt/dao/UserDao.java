/*
* Copyright (c) 2017 by Aisino Wincor Retail & Banking Systems (Shanghai) Co., Ltd,
* Block 70, No.36, Yiwei Rd.,Waigaoqiao Free Trade Zone, Shanghai, China
*
* This software is the confidential and proprietary information
* of Aisino Wincor.
*
* You shall not disclose such confidential information and shall
* use it only in accordance with the terms of the license agreement
* you entered into with Aisino Wincor.
*
*/
package com.hm.attempt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hm.attempt.entity.User;

/**
 * 
 * @author min_huang
 *
 */
public interface UserDao extends JpaRepository<User, String> {

}
