package com.pk.org.client.clientController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;



@RestController
@Configuration
@ConfigurationProperties
@RefreshScope
class MessageRestController {


}
public class clientcontroller {

   // private static final Logger logger = LogManager.getLogger(clientcontroller.class);
    private static final Logger logger = LoggerFactory.getLogger(clientcontroller.class);

    @Autowired
    //private ClassMasterRepo classMasterRepo;

    @RequestMapping("/clientdemo")
    public String hello()

    {
        logger.debug(" I am in Error");
        logger.info("I am in info ");
        logger.warn("I am in warning");
        logger.error(" I am in Error");

        return "Dynamic config client demo";

    }

}



















