package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ages.task.entity.Category;
import uz.ages.task.entity.Customer;
import uz.ages.task.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/get")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customer")
    public ResponseEntity create(@RequestBody Customer customer) {
        Customer customer1 = customerService.save(customer);
        return ResponseEntity.ok(customer1);
    }

    @GetMapping("/customerAll")
    public ResponseEntity getAll() {
        List<Customer> categoryList = customerService.findAll();
        return ResponseEntity.ok(categoryList);
    }
}
