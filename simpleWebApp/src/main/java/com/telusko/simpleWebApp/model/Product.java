package com.telusko.simpleWebApp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor

//@Component
@Entity
public class Product {
    @Id
    int prodId;
    String prodName;
    int price;

}


