package uz.ages.task.web_rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.ages.task.entity.Detail;
import uz.ages.task.service.DetailService;

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
}
