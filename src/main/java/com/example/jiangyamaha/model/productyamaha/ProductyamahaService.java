package com.example.jiangyamaha.model.productyamaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class ProductyamahaService { 
    @Autowired 
    ProductyamahaRest productyamaha;

    public Iterable<Productyamaha> findAll(){
        return productyamaha.findAll();
    }

    public boolean addProductyamaha(Productyamaha from){
        try{
            Productyamaha y = new Productyamaha();
            y.setYamaha_id(from.getYamaha_id());
            y.setProduct_yamaha(from.getProduct_yamaha());

            System.out.println(y);
            productyamaha.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateProductyamaha(Productyamaha from){
        try{
           var y = productyamaha.findById(from.getId()).get();
            y.setYamaha_id(from.getYamaha_id());
            y.setProduct_yamaha(from.getProduct_yamaha());
           
            productyamaha.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delProductyamaha(int id){
           try{
            productyamaha.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}