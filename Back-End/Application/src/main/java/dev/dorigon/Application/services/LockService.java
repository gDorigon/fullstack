package dev.dorigon.Application.services;

import dev.dorigon.Application.domain.Lock;
import dev.dorigon.Application.models.requests.LockRequest;
import dev.dorigon.Application.models.response.LockResponse;

public interface LockService {

    LockResponse saveLock(LockRequest lockRequest);

    LockResponse getLock(String lockId);
}
