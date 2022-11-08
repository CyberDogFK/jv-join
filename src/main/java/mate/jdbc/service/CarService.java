package mate.jdbc.service;

import mate.jdbc.model.Car;
import mate.jdbc.model.Driver;

import java.util.List;
import java.util.Optional;

public interface CarService {
    Car create(Car car);

    Optional<Car> get(Long id);

    List<Car> getAll();

    Car update(Car car);

    boolean delete(Long id);

    void addDriverFromCar(Driver driver, Car car);

    void removeDriverFromCar(Driver driver, Car car);

    List<Car> getAllByDriver(Long driverId);
}