package com.unitedairlines.passenger.repository;

import com.unitedairlines.passenger.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}