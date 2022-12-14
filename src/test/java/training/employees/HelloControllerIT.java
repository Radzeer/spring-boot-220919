package training.employees;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
public class HelloControllerIT {

    @Autowired
    HelloController helloController;

    @MockBean
    TimeMachine timeMachine;

    @Test
    void testSayHello(){
        when(timeMachine.now()).thenReturn(LocalDateTime.parse("2022-01-01T10:00:00"));
        var message= helloController.sayHello();
        assertTrue(message.startsWith("HELLO FROM SERVICE! 2022-01-01T10:00"),"Does not starts with the given message");

    }
}
