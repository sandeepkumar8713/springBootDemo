package com.example.springBootDemo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ValidatorTest {
    private static final Logger logger = LoggerFactory.getLogger(ValidatorTest.class);

    @Test
    public void testMock(){
        Validator obj = new Validator();
        String result = obj.checking("jh");

        logger.info("Result : " + result);
        assert result.equals("Main method");

    }
}
