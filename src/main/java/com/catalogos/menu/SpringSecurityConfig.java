package com.catalogos.menu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfig {
    @Bean
    public static BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() throws Exception {
    
            InMemoryUserDetailsManager manager= new InMemoryUserDetailsManager();
        //UserDetails user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build();
            manager.createUser(User.withUsername("user").password(passwordEncoder().encode("password")).roles("USER").build());
        
      return manager;
      }
}
