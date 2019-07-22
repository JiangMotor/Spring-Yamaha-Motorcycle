package com.example.jiangyamaha.model.productyamaha;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Productyamaha{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String yamaha_id;
    private String product_yamaha;
}