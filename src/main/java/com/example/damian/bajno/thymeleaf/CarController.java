package com.example.damian.bajno.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars;

    public CarController() {
        Car car = new Car("Volkswagen", "Golf");
        Car car1 = new Car("BMW", "e36");
        Car car2 = new Car("Ferrari", "Pierro");
        Car car3 = new Car("Porshe", "Cayman");
        Car car5 = new Car("Chevrolet", "Roadster");
         cars = new ArrayList<>(List.of(car, car1, car2, car3, car5));
    }

    @GetMapping("/car")
    public String getCar(Model model) {
        model.addAttribute("cars", cars);
        model.addAttribute("newCar", new Car());
        return "car";
    }

    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car) {
        cars.add(car);
        return "redirect:/car";
    }
}
