package com.example.demo.newcontroller;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.example.demo.newentity.NewEntity;
import com.example.demo.newservice.Newservice;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/students")
public class NewController {
    @Autowired
    Newservice ser;
    public NewController(Newservice ser){
        this.ser = ser;
    }
    @PostMapping("/save")
    public NewEntity save(@RequestBody NewEntity st){
        return ser.savedata(st);
    }
    @GetMapping("/get{id}")
    public NewEntity getById(@PathVariable Long id){
        return ser.getidval(id);
    }
    @GetMapping("/all")
    public List<NewEntity>getAll(){
        return ser.getall();
    }
    @PutMapping("/update/{id}")
    public NewEntity update(@PathVariable Long id,@RequestBody NewEntity entity){
        return ser.update(id, entity);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        ser.delete(id);
    }
}
