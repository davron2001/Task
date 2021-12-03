package uz.ages.task.service;

import org.springframework.stereotype.Service;
import uz.ages.task.entity.Payment;
import uz.ages.task.repository.PaymentRepository;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
