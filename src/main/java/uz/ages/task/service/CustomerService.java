package uz.ages.task.service;

import org.springframework.stereotype.Service;
import uz.ages.task.entity.Category;
import uz.ages.task.entity.Customer;
import uz.ages.task.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer save(Customer customerEntity) {

        return customerRepository.save(customerEntity);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
