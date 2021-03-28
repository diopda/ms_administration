package delta.administration.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IntrantController {
	
	 @Autowired
	    private IntrantService intrantService;

	 @CrossOrigin(origins = "http://localhost:4200")
	 @RequestMapping(value = "/intrants", method = RequestMethod.GET)
	    public Iterable<Intrant> getIntrant() {

	        return intrantService.getIntrant();
	    }

}
