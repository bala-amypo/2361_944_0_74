package com.example.demo.newservice.newserviceimpl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.newentity.NewEntity;
import com.example.demo.newservice.NewService;
@Service
public class NewServiceImpl implements NewService{
    private final NewFileRepo rep;
    @Override
    public NewEntity savedata(NewEntity st) {
    }

    @Override
    public NewEntity getidval(Long id) {
    }

    @Override
    public List<NewEntity> getall() {
    }

    @Override
    public NewEntity update(Long id, NewEntity st) {
    }

    @Override
    public void delete(Long id){

    }
}