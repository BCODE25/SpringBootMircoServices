package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;


@Component
public class SpecimenServiceStub implements ISpecimenService {

	@Override
	public SpecimenDTO fetchById (int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);	
		specimenDTO.setLatitude("84.51");
		specimenDTO.setLongitude("18.19");
		specimenDTO.setDescription("The location of Cincinnati");
		return specimenDTO;
	}
	
	@Override
	public void save(SpecimenDTO specimentDTO) {
		
	}
	
}
