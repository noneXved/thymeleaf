package com.example.damian.bajno.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    //model bedzie od razu przechowywany w car.html
    @GetMapping("/car")
    public String getCar(Model model) {
        Car car = new Car("golf", "volkswagen");
        //model przechowuje klucz -wartosc
        model.addAttribute("car", car);
        return "car";
    }
}
