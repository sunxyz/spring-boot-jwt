package com.sj.commons.web.security.rest;

import lombok.Data;

/**
 * UserLoginDTO
 *
 * @author yangrd
 * @date 2019/06/18
 */
@Data
public class UserLoginDTO {

    private String username;
    private String password;
}
