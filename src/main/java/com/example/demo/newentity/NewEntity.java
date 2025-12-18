package com.example.demo.newentity;
import jakarta.persistence.*;
import jakarta.validation. constraints.*;
@Entity
@Table(name="student")
public class NewEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Should not contain spaces")
    @Colounm(unique=true)
    private String name;
    @NotBlank(message="no blank spaces")
    @Email(message="invalid")
    private String email;
    public NewEntity(Long id, @NotBlank(message = "Should not contain spaces") String name,
            @NotBlank(message = "no blank spaces") @Email(message = "invalid") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public NewEntity() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
 package com.example.demo.newentity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "student")
public class NewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Should not contain spaces")
    @Column(unique = true)
    private String name;

    @NotBlank(message = "no blank spaces")
    @Email(message = "invalid")
    private String email;

    public NewEntity() {
    }

    public NewEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
   public void setEmail(String email) {
        this.email = email;
    }
}