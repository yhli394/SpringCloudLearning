package yhli.work.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloConsumer {


    @Resource
    RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "error")
    public String helloService(String name){
        return restTemplate.getForObject("http://CLIENT/begin?name="+name, String.class);
    }

    public String error(String name){
        return "hi,"+name+"this is an error!";
    }


}
