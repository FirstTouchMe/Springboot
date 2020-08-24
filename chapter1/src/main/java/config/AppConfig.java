package config;

import POJO.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //代表这是一个Java配置文件，Spring的容器会自动装配bean
public class AppConfig {
    //代表将initUser方法返回POJO装配到IOC。若不配置name，则会将方法名作为Bean的名称
    @Bean(name="user")
    public User initUser(){
        User user=new User();
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");
        return user;
    }
}
