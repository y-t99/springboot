package cn.yuanyuan.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author yuanyuan
 * #create 2020-02-13-22:28
 */
@Component
@Data
public class Horse {
    @Value("horse")
    private String name;
    @Value("#{11*2}")
    private int age;
}
