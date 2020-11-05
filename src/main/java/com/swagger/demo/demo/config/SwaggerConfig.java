package com.swagger.demo.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


/**
 * @author xxh
 *  2020-11-05 21:49
 **/
@Slf4j
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 覆盖swaggwe的默认信息
     *
     *
     *
     */
    @Value("${spring.profiles.active}")
      private String value ;


    /**
     * 每一个docket代表一个开发人员管理自己的api
     * environment
     *
     */

    @Bean
     public Docket docket1(Environment environment){

        log.info("===============================value:"+value);

        //当项目处于test、dev环境时显示swagger，处于prod时不显示
        // 设置要显示swagger的环境
        Profiles of = Profiles.of("dev", "test");
        // 判断当前是否处于该环境
        // 通过 enable() 接收此参数判断是否要显示
        boolean b = environment.acceptsProfiles(of);

          return new Docket(DocumentationType.SWAGGER_2)
                  .apiInfo(apiInfo())
                  .groupName("模块一")
                  .enable(b)
                  .select()
                  //配置只会去扫描这个包
                  .apis(RequestHandlerSelectors.basePackage("com.swagger.demo.demo.controller"))
                 // .paths(PathSelectors.ant("/xxh/**")) //路径过滤
                  .build();
     }

    @Bean
    public Docket docket2(Environment environment){

        log.info("===============================value:"+value);

        //当项目处于test、dev环境时显示swagger，处于prod时不显示
        // 设置要显示swagger的环境
        Profiles of = Profiles.of("dev", "test");
        // 判断当前是否处于该环境
        // 通过 enable() 接收此参数判断是否要显示
        boolean b = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("模块二")
                .enable(b)
                .select()
                //配置只会去扫描这个包
                .apis(RequestHandlerSelectors.basePackage("com.swagger.demo.demo.controller2"))
                // .paths(PathSelectors.ant("/xxh/**")) //路径过滤
                .build();
    }

    @Bean
    public Docket docket3(Environment environment){

        log.info("===============================value:"+value);

        //当项目处于test、dev环境时显示swagger，处于prod时不显示
        // 设置要显示swagger的环境
        Profiles of = Profiles.of("dev", "test");
        // 判断当前是否处于该环境
        // 通过 enable() 接收此参数判断是否要显示
        boolean b = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("模块三")
                .enable(b)
                .select()
                //配置只会去扫描这个包
                .apis(RequestHandlerSelectors.basePackage("com.swagger.demo.demo.controller3"))
                // .paths(PathSelectors.ant("/xxh/**")) //路径过滤
                .build();
    }

     private ApiInfo apiInfo(){

         Contact contact = new Contact("司马老贼", "http://www.baidu.com", "1245@qq.com");

         return new ApiInfo("xxh项目Api",
                 "好好学习天天向上",
                 "1.0",
                 "",
                  contact,
                 "Apache 2.0",
                 "http://www.apache.org/licenses/LICENSE-2.0",
                 new ArrayList());
     }

}
