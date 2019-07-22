package com.example.jiangyamaha;

import com.example.jiangyamaha.model.datayamaha.Datayamaha;
import com.example.jiangyamaha.model.datayamaha.DatayamahaService;
import com.example.jiangyamaha.model.paymentyamaha.Paymentyamaha;
import com.example.jiangyamaha.model.paymentyamaha.PaymentyamahaService;
import com.example.jiangyamaha.model.productyamaha.Productyamaha;
import com.example.jiangyamaha.model.productyamaha.ProductyamahaService;
import com.example.jiangyamaha.model.promotionyamaha.Promotionyamaha;
import com.example.jiangyamaha.model.promotionyamaha.PromotionyamahaService;
import com.example.jiangyamaha.model.yamaha.Yamaha;
import com.example.jiangyamaha.model.yamaha.YamahaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class JiangYamahaConller {

    //Honda
    @Autowired
    private YamahaService yamaha;

    @GetMapping(value = "/Yamaha")
    public Iterable<Yamaha> promotion() {
        return yamaha.findAll();
    }
    @PostMapping(value="/addYamaha")
    public ResponseEntity<Boolean> addYamaha(@RequestBody Yamaha model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(yamaha.addYamaha(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateYamaha")
    public ResponseEntity<Boolean> updateYamaha(@RequestBody Yamaha model){
        return new ResponseEntity<Boolean>(yamaha.updateYamaha(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delYamaha/{id}")
    public ResponseEntity<Boolean> delYamaha(@PathVariable int id){
        return new ResponseEntity<Boolean>(yamaha.delYamaha(id),HttpStatus.OK);
    } 
    
    @Autowired
    private ProductyamahaService productyamaha;

    @GetMapping(value = "/Productyamaha")
    public Iterable<Productyamaha> productyamaha() {
        return productyamaha.findAll();
    }
    @PostMapping(value="/addProductyamaha")
    public ResponseEntity<Boolean> addProductyamaha(@RequestBody Productyamaha model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(productyamaha.addProductyamaha(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateProductyamaha")
    public ResponseEntity<Boolean> updateProductyamaha(@RequestBody Productyamaha model){
        return new ResponseEntity<Boolean>(productyamaha.updateProductyamaha(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delProductyamaha/{id}")
    public ResponseEntity<Boolean> delProductyamaha(@PathVariable int id){
        return new ResponseEntity<Boolean>(productyamaha.delProductyamaha(id),HttpStatus.OK);
    } 

    @Autowired
    private PromotionyamahaService promotionyamaha;

    @GetMapping(value = "/Promotionyamaha")
    public Iterable<Promotionyamaha> promotionyamaha() {
        return promotionyamaha.findAll();
    }
    @PostMapping(value="/addPromotionyamaha")
    public ResponseEntity<Boolean> addPromotionyamaha(@RequestBody Promotionyamaha model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(promotionyamaha.addPromotionyamaha(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePromotionyamaha")
    public ResponseEntity<Boolean> updatePromotionyamaha(@RequestBody Promotionyamaha model){
        return new ResponseEntity<Boolean>(promotionyamaha.updatePromotionyamaha(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPromotionyamaha/{id}")
    public ResponseEntity<Boolean> delPromotionyamaha(@PathVariable int id){
        return new ResponseEntity<Boolean>(promotionyamaha.delPromotionyamaha(id),HttpStatus.OK);
    } 

    @Autowired
    private PaymentyamahaService paymentyamaha;

    @GetMapping(value = "/Paymentyamaha")
    public Iterable<Paymentyamaha> paymentyamaha() {
        return paymentyamaha.findAll();
    }
    @PostMapping(value="/addPaymentyamaha")
    public ResponseEntity<Boolean> addPaymentyamaha(@RequestBody Paymentyamaha model){
      System.out.println(model);
        return new ResponseEntity<Boolean>(paymentyamaha.addPaymentyamaha(model),HttpStatus.OK);
    }
    @PutMapping(value="/updatePaymentyamaha")
    public ResponseEntity<Boolean> updatePaymentyamaha(@RequestBody Paymentyamaha model){
        return new ResponseEntity<Boolean>(paymentyamaha.updatePaymentyamaha(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delPaymentyamaha/{id}")
    public ResponseEntity<Boolean> delPaymentyamaha(@PathVariable int id){
        return new ResponseEntity<Boolean>(paymentyamaha.delPaymentyamaha(id),HttpStatus.OK);
    } 

    @Autowired
    private DatayamahaService datayamaha;

    @GetMapping(value = "/Datayamaha")
    public Iterable<Datayamaha> datayamaha() {
        return datayamaha.findAll();
    }
    @PostMapping(value="/addDatayamaha")
    public ResponseEntity<Boolean> addDatayamaha(@RequestBody Datayamaha model){
        // System.out.println(model);
        return new ResponseEntity<Boolean>(datayamaha.addDatayamaha(model),HttpStatus.OK);
    }
    @PutMapping(value="/updateDatayamaha")
    public ResponseEntity<Boolean> updateDatayamaha(@RequestBody Datayamaha model){
        return new ResponseEntity<Boolean>(datayamaha.updateDatayamaha(model),HttpStatus.OK);
    }
    @DeleteMapping(value="/delDatayamahaa/{id}")
    public ResponseEntity<Boolean> delDatayamaha(@PathVariable int id){
        return new ResponseEntity<Boolean>(datayamaha.delDatayamaha(id),HttpStatus.OK);
    } 



}
