package com.travel.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.mapper.TravelMapper;
import com.travel.pojo.Travel;

@Service
public class TravelService {
	@Autowired
	private TravelMapper mapper;
	
	public Travel queryTravel(String name){
		return mapper.queryTravel(name);
	}
	public List<Travel> queryByLike(String name){
		return mapper.queryByLike(name);
		
	}
}
