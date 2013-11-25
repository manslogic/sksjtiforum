package app.event.common.controller;

import app.event.common.model.Fruit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fruit")
public class FruitController {

	@RequestMapping(value="{fruitName}", method = RequestMethod.GET)
	public ModelAndView getFruit(@PathVariable String fruitName, ModelMap model) {

		Fruit fruit = new Fruit(fruitName, 1000);
		model.addAttribute("model", fruit);
		
		return new ModelAndView("list",model);

	}
	
}