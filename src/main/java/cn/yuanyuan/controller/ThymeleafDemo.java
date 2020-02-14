package cn.yuanyuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author yuanyuan
 * #create 2020-02-14-10:41
 */
@Controller
public class ThymeleafDemo {
    @RequestMapping("/thymeleaf")
    public String thyemeleaf(Map<String,Object> map){
        map.put("name","孙仙");
        List<Object> names=new ArrayList<Object>();
        names.add("伊世莉");
        names.add("李政赫");
        map.put("names",names);
        return "public/thymeleaf";
    }
}
