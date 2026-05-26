package com.bfhl.service.impl;

import com.bfhl.dto.BfhlRequest;
import com.bfhl.dto.BfhlResponse;
import com.bfhl.service.BfhlService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService {

    @Override
    public BfhlResponse processData(BfhlRequest request) {

        List<String> oddNumbers = new ArrayList<>();
        List<String> evenNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        int sum = 0;

        StringBuilder allAlphabets = new StringBuilder();

        for (String item : request.getData()) {

            if (item.matches("\\d+")) {

                int num = Integer.parseInt(item);

                sum += num;

                if (num % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }

            } else if (item.matches("[a-zA-Z]+")) {
                alphabets.add(item.toUpperCase());
                allAlphabets.append(item);
            } else {
                specialCharacters.add(item);
            }
        }
        String concatString = buildAlternatingCaps(
                allAlphabets.reverse().toString()
        );

        return BfhlResponse.builder()
                .is_success(true)
                .user_id("paridhi_gupta_18122006")
                .email("paridhigupta230946@acropolis.in")
                .roll_number("0827CS231176")
                .odd_numbers(oddNumbers)
                .even_numbers(evenNumbers)
                .alphabets(alphabets)
                .special_characters(specialCharacters)
                .sum(String.valueOf(sum))
                .concat_string(concatString)
                .build();
    }

    private String buildAlternatingCaps(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (i % 2 == 0) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }

        return result.toString();
    }
}