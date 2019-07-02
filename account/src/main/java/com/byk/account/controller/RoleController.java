package com.byk.account.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import com.alibaba.fastjson.JSONObject;
import com.byk.account.entity.Role;
import com.byk.account.service.RoleService;
import com.byk.common.beans.Result;
import com.byk.common.beans.RoleBean;
import com.byk.common.enums.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: love
 * @Description: 角色controller
 * @Date: 2019-07-02 12:56
 * @Version: 1.0
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);


    @Autowired
    public RoleService roleService;

    @RequestMapping("/addRole")
    public Result addRole(RoleBean roleBean){
        Role role = new Role();
        BeanUtil.copyProperties(roleBean,role, CopyOptions.create().setIgnoreNullValue(false));
        roleService.save(role);
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage("添加角色信息成功");
        return result;
    }

    @RequestMapping("/updateRole")
    public Result updateRole(RoleBean roleBean){
        Role role = roleService.findById(roleBean.getId());
        BeanUtil.copyProperties(roleBean,role, CopyOptions.create().setIgnoreNullValue(false));
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage("更新角色信息成功");
        return null;
    }

    @RequestMapping("/findAllRole")
    public Result findAllRole(){
        List<Role> roleList = roleService.findAllRole();
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMessage(ResultCode.SUCCESS.getMessage());
        result.setData(JSONObject.toJSONString(roleList));
        return result;
    }

}