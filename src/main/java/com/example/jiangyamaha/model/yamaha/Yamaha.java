package com.example.jiangyamaha.model.yamaha;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Yamaha{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String img_yamaha;
    private String name_yamaha;
    private String video_yamaha;
    private String category;
    


}