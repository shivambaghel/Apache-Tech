package com.demo.model;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
import java.util.Objects;

import static com.demo.utils.SerializerProvider.GSON;

@Getter
@Builder
public class PaymentData {
    private String application;
    private Long componentId;
    private String status;
    private Date eventTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentData that)) return false;
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
