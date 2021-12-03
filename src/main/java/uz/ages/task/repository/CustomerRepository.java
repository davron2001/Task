package uz.ages.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ages.task.entity.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer> {

}
