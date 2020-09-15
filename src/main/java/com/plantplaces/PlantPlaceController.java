package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantPlaceController {
	
	/**
	 * @author Administrator
	 *Handle the /start endpoints
	 *test test 123
	 *@return
	 */
	
	@RequestMapping("/start")
	public String Start(){
		
		return "start";
	}
	
	@RequestMapping("/index")
	public String index(){
		
		return "index";
	}
}
