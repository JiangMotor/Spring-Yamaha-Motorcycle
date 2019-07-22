package com.example.jiangyamaha.model.yamaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class YamahaService { 
    @Autowired 
    YamahaRest yamaha;

    public Iterable<Yamaha> findAll(){
        return yamaha.findAll();
    }

    public boolean addYamaha(Yamaha from){
        try{
            Yamaha y = new Yamaha();
            y.setImg_yamaha(from.getImg_yamaha());
            y.setName_yamaha(from.getName_yamaha());
            y.setVideo_yamaha(from.getVideo_yamaha());
            y.setCategory(from.getCategory());

            System.out.println(y);
            yamaha.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updateYamaha(Yamaha from){
        try{
           var y = yamaha.findById(from.getId()).get();
           y.setImg_yamaha(from.getImg_yamaha());
            y.setName_yamaha(from.getName_yamaha());
            y.setVideo_yamaha(from.getVideo_yamaha());
            y.setCategory(from.getCategory());
   
            yamaha.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delYamaha(int id){
           try{
            yamaha.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}