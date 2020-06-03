package com.sylpi.almighty_java.repository;

import com.sylpi.almighty_java.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
