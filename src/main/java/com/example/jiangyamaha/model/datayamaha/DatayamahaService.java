package com.example.jiangyamaha.model.datayamaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class DatayamahaService { 
    @Autowired 
    DatayamahaRest datayamaha;

    public Iterable<Datayamaha> findAll(){
        return datayamaha.findAll();
    }

    public boolean addDatayamaha(Datayamaha from){
        try{
            Datayamaha y = new Datayamaha();
            y.setYamaha_id(from.getYamaha_id());
            y.setData_yamaha(from.getData_yamaha());
            y.setImage(from.getImage());
            y.setDetail(from.getDetail());
            

            System.out.println(y);
            datayamaha.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateDatayamaha(Datayamaha from){
        try{
           var y = datayamaha.findById(from.getId()).get();
            y.setYamaha_id(from.getYamaha_id());
            y.setData_yamaha(from.getData_yamaha());
            y.setImage(from.getImage());
            y.setDetail(from.getDetail());

            datayamaha.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delDatayamaha(int id){
           try{
            datayamaha.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}