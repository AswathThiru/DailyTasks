package com.Cars.Carsbackend.repository;


import com.Cars.Carsbackend.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
