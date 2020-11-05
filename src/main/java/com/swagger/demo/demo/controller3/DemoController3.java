package com.swagger.demo.demo.controller3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxh
 *  2020-11-05 22:49
 **/
@RestController
public class DemoController3 {

     @GetMapping("/demo3")
     public String demo03(){

          return "模块三";
     }
}
