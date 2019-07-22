package com.example.jiangyamaha.model.paymentyamaha;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Paymentyamaha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String yamaha_id;
    private String payment_yamaha;
}