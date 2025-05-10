package com.unitedairlines.passenger.controller;

import com.unitedairlines.passenger.entity.Passenger;
import com.unitedairlines.passenger.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passengers")
public class PassengerController {

    @Autowired
    private PassengerService service;

    @PostMapping
    public Passenger create(@RequestBody Passenger passenger) {
        return service.save(passenger);
    }

    @GetMapping
    public List<Passenger> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Passenger> getById(@PathVariable Long id) {
        Passenger p = service.findById(id);
        return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public Passenger update(@PathVariable Long id, @RequestBody Passenger passenger) {
        return service.update(id, passenger);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
