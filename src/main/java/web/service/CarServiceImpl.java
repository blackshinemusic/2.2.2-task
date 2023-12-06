package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Mercedes", "C63_AMG_S", 100));
        cars.add(new Car("Volvo", "S90", 598));
        cars.add(new Car("BMW", "530d", 555));
        cars.add(new Car("Audi", "RS6_AVANT", 332));
        cars.add(new Car("Toyota", "Camry", 104));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(Math.max(count, 0)).toList();
    }
}
