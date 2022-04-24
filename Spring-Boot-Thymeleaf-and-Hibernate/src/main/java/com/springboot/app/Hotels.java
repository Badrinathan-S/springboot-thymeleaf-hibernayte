package com.springboot.app;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotels {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hotelId;
	private String HotelName;
	private String[] item;
	private String[] location;
	private Integer avgCost;
	
	@Override
	public String toString() {
		return "Hotels [hotelId=" + hotelId + ", HotelName=" + HotelName + ", item=" + Arrays.toString(item)
				+ ", location=" + Arrays.toString(location) + ", avgCost=" + avgCost + "]";
	}
	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotels(String hotelName, String[] item, String[] location, Integer avgCost) {
		super();
		HotelName = hotelName;
		this.item = item;
		this.location = location;
		this.avgCost = avgCost;
	}
	
	public String gettingItem()
	{
		return Arrays.toString(this.item);
	}
	
	public String gettingLocs()
	{
		return Arrays.toString(this.location);
	}
	
	
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public String[] getItem() {
		return item;
	}
	public void setItem(String[] item) {
		this.item = item;
	}
	public String[] getLocation() {
		return location;
	}
	public void setLocation(String[] location) {
		this.location = location;
	}
	public Integer getAvgCost() {
		return avgCost;
	}
	public void setAvgCost(Integer avgCost) {
		this.avgCost = avgCost;
	}
	
}
