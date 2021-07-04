package com.mall.item.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Janwes
 * @version 1.0
 * @package com.mall.item.controller
 * @date 2021/7/4 11:48
 * @description
 */
@Api(tags = "用户中心")
@RestController
@RequestMapping("/user")
public class GetApolloConfigController {

    @Value("${userCenter.username}")
    private String username;

    @ApiOperation(value = "获取用户名")
    @GetMapping("/getUsername")
    public String getUsername() {
        return username;
    }
}
