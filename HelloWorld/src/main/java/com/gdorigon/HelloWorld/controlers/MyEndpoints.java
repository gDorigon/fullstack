package com.gdorigon.HelloWorld.controlers;

import com.gdorigon.HelloWorld.models.Device;
import com.gdorigon.HelloWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MyEndpoints {

    @Autowired
    private MyService myService;

    @GetMapping //http://localhost:9000/test
    public List<Device> myFirstGet(){
        return myService.getAllDevices();
    }

    @GetMapping("/{myId}") //http://localhost:9000/test/<id>
    public String endpointWithParameter(@PathVariable Integer myId){
        System.out.println((myId));
        return "Hello World " + myId;
    }

    @GetMapping("/v1") //http://localhost:9000/test/v1?value=<value>
    public String endpointWithQuery(@RequestParam Integer value){
        System.out.println(value);
        return "Hello World " + value;
    }

    @PostMapping //http://localhost:9000/test
    public Device myFirstPost(@RequestBody Device device){

        Device save = myService.save(device);
        return save;
    }

}
