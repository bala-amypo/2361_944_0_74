package com.example.demo.newrepositry;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.newentity.NewEntity;

public interface NewFileRepo extends JpaRepository<NewEntity, Long> {
}
