package cn.yuanyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuanyuan
 * #create 2020-02-14-9:26
 */
@MapperScan(value = "cn.yuanyuan.mapper")
@SpringBootApplication
public class YtApplicationLanch {
    public static void main(String[] args) {
        SpringApplication.run(YtApplicationLanch.class);
    }
}
