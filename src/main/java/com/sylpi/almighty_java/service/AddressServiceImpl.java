package com.sylpi.almighty_java.service;

import com.sylpi.almighty_java.entity.Address;
import com.sylpi.almighty_java.entity.User;
import com.sylpi.almighty_java.repository.AddressRepository;
import com.sylpi.almighty_java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService{

    private AddressRepository addressRepository;
    private UserRepository userRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository, UserRepository userRepository) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<Address> allAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Optional<Address> findOne(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public Address create(Address address) {
        address.setUser(userRepository.findById(address.getUserId()).get());
        addressRepository.save(address);
        return address;
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
