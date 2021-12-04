package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ages.task.entity.Order;
import uz.ages.task.entity.Payment;
import uz.ages.task.service.PaymentService;

import java.util.List;

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

    @GetMapping("/paymentAll")
    public ResponseEntity findAll(){
        List<Payment> payments = paymentService.findAll();
        return ResponseEntity.ok(payments);
    }
}
