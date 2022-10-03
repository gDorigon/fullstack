package dev.dorigon.Application.models.requests;

public class LockRequest {

    private String lockName;
    private String lockDescription;
    private String lockImageUrl;

    public String getLockName() {
        return lockName;
    }

    public String getLockDescription() {
        return lockDescription;
    }

    public String getLockImageUrl() {
        return lockImageUrl;
    }
}
