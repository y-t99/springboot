package cn.yuanyuan.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author yuanyuan
 * #create 2020-02-13-22:02
 */

@Data
//@Component
public class Cat {
    private String name;
    private int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}



