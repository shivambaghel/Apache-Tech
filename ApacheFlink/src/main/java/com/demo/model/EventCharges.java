package com.demo.model;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import static com.demo.utils.SerializerProvider.GSON;

@Getter
@Builder
public class EventCharges {
    public Long componentId;
    public String appName;
    public String status;
    public Date endTime;

    public String toString() {
        return GSON.toJson(this);
    }

    public EventCharges(Long componentId, String appName, String status, Date endTime) {
        this.componentId = componentId;
        this.appName = appName;
        this.status = status;
        this.endTime = endTime;
    }
}