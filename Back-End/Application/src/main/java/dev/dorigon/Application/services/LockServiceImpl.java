package dev.dorigon.Application.services;

import dev.dorigon.Application.domain.Lock;
import dev.dorigon.Application.domain.LockRepository;
import dev.dorigon.Application.models.requests.LockRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Service
public class LockServiceImpl implements LockService{

    private LockRepository lockRepository;
    @Override
    public String saveLock(@RequestBody LockRequest lockRequest){

        Lock lock = new Lock();
        lock.setLockId(UUID.randomUUID().toString());
        return "STRING FROM SERVICE";
    }
}
