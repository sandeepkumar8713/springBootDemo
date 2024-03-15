package com.example.springBootDemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.mock;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ValidatorTest {
    private static final Logger logger = LoggerFactory.getLogger(ValidatorTest.class);

    @MockBean
    Validator validator;

    @Test
    public void testMock(){

        Mockito.when(validator.checking("jh")).thenReturn("Mocking method");

        String result = validator.checking("jh");

        logger.info("Result : " + result);
        assert result.equals("Mocking method");

    }
}
