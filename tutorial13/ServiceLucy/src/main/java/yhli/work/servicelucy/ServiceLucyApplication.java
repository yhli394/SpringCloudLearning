package yhli.work.servicelucy;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableCircuitBreaker
@EnableHystrixDashboard
public class ServiceLucyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLucyApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/begin")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam String name){
        return "my name is "+name+",i come from port:"+port;
    }

    public String hiError(String name){
        return "hi,"+name+"this is an error!";
    }

}
