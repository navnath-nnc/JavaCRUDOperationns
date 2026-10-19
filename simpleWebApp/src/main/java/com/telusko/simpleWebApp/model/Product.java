package com.telusko.simpleWebApp.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor

//@Component
public class Product {
    int prodId;
    String prodName;
    int price;

}
