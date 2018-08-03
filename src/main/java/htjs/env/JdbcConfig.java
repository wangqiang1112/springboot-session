package htjs.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcConfig {
    @Value("${jdbcUrl}")
    private String jdbcUrl;

    @Value("${jdbcName}")
    private String username;

    @Value("${password}")
    private String password;

    public void show(){
        System.out.println(jdbcUrl+" "+username+" "+password);
    }

}
