package auth.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/welcome")
	public String getName() {
		return "Hey, Welcome to my World";
	}
   
}
