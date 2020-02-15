package cn.yuanyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author yuanyuan
 * #create 2020-02-14-20:26
 */
@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Map<String,Object> map, HttpSession session) {
        //1、数据校验

        //2、验证身份
        final String pwd="yuanyuan";
        if (StringUtils.isEmpty(username) || !pwd.equals(password)){
            map.put("msg","登录失败");
            return "index";
        }
        session.setAttribute("loginUser",username);
        return "redirect:/main.html";
    }
}
