package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ages.task.entity.Customer;
import uz.ages.task.service.CustomerService;

@RestController
@RequestMapping("/get")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customers")
    public ResponseEntity create(@RequestBody Customer customer) {
        Customer customer1 = customerService.save(customer);
        return ResponseEntity.ok(customer1);
    }
}
