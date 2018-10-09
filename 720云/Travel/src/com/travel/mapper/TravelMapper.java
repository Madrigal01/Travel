package com.travel.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.travel.pojo.Travel;

public interface TravelMapper {
	@Select("select * from travel_local where name=#{name}")
	public Travel queryTravel(String name);
	public List<Travel> queryByLike(String name);
}
