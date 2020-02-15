package cn.yuanyuan.advice;

import cn.yuanyuan.exception.ExceptionDemo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yuanyuan
 * #create 2020-02-15-15:56
 */
@ControllerAdvice
public class ExceptionDemoHandler {
    @ExceptionHandler(ExceptionDemo.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<String,Object>();
        //传入我们自己的错误状态码  4xx 5xx，否则就不会进入定制错误页面的解析流程
        request.setAttribute("javax.servlet.error.status_code",404);
        map.put("code","user.notexist");
        map.put("message",e.getMessage());
        request.setAttribute("expt",map);
        //转发到/error
        return "forward:/error";
    }
}
