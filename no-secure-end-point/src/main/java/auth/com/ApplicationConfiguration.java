package auth.com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ApplicationConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		    .authorizeRequests()
		    .antMatchers("/welcome")
		    .permitAll()
		    .and()
		    .authorizeRequests()
		    .antMatchers("/aniket")
		    .hasRole("ADMIN")
		    .anyRequest()
		    .authenticated()
		    .and()
		    .formLogin();
	}
	
	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		// TODO Auto-generated method stub
		List<UserDetails> users= new ArrayList<UserDetails>();
		users.add(User.withDefaultPasswordEncoder().username("aniket").password("aniket").roles("ADMIN").build());
		users.add(User.withDefaultPasswordEncoder().username("golu").password("golu").roles("USER").build());
	    
		return new InMemoryUserDetailsManager(users);
	}

}
