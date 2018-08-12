/* *
 * @author Administrator
 * @create 2018/8/1
 */
package com.wang.simplesb.ascept;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Httpaspect {
    @Before("execution(public * com.wang.simplesb.controller.GirlController.*(..))")
    public void log(){
        System.out.println("拦截成功");
    }
}
