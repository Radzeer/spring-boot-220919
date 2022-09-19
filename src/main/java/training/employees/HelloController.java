package training.employees;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
@AllArgsConstructor
public class HelloController {


    private HelloService helloService;

    //Constructor injection
   /* public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }*/

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody // a visszatérési értéket írja a http válaszba.
    public String sayHello(){
        return helloService.sayHello();
    }
}
