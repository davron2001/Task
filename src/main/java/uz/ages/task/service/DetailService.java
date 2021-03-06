package uz.ages.task.service;

import org.springframework.stereotype.Service;
import uz.ages.task.entity.Detail;
import uz.ages.task.repository.DetailRepository;

import java.util.List;

@Service
public class DetailService {
    private final DetailRepository detailRepository;

    public DetailService(DetailRepository detailRepository) {
        this.detailRepository = detailRepository;
    }

    public Detail save(Detail detail) {
        return detailRepository.save(detail);
    }

    public List<Detail> findAll(){
        return detailRepository.findAll();
    }
}
