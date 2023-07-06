package yhli.work.configclient.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yhli.work.configclient.CloudConfigTest;

import javax.annotation.Resource;

@RestController
public class ConfigClientController {

    @Resource
    private CloudConfigTest cloudConfigTest;

    @RequestMapping("/hi")
    public String hi(){
        return cloudConfigTest.getName();
    }

}
