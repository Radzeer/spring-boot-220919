package training.employees;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HelloControllerTest {

    @Mock
    HelloService service;

    @InjectMocks
    HelloController controller;

    @Test
    void testSayHello(){
        when(service.sayHello()).thenReturn("sample return from service");

        assertEquals("SAMPLE RETURN FROM SERVICE",controller.sayHello());

    }
}
