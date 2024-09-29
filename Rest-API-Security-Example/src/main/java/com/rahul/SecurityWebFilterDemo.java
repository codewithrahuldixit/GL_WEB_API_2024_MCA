package com.rahul;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityWebFilterDemo {
	@Bean
	//@Order(SecurityProperties.BASIC_AUTH_ORDER)
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
		http.formLogin(withDefaults());
		http.sessionManagement(
				s->s.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
				);
		http.httpBasic(withDefaults());
		http.csrf().disable();
		return http.build();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		var user = User.withUsername("Atul").password("{noop}atul").roles("USER").build();
		var admin = User.withUsername("Shikha").password("{noop}shikha").roles("ADMIN").build();
		return new InMemoryUserDetailsManager(user,admin);
	}
}
