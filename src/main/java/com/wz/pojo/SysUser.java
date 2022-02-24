package com.wz.pojo;

import lombok.Data;

/**
 * @author ：wzh744
 * @date ：Created in 2022/2/22 09:18
 * @description：
 */
@Data
public class SysUser {

    private Long id;

    private String account;

    private Integer admin;

    private String avatar;

    private Long createDate;

    private Integer deleted;

    private String email;

    private Long lastLogin;

    private String mobilePhoneNumber;

    private String nickname;

    private String password;

    private String salt;

    private String status;
}
