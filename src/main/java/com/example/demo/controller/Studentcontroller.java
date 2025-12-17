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
import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController   
public class Studentcontroller {
    @Autowired
    Studentservise src;
    @PostMapping("/post")
    public Studententity postData(@RequestBody Studententity st){
        return src.savedata(st);
    }
    @GetMapping("/get")
    public List<Studententity> getdata(){
       return src.retdata();
     }
    @GetMapping("/getid{id}")
     public Studententity getIDVal(@PathVariable int id){
        return src.id(id);

    }
    @PutMapping("/update/{id}")
    public Studententity update(@PathVariable int id,@RequestBody Studententity st){
        return src.update(id,st);
    }
    @DeleteMapping("/deleted/{id}")
    public Studententity deleteid(@PathVariable int id,@RequestBody Studententity st){
        return src.deletes(id,st);
}

}