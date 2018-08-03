package htjs.env;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class EnvConfig {

    @Value("${portEnv}")
    private String port;

    //设置默认值，配置文件中不能有该属性，否则会以配置文件中为准
    @Value("${defaultPortEnv:8082}")
    private String defaultPortEnv;

    @Autowired
    private Environment env;

    public void show(){
        System.out.println(env.getProperty("paramEnv"));
        System.out.println("port="+port);
        System.out.println("defaultPortEnv="+defaultPortEnv);
    }


}
