package com.sylpi.almighty_java.service;

import com.sylpi.almighty_java.entity.Address;
import com.sylpi.almighty_java.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AddressService {

    public List<Address> allAddresses();

    public Optional<Address> findOne(Long id);

    public Address create (Address address);

    public void deleteAddress(Long id);
}
