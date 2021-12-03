package uz.ages.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ages.task.entity.Customer;
import uz.ages.task.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
