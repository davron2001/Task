package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.ages.task.entity.Detail;
import uz.ages.task.service.DetailService;

import java.util.List;

@RestController
@RequestMapping("/get")
public class DetailController {
    private final DetailService detailService;

    public DetailController(DetailService detailService) {
        this.detailService = detailService;
    }


    @PostMapping("/detail")
    public ResponseEntity create(@RequestBody Detail detail) {
        Detail detail1 = detailService.save(detail);
        return ResponseEntity.ok(detail1);
    }

    @GetMapping("/detailAll")
    public ResponseEntity getAll(){
        List<Detail> detail = detailService.findAll();
        return ResponseEntity.ok(detail);
    }
}
