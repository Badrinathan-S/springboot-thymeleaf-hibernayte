package com.springboot.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HotelService {
	
	@Autowired
	HotelRepository hRepo;
	
	public Hotels posting(Hotels hotel)
	{
		return hRepo.save(hotel);
	}
	
	public List<Hotels> listing()
	{
		return (List<Hotels>) hRepo.findAll();
	}

	public Hotels gettingOneObj(int hotelInfo) {
		// TODO Auto-generated method stub
		return hRepo.findById(hotelInfo).orElse(new Hotels());
	}
	
	public void deleteHotelId(int id) {
		
		hRepo.deleteById(id);
	}
}
