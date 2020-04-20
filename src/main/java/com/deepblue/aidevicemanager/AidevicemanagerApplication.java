package com.deepblue.aidevicemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan(basePackages = {"com.deepblue.aidevicemanager.mapper"})
@EnableWebMvc
public class AidevicemanagerApplication {

  public static void main(String[] args) {
    SpringApplication.run(AidevicemanagerApplication.class, args);
  }

}
