package dev.dorigon.Application.services;

import dev.dorigon.Application.domain.Lock;
import dev.dorigon.Application.models.requests.LockRequest;

public interface LockService {

    String saveLock(LockRequest lockRequest);

}
