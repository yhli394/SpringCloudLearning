package yhli.work.servicehi;

import brave.sampler.Sampler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@SpringBootApplication
public class ServiceHiApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

    private static Logger logger = LoggerFactory.getLogger(ServiceHiApplication.class);

    @Resource
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        logger.info("call trace service-hi");
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        logger.info("call trace service-hi");
        return "i'm service-hi";
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }




}
