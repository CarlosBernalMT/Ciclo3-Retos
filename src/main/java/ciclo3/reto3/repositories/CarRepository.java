package ciclo3.reto3.repositories;

import ciclo3.reto3.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
