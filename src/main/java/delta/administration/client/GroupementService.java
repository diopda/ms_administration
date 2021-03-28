package delta.administration.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "ms-referenciel",url = "http://localhost:8082")
@Service
public interface GroupementService {

    @GetMapping(path = "/groupements",produces = "application/json")
    public List getGroupement() ;


}
