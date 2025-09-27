package com.Faiz.Ecom_Proj.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private String brand;
    private String price;
    private int stockQuantity;
    private String category;

    @Temporal(TemporalType.DATE)
    private Date releseDate;

    private boolean productAvailable;
    private String imageName;
    private String imageType;

    @Lob
    private byte[] imageData;


}
