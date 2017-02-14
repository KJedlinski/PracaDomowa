package com.bootcamp.controller;

import com.bootcamp.DAO.CarDAO;
import com.bootcamp.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by krystian on 14.02.17.
 */

@Controller
public class CarsController {

    @Autowired
    CarDAO carDAO;

    @GetMapping("/cars")
    public String index() {
        return "/car/index";
    }

    @GetMapping("/cars/add")
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("newCar", new Car());
        return "/car/add";

    }

    @PostMapping("/cars/create")
    public String create(@ModelAttribute Car car, ModelMap modelMap) {
        carDAO.save(car);
        return "redirect:/cars/success";
    }

    @GetMapping("/cars/success")
    public String success() {
        return "/car/success";
    }

    @GetMapping("/cars/all")
    public String all(ModelMap modelMap) {
        modelMap.addAttribute("cars", carDAO.getAll());
        return "/car/all";
    }

    @GetMapping("/cars/search")
    public String search(ModelMap modelMap) {
        modelMap.addAttribute("cars", new Car());
        return "/car/search";
    }

    @PostMapping("/cars/results")
    public String results(@ModelAttribute Car car, ModelMap modelMap) {
        String model = car.getModel();
        List<Car> cars = carDAO.findByModel(model);
        modelMap.addAttribute("cars", cars);
        return "/car/all";
    }
}
