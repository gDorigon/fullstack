package dev.dorigon.Application.services.Implementation;

import dev.dorigon.Application.domain.Lock;
import dev.dorigon.Application.domain.LockRepository;
import dev.dorigon.Application.models.requests.LockRequest;
import dev.dorigon.Application.models.response.LockResponse;
import dev.dorigon.Application.services.LockService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

@Service
public class LockServiceImpl implements LockService {

    private LockRepository lockRepository;
    @Override
    public LockResponse saveLock(@RequestBody LockRequest lockRequest){
        ModelMapper modelMapper = new ModelMapper();

        Lock lock = modelMapper.map(lockRequest, Lock.class);

        lock.setLockId(UUID.randomUUID().toString());

        Lock lockSaved = lockRepository.save(lock);

        return modelMapper.map(lockSaved, LockResponse.class);
    }

    @Override
    public LockResponse getLock(String lockId) {

        ModelMapper modelMapper = new ModelMapper();
        Lock lock = lockRepository.findByLockId(lockId);

        return modelMapper.map(lock, LockResponse.class);
    }

}
