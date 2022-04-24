package com.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HotelController {
	
	@Autowired
	HotelService hServ;
	
	@RequestMapping(path="/addhotel", method = RequestMethod.GET)
	public String newHotel(Model model) {
		
		Hotels hotel = new Hotels();
		model.addAttribute("hotelObject", hotel);
		return "addHotel";
	}
	
	
	@RequestMapping(path="/send",method=RequestMethod.POST)
	public String addhotel(Model model,Hotels hotel)
	{
		model.addAttribute("info", hServ.posting(hotel).getHotelName()+" has Added successfully");
		return "redirect:/";
	}
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String homePage(Model model)
	{
		model.addAttribute("every", hServ.listing());
		return "Home";
	}
	
	@RequestMapping("/{hotelInfo}")
	public String infoPage(Model model, @PathVariable("hotelInfo") int hotelInfo) {
		
		model.addAttribute("obj", hServ.gettingOneObj(hotelInfo));
		return "info";
	}
	
	@RequestMapping("/edit/{hotelId}")
	public String editHome(Model model, @PathVariable(value = "hotelId") int hotelId) {
		
		Hotels hotel = hServ.gettingOneObj(hotelId);
		
		model.addAttribute("object", hotel);
		
		return "editHotel";
	}
	
	@RequestMapping("/delete/{hotelId}")
	public String deleteHotel(Model model, @PathVariable("hotelId") int hotelId) {
		
		hServ.deleteHotelId(hotelId);
		return "redirect:/";
	}

}
