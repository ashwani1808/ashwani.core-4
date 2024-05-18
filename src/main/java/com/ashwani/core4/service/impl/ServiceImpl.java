package com.ashwani.core4.service.impl;




import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ashwani.core4.entity.College;
import com.ashwani.core4.service.CollegeService;

@Service
public class ServiceImpl implements CollegeService {

	ArrayList<College> list;
	public ServiceImpl() {
		list=new ArrayList<>();
		list.add(new College(124566678,"BHU"));
		
		
	}
	@Override
	public ArrayList<College> getcollegeDetails() {
		// TODO Auto-generated method stub
		return list;
	}
     
}
