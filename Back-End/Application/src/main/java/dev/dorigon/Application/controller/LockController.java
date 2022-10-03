package dev.dorigon.Application.controller;

import dev.dorigon.Application.domain.Lock;
import dev.dorigon.Application.domain.LockRepository;
import dev.dorigon.Application.models.requests.LockRequest;
import dev.dorigon.Application.models.response.LockResponse;
import dev.dorigon.Application.services.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController( value ="/")
public class LockController {

    @Autowired
    private LockService lockService;


    @PostMapping
    public LockResponse saveLock(@RequestBody LockRequest lockRequest) {

    }
}
