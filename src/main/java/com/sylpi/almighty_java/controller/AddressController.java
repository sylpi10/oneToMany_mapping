package com.sylpi.almighty_java.controller;

import com.sylpi.almighty_java.entity.Address;
import com.sylpi.almighty_java.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/all")
    public List<Address> addresses(){
        return addressService.allAddresses();
    }

    @GetMapping("/{id}")
    public Optional<Address> oneAddress(@PathVariable Long id){
        return addressService.findOne(id);
    }

    @PostMapping("/{id}")
    public Address addAddress(@RequestBody Address address){
        return addressService.create(address);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        addressService.deleteAddress(id);
        return "deleted address with id " + id;
    }

}
