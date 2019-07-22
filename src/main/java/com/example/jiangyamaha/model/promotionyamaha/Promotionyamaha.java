package com.example.jiangyamaha.model.promotionyamaha;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Promotionyamaha{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String yamaha_id;
    private String promotion_yamaha;
    private String detail;
}