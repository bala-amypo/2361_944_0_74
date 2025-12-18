package com.example.demo.newservice.newserviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.newentity.NewEntity;
import com.example.demo.newrepositry.NewFileRepo;
import com.example.demo.newservice.NewService;

@Service
public class NewServiceImpl implements NewService {

    private final NewFileRepo rep;

    public NewServiceImpl(NewFileRepo rep) {
        this.rep = rep;
    }

    @Override
    public NewEntity savedata(NewEntity st) {
        return rep.save(st);
    }

    @Override
    public NewEntity getidval(Long id) {
        return rep.findById(id).orElse(null);
    }

    @Override
    public List<NewEntity> getall() {
        return rep.findAll();
    }

    @Override
    public NewEntity update(Long id, NewEntity st) {
        NewEntity existing = getidval(id);
        if (existing != null) {
            existing.setName(st.getName());
            existing.setEmail(st.getEmail());
            return rep.save(existing);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        rep.deleteById(id);
    }
}
