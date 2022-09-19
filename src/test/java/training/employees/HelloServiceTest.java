package training.employees;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class HelloServiceTest {

    @Mock
    TimeMachine timeMachine;

    @InjectMocks
    HelloService  service;


    @Test
    void testSayHello(){
        // test double előkészítése, azaz mock létrehozása
       // var timeMachine= Mockito.mock(TimeMachine.class);
        when(timeMachine.now()).thenReturn(LocalDateTime.parse("2022-01-01T10:00:00"));
        //var service = new HelloService(timeMachine);
        var message = service.sayHello();
        assertEquals("Hello from Service! 2022-01-01T10:00",message);
    }
}
