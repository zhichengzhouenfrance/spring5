package com.example.controller;

import com.example.data.bean.User;
import com.example.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GET
    @RequestMapping(value = "/name/{name}",  method= RequestMethod.GET)
    @ResponseBody
    public
    List<User> getUserByName(@PathVariable("name") String name )
    {
        List<User> users = userRepository.findByName(name);
        return users;
    }
}
