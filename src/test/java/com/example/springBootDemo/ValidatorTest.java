package com.example.springBootDemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.ArgumentMatchers.any;


// @SpringBootTest // This will load the entire application
// Make sure that entire application context is loaded only once during test case.
@SpringBootTest(classes = Validator.class) // This will load only the required classes and will be faster.
@ExtendWith(SpringExtension.class)
//@ActiveProfiles("sandbox") // This will load spring profile for testing i.e. different application.properties
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
