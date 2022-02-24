package com.wz.service;

import com.wz.pojo.SysUser;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 13:54
 * @description：
 */
public interface SysUserServcie {

    SysUser findUserById(Long authorId);
}
