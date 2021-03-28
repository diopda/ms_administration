package delta.administration.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ms-agriculture",url = "http://localhost:8083")
@Service
public interface IntrantService {

	 @GetMapping(path = "/intrants",produces = "application/json")
	Iterable<Intrant> getIntrant();

}
