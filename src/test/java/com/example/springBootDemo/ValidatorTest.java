package com.example.springBootDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.ArgumentMatchers.any;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ValidatorTest {
    private static final Logger logger = LoggerFactory.getLogger(ValidatorTest.class);

    @MockBean
    Validator validator;

    @BeforeEach
    public void setup(){
        Mockito.when(validator.checking(any(String.class))).thenReturn("Mocking method");
    }

    @Test
    public void testMock(){
        String result = validator.checking("sample");

        logger.info("Result : " + result);
        assert result.equals("Mocking method");

    }
}
