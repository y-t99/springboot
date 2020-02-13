package cn.yuanyuan.config;

import cn.yuanyuan.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuanyuan
 * #create 2020-02-13-22:02
 */
@Configuration
public class MyAppConfig {

    @Bean
    public Cat cat(){
        return new Cat("huahua",7);
    }

}
