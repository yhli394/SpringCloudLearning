package yhli.work.eurekaserver7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7Application.class, args);
    }

}






