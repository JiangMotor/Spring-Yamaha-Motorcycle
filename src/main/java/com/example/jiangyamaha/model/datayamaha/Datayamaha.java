package com.example.jiangyamaha.model.datayamaha;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Datayamaha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String yamaha_id;
    private String data_yamaha;
    private String detail;
    private String image;
    


}