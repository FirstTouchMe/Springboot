package config;


import POJO.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class IocTest {
    public static Log log= LogFactory.getLog(IocTest.class);
    public static void main(String[] args) {
        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(AppConfig.class);
        User user=ctx.getBean(User.class);
        log.info(user.getId()+"==========="+user.getNote());
        System.out.println(user.getId());
    }
}
