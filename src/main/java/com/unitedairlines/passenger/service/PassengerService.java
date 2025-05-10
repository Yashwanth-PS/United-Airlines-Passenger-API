package com.unitedairlines.passenger.service;

import com.unitedairlines.passenger.entity.Passenger;
import com.unitedairlines.passenger.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository repository;

    public Passenger save(Passenger passenger) {
        return repository.save(passenger);
    }

    public List<Passenger> findAll() {
        return repository.findAll();
    }

    public Passenger findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Passenger update(Long id, Passenger updated) {
        updated.setId(id);
        return repository.save(updated);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
