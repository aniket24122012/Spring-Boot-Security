package auth.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import auth.com.Repo.userRepo;
import auth.com.entity.User;
import auth.com.model.userModel;

@RestController
public class userController {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private userRepo userRepo;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome , This is Lovely House";
	}
	
	@GetMapping("/login")
	public String login() {
		return "thanku for login";
	}
	
	@PostMapping("/register")
	public User saveUser(@RequestBody userModel model) {
		User newUser = new User();
		newUser.setEmail(model.getEmail());
		newUser.setPassword(passwordEncoder.encode(model.getPassword()));
		return userRepo.save(newUser);
	}
}
