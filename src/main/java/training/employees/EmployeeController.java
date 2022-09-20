package training.employees;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeesService service;
    @GetMapping
    public List<EmployeeDto> listEmployees(@RequestParam("prefix")Optional<String> prefix){
        return service.findAll(prefix);
    }

    @GetMapping("{id}")
    public EmployeeDetailsDto findEmployeeById(@PathVariable("id") long id){
        return service.findEmployeeById(id);
    }
}
