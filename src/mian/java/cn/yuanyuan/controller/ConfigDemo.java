package cn.yuanyuan.controller;

import cn.yuanyuan.bean.Cat;
import cn.yuanyuan.bean.Dog;
import cn.yuanyuan.bean.Horse;
import cn.yuanyuan.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanyuan
 * #create 2020-02-13-21:15
 */
@RestController
public class ConfigDemo {
    @Autowired
    Person person;

    @Autowired
    Dog dog;

    @Autowired
    Cat cat;

    @Autowired
    Horse horse;

    @RequestMapping("/config")
    @ResponseBody
    public String config() {
        String str1 = "全局配置文件：" + person.toString();
        str1 += "      指定配置文件：" + dog.toString();
        str1 += "      java注解配置bean：" + cat.toString();
        str1 += "      value注解：" + horse.toString();
        return str1;
    }
}
