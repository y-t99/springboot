package cn.yuanyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuanyuan
 * #create 2020-02-25-20:56
 */
@Controller
public class ErrorCodeController {
    @RequestMapping("/test")
    public String test(){
        return "/notfound";
    }
}
