package com.example.demo.newservice.newserviceimpl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.newentity.NewEntity;
import com.example.demo.newservice.NewService;
@Service
public class NewServiceImpl implements NewService{
    private final NewFileRepo rep;
    public NewServiceImpl(NewFileRepo rep){
        this.rep=rep;
    }
    @Override
    public NewEntity savedata(NewEntity st) {
        return rep.save(st);
    }

    @Override
    public NewEntity getidval(Long id) {
        return rep.findById(id);
    }

    @Override
    public List<NewEntity> getall() {
        return rep.fingAll();
    }

    @Override
    public NewEntity update(Long id, NewEntity st) {
        NewfileEntity existing = getidval(id);
        existing.setName(newfile.getName());
        existing.setEmail(newfile.getEmail());
        return rep.save(existing);|
    }

    @Override
    public void delete(Long id){
        rep.deleteById(id);
    }
}