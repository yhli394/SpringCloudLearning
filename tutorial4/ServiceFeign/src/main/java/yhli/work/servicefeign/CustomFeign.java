package yhli.work.servicefeign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client",fallback = FeignHystrixTest.class)
public interface CustomFeign {

    @GetMapping("/begin")
    String myTest(@RequestParam(value = "name") String name);

}
