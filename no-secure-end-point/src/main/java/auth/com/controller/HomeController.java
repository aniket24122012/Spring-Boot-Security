package auth.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/user/home")
	public String welcome() {
		return "Welcome to mu world";
	}
	
	@GetMapping("/user/dashboard")
	public String aniket() {
		return "welcome to user dashborad";
	}
}
