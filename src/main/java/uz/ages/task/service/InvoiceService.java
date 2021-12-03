package uz.ages.task.service;

import org.springframework.stereotype.Service;
import uz.ages.task.entity.Invoice;
import uz.ages.task.entity.Order;
import uz.ages.task.repository.InvoiceRepository;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
}
