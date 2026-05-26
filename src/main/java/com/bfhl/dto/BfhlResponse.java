package com.bfhl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BfhlResponse {

    @JsonProperty("is_success")
    private boolean is_success;

    private String user_id;

    private String email;

    private String roll_number;

    private List<String> odd_numbers;

    private List<String> even_numbers;

    private List<String> alphabets;

    private List<String> special_characters;

    private String sum;

    private String concat_string;
}