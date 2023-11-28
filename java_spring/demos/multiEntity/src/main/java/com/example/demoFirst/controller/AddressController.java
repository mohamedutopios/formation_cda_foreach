package com.example.demoFirst.controller;

import com.example.demoFirst.model.Address;
import com.example.demoFirst.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private IGenericService<Address, Long> addressService;


    @GetMapping
    public List<Address> getAllAdresses(){
       return addressService.findall();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> getAdressById(@PathVariable Long id){
        return addressService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build());
    }



    @PostMapping
    public Address createAdress(@RequestBody Address address){
        return addressService.save(address);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteAdress(@PathVariable Long id){
        return addressService.findById(id)
                .map(address -> {
                    addressService.findById(id);
                    return ResponseEntity.ok().build();
                })
                .orElseGet(()->ResponseEntity.notFound().build());

    }


}
