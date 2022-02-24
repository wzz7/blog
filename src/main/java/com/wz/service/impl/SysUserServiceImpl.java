package com.wz.service.impl;

import com.wz.mapper.SysUserMapper;
import com.wz.pojo.SysUser;
import com.wz.service.SysUserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 13:57
 * @description：
 */
@Service
public class SysUserServiceImpl implements SysUserServcie {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findUserById(Long authorId) {
        SysUser sysUser = sysUserMapper.selectById(authorId);
        if (sysUser == null) {
            sysUser = new SysUser();
            sysUser.setNickname("佚名");
        }
        return sysUser;
    }
}
