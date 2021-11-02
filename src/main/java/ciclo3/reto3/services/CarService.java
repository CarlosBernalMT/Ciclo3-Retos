package ciclo3.reto3.services;

import ciclo3.reto3.entities.Car;
import ciclo3.reto3.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){
         return carRepository.findAll();
    }

    public Car saveCar(Car car){
        return  carRepository.save(car);
    }

    public Car updateCar(Car car){
        Optional<Car> optional = carRepository.findById(car.getId());
        if(optional.isEmpty()){
            return new Car(00000,"No existe", "No existe", 00000, "No existe");
        }
        return carRepository.save(car);
    }

    public boolean deleteCar(Car car){
        Optional<Car> optional = carRepository.findById(car.getId());
        if(optional.isEmpty()){
            return false;
        }
        carRepository.delete(car);
        return true;
    }
}
