package com.swagger.demo.demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xxh
 * 2020-11-05 22:58
 * 私有属性不会显示，要设置setter以及getter
 **/
@ApiModel("用户") // = @Api
@Data
public class User {
    @ApiModelProperty("用户名")
    String name;
    @ApiModelProperty("年龄")
    int age;
}
