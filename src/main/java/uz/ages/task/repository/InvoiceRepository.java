package uz.ages.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ages.task.entity.Invoice;
import uz.ages.task.entity.Order;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
