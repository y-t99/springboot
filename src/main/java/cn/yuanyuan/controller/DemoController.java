package cn.yuanyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuanyuan
 * #create 2020-02-13-20:02
 */
@Controller
public class DemoController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
