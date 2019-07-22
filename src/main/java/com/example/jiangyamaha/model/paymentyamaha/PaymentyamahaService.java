package com.example.jiangyamaha.model.paymentyamaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class PaymentyamahaService { 
    @Autowired 
    PaymentyamahaRest paymentyamaha;

    public Iterable<Paymentyamaha> findAll(){
        return paymentyamaha.findAll();
    }

    public boolean addPaymentyamaha(Paymentyamaha from){
        try{
            Paymentyamaha y = new Paymentyamaha();
            y.setYamaha_id(from.getYamaha_id());
            y.setPayment_yamaha(from.getPayment_yamaha());

            System.out.println(y);
            paymentyamaha.save(y);

            return true;
        }catch(Exception err){
            err.printStackTrace();
            return false;
        }
    }
    public boolean updatePaymentyamaha(Paymentyamaha from){
        try{
           var y = paymentyamaha.findById(from.getId()).get();
           y.setYamaha_id(from.getYamaha_id());
            y.setPayment_yamaha(from.getPayment_yamaha());
   
           paymentyamaha.save(y);
           return true;
       }catch(Exception e){
               e.printStackTrace();
               return false;
           }    
       }
   
       public boolean delPaymentyamaha(int id){
           try{
            paymentyamaha.deleteById(id);
              return true;
          }catch(Exception e){
                  e.printStackTrace();
                  return false;
              }    
          }
}