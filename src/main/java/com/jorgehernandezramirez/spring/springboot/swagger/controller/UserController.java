package com.jorgehernandezramirez.spring.springboot.swagger.controller;

import com.jorgehernandezramirez.spring.springboot.swagger.controller.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    public UserController(){
        //For Spring
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody UserDto userDto) {
        LOGGER.info("Se va a proceder a crear el usuario {}", userDto);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UserDto> getUsers() {
        return Arrays.asList(new UserDto("1", "Jorge"), new UserDto("2", "Jose"));
    }
}
