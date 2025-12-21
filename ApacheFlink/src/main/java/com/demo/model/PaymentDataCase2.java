package com.demo.model;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

import static com.demo.utils.SerializerProvider.GSON;

@Getter
@Builder
public class PaymentDataCase2 {
    private String application;
    private Long componentId;
    private String status;
    private Long eventTime;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PaymentDataCase2 that)) return false;
        return Objects.equals(componentId, that.componentId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(componentId);
    }

    public String toString() {
        return GSON.toJson(this);
    }
}