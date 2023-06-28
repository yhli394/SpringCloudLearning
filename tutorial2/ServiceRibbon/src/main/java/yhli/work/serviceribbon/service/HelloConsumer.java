package yhli.work.serviceribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloConsumer {


    @Resource
    RestTemplate restTemplate;


    public String helloService(String name){
        return restTemplate.getForObject("http://CLIENT/begin?name="+name, String.class);
    }

}
