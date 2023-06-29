package yhli.work.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class FeignHystrixTest implements CustomFeign{


    @Override
    public String myTest(String name) {
        return name+"service is break!";
    }

}
