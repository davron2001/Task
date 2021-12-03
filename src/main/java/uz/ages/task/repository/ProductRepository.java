package uz.ages.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ages.task.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
