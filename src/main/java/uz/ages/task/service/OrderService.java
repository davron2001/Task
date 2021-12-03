package uz.ages.task.service;

import org.springframework.stereotype.Service;
import uz.ages.task.entity.Customer;
import uz.ages.task.entity.Order;
import uz.ages.task.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
