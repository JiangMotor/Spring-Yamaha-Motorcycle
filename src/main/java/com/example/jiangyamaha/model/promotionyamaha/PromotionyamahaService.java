package com.example.jiangyamaha.model.promotionyamaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PromotionyamahaService { 
    @Autowired 
    PromotionyamahaRest promotionyamaha;

    public Iterable<Promotionyamaha> findAll(){
        return promotionyamaha.findAll();
    }

    public boolean addPromotionyamaha(Promotionyamaha from){
        try{
            Promotionyamaha y = new Promotionyamaha();
            y.setYamaha_id(from.getYamaha_id());
            y.setPromotion_yamaha(from.getPromotion_yamaha());
            y.setDetail(from.getDetail());

            System.out.println(y);
            promotionyamaha.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePromotionyamaha(Promotionyamaha from){
        try{
           var y = promotionyamaha.findById(from.getId()).get();
           y.setYamaha_id(from.getYamaha_id());
            y.setPromotion_yamaha(from.getPromotion_yamaha());
            y.setDetail(from.getDetail());
           
            promotionyamaha.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPromotionyamaha(int id){
           try{
            promotionyamaha.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}