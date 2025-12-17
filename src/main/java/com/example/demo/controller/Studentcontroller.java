package com.example.demo.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.StudEntentity;
import com.example.demo.service.StudentService;

@RestController   
public class Studentcontroller {
    @Autowired
    StudentServise src;
    @PostMapping("/post")
    public StudentEntity postData(@RequestBody StudentEntity st){
        return src.savedata(st);
    }
    @GetMapping("/get")
    public List<StudentEntity> getdata(){
       return src.retdata();
     }
    @GetMapping("/getid{id}")
     public StudentEntity getIDVal(@PathVariable int id){
        return src.id(id);

    }
    @PutMapping("/update/{id}")
    public StudentEntity update(@PathVariable int id,@RequestBody StudentEntity st){
        return src.update(id,st);
    }
    @DeleteMapping("/deleted/{id}")
    public StudentEntity deleteid(@PathVariable int id,@RequestBody StudentEntity st){
        return src.deletes(id,st);
}

}