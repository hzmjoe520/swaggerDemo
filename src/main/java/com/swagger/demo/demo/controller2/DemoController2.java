package com.swagger.demo.demo.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxh
 *2020-11-05 22:49
 **/
@RestController
public class DemoController2 {

     @GetMapping("/demo2")
     public String demo02(){

          return "模块2";
     }
}
