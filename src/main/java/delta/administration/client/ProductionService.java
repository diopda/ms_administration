package delta.administration.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(contextId="ProductionService" ,name = "ms-referenciel",url = "http://localhost:8083")
@Service
public interface ProductionService {
	
	@GetMapping(path = "/productions",produces = "application/json")
	Iterable<Production> getProduction();

}
