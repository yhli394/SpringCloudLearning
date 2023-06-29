package yhli.work.servicefeign;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {

    @Resource
    CustomFeign customFeign;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return customFeign.myTest(name);
    }

}
