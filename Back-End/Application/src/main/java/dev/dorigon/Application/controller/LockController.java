package dev.dorigon.Application.controller;

import dev.dorigon.Application.domain.Lock;
import dev.dorigon.Application.domain.LockRepository;
import dev.dorigon.Application.models.requests.LockRequest;
import dev.dorigon.Application.models.response.LockResponse;
import dev.dorigon.Application.services.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController( value ="/")
public class LockController {

    @Autowired
    private LockService lockService;


    @PostMapping
    public LockResponse saveLock(@RequestBody LockRequest lockRequest) {

        return lockService.saveLock(lockRequest);
    }

    @GetMapping("/{lockId}")
    public LockResponse getLock(@PathVariable String lockId){

        return lockService.getLock(lockId);
    }
}
