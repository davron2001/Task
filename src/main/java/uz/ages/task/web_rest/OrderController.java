package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ages.task.entity.Customer;
import uz.ages.task.entity.Order;
import uz.ages.task.service.OrderService;

@RestController
@RequestMapping("/get")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public ResponseEntity create(@RequestBody Order order) {
        Order order1 = orderService.save(order);
        return ResponseEntity.ok(order1);
    }
}
