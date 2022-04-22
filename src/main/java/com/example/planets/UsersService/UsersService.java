package com.example.planets.UsersService;

import com.example.planets.JpaRepository.UsersRepository;
import com.example.planets.UserServiceImpl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Slf4j
@Service("UsersService")
public class UsersService implements UserServiceImpl {

    @Autowired
    private UsersRepository users;

    @Override
    public List<String> findByUsers() throws Exception {
        return users.findByUsers();
    }
}
