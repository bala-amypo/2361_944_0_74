package com.example.demo.newrepositry;
import org. springframework.data.jpa.repository. JpaRepository;
import com.example.demo.newentity.NewFileEntity;
public interface NewFileRepo extends JpaRepository<NewFileEntity, Long>{

}