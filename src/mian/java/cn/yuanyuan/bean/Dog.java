package cn.yuanyuan.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author yuanyuan
 * #create 2020-02-13-21:08
 */
@Data
@Component
@PropertySource("classpath:bean/dog.properties")
@ConfigurationProperties(prefix = "dog")
public class Dog {
    private String name;
    private int age;
}
