package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private static List<Car> cars = new ArrayList<>();

    public List <Car> getCars(int count){
        cars.add(new Car("Porsche", "Blue", "V8"));
        cars.add(new Car("Mercedes", "Red", "V6"));
        cars.add(new Car("Honda", "Yellow", "V12"));
        cars.add(new Car("Tesla", "Black", "V16"));
        cars.add(new Car("Lada", "Orange", "V8"));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
