package com.example.damian.bajno.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model) {
        Car car = new Car("Volkswagen", "Golf");
        Car car1 = new Car("BMW", "e36");
        Car car2 = new Car("Ferrari", "Pierro");
        Car car3 = new Car("Porshe", "Cayman");
        Car car5 = new Car("Chevrolet", "Roadster");

        List<Car> cars = new ArrayList<>(List.of(car, car1, car2, car3, car5));

        model.addAttribute("cars", cars);

        return "car";
    }
}
