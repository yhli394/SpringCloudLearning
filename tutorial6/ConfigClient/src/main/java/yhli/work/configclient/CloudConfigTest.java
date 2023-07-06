package yhli.work.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class CloudConfigTest {

    @Value("${my.name}")
    private String name;

    public String getName(){
        return name;
    }

}
