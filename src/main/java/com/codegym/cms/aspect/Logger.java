package com.codegym.cms.aspect;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
    public void error(){
        System.out.println("[CMS] ERROR !");
    }

    @AfterThrowing(pointcut = "execution(public * com.codegym.cms.service.customer.CustomerService.findAll(..))")
    public void log() {}
}
