package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ages.task.entity.Order;
import uz.ages.task.entity.Payment;
import uz.ages.task.service.PaymentService;

@RestController
@RequestMapping("/get")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity create(@RequestBody Payment payment) {
        Payment payment1 = paymentService.save(payment);
        return ResponseEntity.ok(payment1);
    }
}
