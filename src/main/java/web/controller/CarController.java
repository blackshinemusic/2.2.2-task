package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
private final CarService carService;
public CarController(CarService carService) {
    this.carService = carService;
}
   @GetMapping(value = "/")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap entity) {
    entity.addAttribute("cars", carService.getCars(count));
    return "cars";
   }

}