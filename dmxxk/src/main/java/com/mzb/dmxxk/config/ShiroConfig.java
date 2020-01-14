package com.mzb.dmxxk.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.mzb.dmxxk.shiro.ShiroRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: ZYF
 * @date: 2020-01-13 11:07
 */
@Configuration
public class ShiroConfig {

    @Bean
    public Realm realm(){
        return new ShiroRealm();
    }

    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition(){

        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        chainDefinition.addPathDefinition("/static/**","anon");
        chainDefinition.addPathDefinition("/bootstrap/**","anon");
        chainDefinition.addPathDefinition("/css/**","anon");
        chainDefinition.addPathDefinition("/dist/**","anon");
        chainDefinition.addPathDefinition("/images/**","anon");
        chainDefinition.addPathDefinition("/js/**","anon");
        chainDefinition.addPathDefinition("/plugins/**","anon");
        chainDefinition.addPathDefinition("/logout","logout");
        chainDefinition.addPathDefinition("/**", "user");//\/**放到最后

        return chainDefinition;
    }

    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }

}
