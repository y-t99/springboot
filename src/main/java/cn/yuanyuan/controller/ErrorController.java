package cn.yuanyuan.controller;

import cn.yuanyuan.exception.ExceptionDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuanyuan
 * #create 2020-02-15-16:04
 */
@Controller
public class ErrorController {
    @RequestMapping("/errorMessage")
    public String toError(){
        throw new ExceptionDemo();
    }
}
