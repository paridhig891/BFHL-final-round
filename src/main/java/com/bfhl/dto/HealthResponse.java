package com.bfhl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record HealthResponse(

        @JsonProperty("is_success") boolean success,
        @JsonProperty("status") String status
) {
}