package com.dorigon.demo.controllers;

import com.dorigon.demo.models.UserModel;
import com.dorigon.demo.models.UserRequest;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import javax.management.modelmbean.ModelMBean;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

@RestController
public class UserController {

    Map<String, UserModel> userMap = new HashMap<>();

    @GetMapping("/login")
    public String login(@RequestParam String Name, String password){
        System.out.printf("Usermane = %s || password = %s", Name,password);

        UserModel userModel = userMap.get(userEmail);

        if(userModel != null){
            if(userEmail.equals(userModel.getUserEmail()) && password.equals(userModel.getUserPassword())){
                userModel.setLogged(true);
                userModel.setUserToken(UUID.randomUUID().toString());
                return userModel.getUserToken();
            }
            else return "";
        }
        else return "";
    }

    @PostMapping("/register")
    public String register(@RequestBody UserRequest userRequest)
    {
        ModelMapper modelMapper = new ModelMapper();
        UserModel userModel = modelMapper.map(userRequest, UserModel.class);
        userModel.setUserId(UUID.randomUUID().toString());
        userModel.setLogged(true);
        userModel.setUserToken(UUID.randomUUID().toString());

        userMap.put(userModel.getUserEmail(),userModel);

        return userModel.getUserToken();


    }

    @PutMapping("/edit/{token}")
    public String edit(@RequestBody Object userRegister, @PathVariable String token){
        Set<String> string = userMap.keySet();

        string.forEach( key -> {
            UserModel userModel = userMap.get(key);
            if(userModel.getUserToken().equals(token)){
                userModel.setName(editRequest.getUserName());
            }
        });

        return "OK";
    }
}
