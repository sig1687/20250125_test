package untitled.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "delivery", url = "${api.url.delivery}")
public interface Service {
    @RequestMapping(method= RequestMethod.POST, path="/")
    public void statDeliveryApi(@RequestBody  );
}
