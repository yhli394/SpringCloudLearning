package yhli.work.serviceribbon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yhli.work.serviceribbon.service.HelloConsumer;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    HelloConsumer helloConsumer;

    @RequestMapping("/hi")
    public String hello(@RequestParam String name){
        return helloConsumer.helloService(name);
    }

}
