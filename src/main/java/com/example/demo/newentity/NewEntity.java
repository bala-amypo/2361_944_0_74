package com.example.demo.newentity;
import jakarta.validation. constraints.Email;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation. constraints.NotBlank;
public class NewEntity {
    @Id
    @GeneratedValue(strategy="GenerattionType")
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message = "should not contain spaces")
    @Email(message="Invaild format")
    private String email;   
}