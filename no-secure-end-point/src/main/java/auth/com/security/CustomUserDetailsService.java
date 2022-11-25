package auth.com.security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import auth.com.entity.User;
import auth.com.repo.userRepo;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	 private userRepo repo;
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
	 User user = repo.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException("user not found"));
	return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),new ArrayList<>());
	}

}
