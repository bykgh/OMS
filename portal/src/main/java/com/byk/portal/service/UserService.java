package com.byk.portal.service;

import com.byk.common.beans.UserBean;

/**
 * @author yikai.bi
 */
public interface UserService {

    /**
     * 查询用户信息
     * @return
     */
    public UserBean findUser();
}
