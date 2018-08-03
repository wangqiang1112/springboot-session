package htjs;


import htjs.entity.Student;
import htjs.env.EnvConfig;
import htjs.env.JdbcConfig;
import htjs.env.JdbcConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Boot01Application
        extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {
    public static void main(String[] args) {
        //执行时默认将参数中的class类加上@SpringBootConfiguration注解，该注解下的类中都可以添加@Bean返回一个实例对象
        ConfigurableApplicationContext context = SpringApplication.run(Boot01Application.class, args);
        //获取配置文件的值
        System.out.println(context.getEnvironment().getProperty("param"));
        System.out.println("=========="+context.getEnvironment().getProperty("ds.jdbcUrl"));
//        System.out.println(context.getBean("getStudent"));
//        context.getBean(EnvConfig.class).show();
//        context.getBean(JdbcConfig.class).show();
//        context.getBean(JdbcConfig2.class).show();
    }

    //如果Student类上面有注解，此方法将会再次生成一个实例，产生冲突
    @Bean
    public Student getStudent(){
        return new Student();
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8081);
    }
}
