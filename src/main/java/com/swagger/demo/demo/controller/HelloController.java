package com.swagger.demo.demo.controller;

import com.swagger.demo.demo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxh
 *  2020-11-05 21:46
 **/
@Api(value = "hello功能",tags = "hello模块")
@RestController
public class HelloController {


      @GetMapping("/hello")
       public String  hello(){

            return  "hello";
     }

    @ApiOperation(value = "获取用户的方法",httpMethod = "get",produces = "application/json")
     @GetMapping("xxh/hello")
     public User hello2(){

        return  new User();
    }


     @ApiOperation(value = "获取用户的方法",httpMethod = "get",produces = "application/json")
     @GetMapping("/user/{name}")
     public  User getUser(@PathVariable("name")@ApiParam(value = "名字",type = "string") String name){
         User user = new User();

         user.setName(name);

         return user;

     }

}
