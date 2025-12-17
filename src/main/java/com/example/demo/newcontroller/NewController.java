package com.example.demo.newcontroller;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.example.demo.newentity.NewEntity;
import com.example.demo.newservice.NewService;

@RestController
@RequestMapping("/students")
public class NewController {

    NewService ser;

    public NewController(NewService ser){
        this.ser = ser;
    }

    @PostMapping("/save")
    public NewEntity save(@RequestBody NewEntity st{
        return service.savedata(st);
    }

    @GetMapping("/{id}")
    public NewEntity getById(@PathVariable Long id){
        return service.getidval(id);
    }

    @GetMapping("/all")
    public List<NewEntity> getAll() {
        return service.getall();
    }

    @PutMapping("/update/{id}")
    public NewEntity update(@PathVariable Long id,@RequestBody NewEntity entity){
        return service.update(id, entity);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted successfully";
    }
}
