package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ages.task.entity.Invoice;
import uz.ages.task.service.InvoiceService;


@RestController
@RequestMapping("/get")
public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("/invoice")
    public ResponseEntity create(@RequestBody Invoice invoice) {
        Invoice invoice1 = invoiceService.save(invoice);
        return ResponseEntity.ok(invoice1);
    }
}
