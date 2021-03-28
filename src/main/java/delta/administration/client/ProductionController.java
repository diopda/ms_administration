package delta.administration.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductionController {
	 @Autowired
	    private ProductionService  productionService;
	 @CrossOrigin(origins = "http://localhost:4200")
	  @RequestMapping(value = "/productions", method = RequestMethod.GET)
	    public Iterable<Production> getProduction() {

	        return productionService.getProduction();
	    }

}
