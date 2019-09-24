package com.autoai.nglp.publicsurverysystem.config;

import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 注册MyBatis分页插件PageHelper
 * @author LR
 */
@Configuration
@Slf4j
public class MybatisConf {
	@Bean
    public PageHelper pageHelper() {  
        PageHelper pageHelper = new PageHelper();  
        Properties p = new Properties();  
        p.setProperty("offsetAsPageNum", "true");  
        p.setProperty("rowBoundsWithCount", "true");  
        p.setProperty("reasonable", "false");
        pageHelper.setProperties(p);  
        return pageHelper;  
    }
}
