package ie.atu.labexamination;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")

public class EmployeeController {
    private final EmployeeService myService;

    @GetMapping
    public EmployeeController(EmployeeService myService) {
        this.myService = myService;
        //}
        @PostMapping
        public String newEmployee (@Valid @RequestBody Employee employee){
            return "Details added";
        }
        @PutMapping("/{id}")
        public ResponceEntity<Employee> updateEmployee (@PathVariable Integer id @Valid@RequestBody Employee
        updatedEmployee){
            Employee updated = myService.updateEmployee(id, updatedEmployee);
            return updated != null ? ResponceEntity.ok(updated) : ResponceEntity.notFound().build();
        }
        @DeleteMapping("{id}")
        public ResponceEntity<Void> deleteEmployee (@Path Variable Integer id){
            boolean removed = myService.deleteEmployee(id);
            return removed ? RespnceEntity.ko().build : ReponceEntity.notFounf().build();
        }

    }
}
