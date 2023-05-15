package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String printWelcome(ModelMap model,
							   @RequestParam(value = "count", required = false) Integer count) {

		List<Car> carList = new ArrayList<>();
		carList.add(new Car("UAZ", "469", 1970));
		carList.add(new Car("Opel", "Zafira", 2013));
		carList.add(new Car("Pagani", "Zonda", 2023));
		carList.add(new Car("Ford", "Mustang", 1964));
		carList.add(new Car("Honda", "Super Cub", 1958));


		List<String> messages = new ArrayList();
		messages.add("Total amount of cars = " + carList.size());

		if (count == null || count > carList.size()) {
			count = carList.size();
		}

		messages.add("Showing " + count + " of total amount");

		for (int i = 0; i < count; i++) {
			messages.add(String.valueOf(carList.get(i)));
		}

		model.addAttribute("cars", messages);
		return "cars";
	}

}