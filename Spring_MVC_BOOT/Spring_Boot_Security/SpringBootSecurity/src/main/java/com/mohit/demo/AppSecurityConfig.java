package com.mohit.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter
{
	
	@Autowired         //It will check username given in method name
	public UserDetailsService userDetailsService;
	
	@Bean
	public AuthenticationProvider authProvider()
	{
		//Here DAO layer will talk to service layer
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(); 
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		// Here Only Bcrypt passwords will be allowed
		return provider;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		try
		{
			http
			.csrf().disable()
			.authorizeRequests().antMatchers("/login").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.usernameParameter("n1")
			.passwordParameter("p1")
			.loginPage("/login").permitAll()
			.and()
			.logout().invalidateHttpSession(true)
			.clearAuthentication(true)
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
			.logoutSuccessUrl("/logout-success").permitAll();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() 
//	{
//		List<UserDetails> users = new ArrayList<>();  
//		users.add(User.withDefaultPasswordEncoder().username("mohit").password("1234").roles("USER").build());
//		
//		return new InMemoryUserDetailsManager(users);
//	}
}
