package auth.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/name")
	public String getMyName() {
		return "Aniket Kandrikar";
	}

}
