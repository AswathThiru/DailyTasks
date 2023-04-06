package com.Cars.Carsbackend.exception;

public class CarNotFoundException extends RuntimeException {
    public CarNotFoundException(Long id) {
        super("Could not found the Car with id " + id);
    }
}
