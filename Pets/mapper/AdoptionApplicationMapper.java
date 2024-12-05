package com.test.pet.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.pet.model.AdoptionApplication;

@Mapper
public interface AdoptionApplicationMapper {
	
	 void insertAdoptionApplication(AdoptionApplication adoptionApplication);

	    List<AdoptionApplication> getAllAdoptionApplications();

}
