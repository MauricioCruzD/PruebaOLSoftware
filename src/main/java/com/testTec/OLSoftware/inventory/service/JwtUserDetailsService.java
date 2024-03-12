package com.testTec.OLSoftware.inventory.service;

/**
 *
 * @author macru
 */
import java.util.ArrayList;
import java.util.List;

import com.testTec.OLSoftware.inventory.repository.UserRepository;
import java.util.Collection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.testTec.OLSoftware.inventory.model.User user = new com.testTec.OLSoftware.inventory.model.User();
        user = userRepository.findByUsername(username);
        System.out.println(user);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }
        List<GrantedAuthority> roles = new ArrayList<>();
        user.getRole().forEach(rol -> {
            roles.add(new SimpleGrantedAuthority(rol.getName()));
        });
        UserDetails ud = new User (user.getUsername(), user.getPassword(), true, true, true, true, roles);
        return ud;
    }
}