package com.example.demo.newservice;

import java.util.List;
import com.example.demo.newentity.NewEntity;

public interface NewService {

    NewEntity savedata(NewEntity newfile);

    NewEntity getidval(Long id);

    List<NewEntity> getall();

    NewEntity update(Long id, NewEntity st);

    void delete(Long id);
}
