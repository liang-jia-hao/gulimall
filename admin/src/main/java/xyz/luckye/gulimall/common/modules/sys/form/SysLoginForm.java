/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package xyz.luckye.gulimall.common.modules.sys.form;

import lombok.Data;

/**
 * 登录表单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
public class SysLoginForm {
    private String username;
    private String password;
    private String captcha;
    private String uuid;


}