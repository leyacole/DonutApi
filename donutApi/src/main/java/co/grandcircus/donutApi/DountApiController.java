package co.grandcircus.donutApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.donutApi.entity.Donuts;
import co.grandcircus.donutApi.service.ApiService;
import co.grandcircus.donutApi.service.DonutResponse;

@Controller
public class DountApiController {
	
	@Autowired
	private ApiService apiService;
	
//	@RequestMapping("/")
//	public ModelAndView home() {
//		ModelAndView mv = new ModelAndView("index");
//		DonutResponse donuts = apiService.getDonutList();
//		mv.addObject("list", donuts);
//		return mv;
//	}
	
	@RequestMapping("/")
	public ModelAndView home() {
		DonutResponse response = apiService.getDonutList();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("donuts", response.getResults());
		mv.addObject("count", response.getCount());
		return mv;
	}
	

	
	@RequestMapping("/donuts")
	public ModelAndView details(@RequestParam("id") Long id) {
		ModelAndView mv = new ModelAndView("donuts");
		mv.addObject("donuts", apiService.getById(id));
		return mv;
	}
	
	

}
