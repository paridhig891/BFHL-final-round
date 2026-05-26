package com.bfhl;

import com.bfhl.dto.BfhlRequest;
import com.bfhl.dto.BfhlResponse;
import com.bfhl.service.impl.BfhlServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BfhlServiceTest {

    @Test
    void testProcessData() {

        BfhlServiceImpl service = new BfhlServiceImpl();

        BfhlRequest request = new BfhlRequest();

        request.setData(Arrays.asList("a", "1", "334", "4", "R", "$"));

        BfhlResponse response = service.processData(request);

        Assertions.assertEquals("339", response.getSum());

        Assertions.assertEquals(true, response.is_success());
    }
}