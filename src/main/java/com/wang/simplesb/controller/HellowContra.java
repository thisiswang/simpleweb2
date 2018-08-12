/* *
 * @author Administrator
 * @create 2018/7/25
 */
package com.wang.simplesb.controller;

import com.wang.simplesb.bean.GirlApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class HellowContra {


    @Autowired
    private GirlApplication girlApplication;

@RequestMapping(value ="/hellow",method = RequestMethod.GET)
    public  String say(){
        return  girlApplication.getCupsize()+"age"+girlApplication.getAge();
    }

}
