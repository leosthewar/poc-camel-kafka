package com.poc.amqs.pocamqstreams.routes.bean;

import java.util.UUID;

public class UuidGenerator {
    public String getUuid(){
        return UUID.randomUUID().toString();
    }
}
