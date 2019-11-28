package com.puc.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * It overrides the loadUserByUsername for fetching user details from the database using the username.
 * The Spring Security Authentication Manager calls this method for getting the user details from the database when
 * authenticating the user details provided by the user. Here we are getting the user details from a hardcoded User List.
 * In the next tutorial we will be adding the DAO implementation for fetching User Details from the Database.
 * Also the password for a user is stored in encrypted format using BCrypt.
 * Here using the Online Bcrypt Generator you can generate the Bcrypt for a password.
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("danielbrasil".equals(username)) {
            return new User("danielbrasil", "$2a$10$VYMm34nyrls4arVoQdz5j.6zWl5pux4XKI7svXStuaDyy24Rw5Drm",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}