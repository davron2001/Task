package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ages.task.entity.Order;
import uz.ages.task.service.OrderService;

import java.util.List;

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

    @GetMapping("/orderAll")
    public ResponseEntity getAll(){
        List<Order> orderList = orderService.findAll();
        return ResponseEntity.ok(orderList);
    }
}
