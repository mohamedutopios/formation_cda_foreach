package com.example.demoFirst.repository;

import com.example.demoFirst.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
