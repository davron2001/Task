package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ages.task.entity.Invoice;
import uz.ages.task.service.InvoiceService;

import java.util.List;


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

    @GetMapping("/invoiceAll")
    public ResponseEntity getAll(){
        List<Invoice> invoices = invoiceService.findAll();
        return ResponseEntity.ok(invoices);
    }
}
