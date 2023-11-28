package com.example.demoFirst.service.impl;

import com.example.demoFirst.model.Address;
import com.example.demoFirst.repository.AddressRepository;
import com.example.demoFirst.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AddressService implements IGenericService<Address, Long> {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> findall() {
        return addressRepository.findAll();
    }

    @Override
    public Optional<Address> findById(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public Address save(Address entity) {
        return addressRepository.save(entity);
    }

    @Override
    public void deleteById(Long id) {
        addressRepository.deleteById(id);
    }
}
