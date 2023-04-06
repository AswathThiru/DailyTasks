package com.Cars.Carsbackend.controller;


import com.Cars.Carsbackend.exception.CarNotFoundException;
import com.Cars.Carsbackend.model.Car;
import com.Cars.Carsbackend.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @PostMapping("/car")
    Car newCar(@RequestBody Car newCar) {
        return carRepository.save(newCar);
    }
    @GetMapping("/cars")
    List<Car> getAllCars() {
        return carRepository.findAll();
    }
//@GetMapping("/emailSenders")
//public List<Car> getAllEmailSenders() {
//    return carRepository.findAll();
//}
    @GetMapping("/car/{id}")
    Car getCarById(@PathVariable Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));
    }
    @PutMapping("/car/{id}")
    Car updateCar(@RequestBody Car newCar, @PathVariable Long id) {
        return carRepository.findById(id)
                .map(car -> {
                    car.setBrand(newCar.getBrand());
                    car.setModel(newCar.getModel());
                    car.setColor(newCar.getColor());
                    car.setEngineNum(newCar.getEngineNum());
                    car.setStatus(newCar.getStatus());
                    car.setBp(newCar.getBp());
                    car.setSp(newCar.getSp());
                    return carRepository.save(car);
                }).orElseThrow(() -> new CarNotFoundException(id));
    }
    @DeleteMapping("/car/{id}")
    String deleteCar(@PathVariable Long id){
        if(!carRepository.existsById(id)){
            throw new CarNotFoundException(id);
        }
        carRepository.deleteById(id);
        return  "Car with id "+id+" has been deleted success.";
    }
}
