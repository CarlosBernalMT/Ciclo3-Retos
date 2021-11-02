package ciclo3.reto3.controllers;

import ciclo3.reto3.entities.Car;
import ciclo3.reto3.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/cars")
public class CarController {

    @Autowired
    public CarService carService;

    @GetMapping()
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @PostMapping()
    public Car saveCar(@RequestBody Car car){
        return carService.saveCar(car);
    }

    @PutMapping
    public Car updateCar(@RequestBody Car car){
        return carService.updateCar(car);
    }

    @DeleteMapping
    public ResponseEntity deleteCar(@RequestBody Car car){
        if(carService.deleteCar(car)){
            return  ResponseEntity.status(HttpStatus.OK).build();
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
