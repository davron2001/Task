package uz.ages.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.ages.task.entity.Detail;
import uz.ages.task.entity.Payment;

import java.util.List;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Integer> {
    List<Detail> findAllByProduct_Id(Integer productId);
}
