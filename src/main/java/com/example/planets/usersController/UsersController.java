package com.example.planets.usersController;

import com.example.planets.UsersService.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UsersController {
    @Autowired
    UsersService usersService;

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> findByName() throws Exception {
        return  usersService.findByUsers();
    }

    @GetMapping({"/mc"})
    public String test(){

        return "name : 문원철"+"\n" +"나이 : 42" + "\n" + "전투력 : 800만";
    }
}
