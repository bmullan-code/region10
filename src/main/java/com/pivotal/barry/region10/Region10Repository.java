package com.pivotal.barry.region10;


import java.util.List;

import org.springframework.data.gemfire.mapping.annotation.Region;
import org.springframework.data.repository.CrudRepository;

@Region("Region10")
public interface Region10Repository extends CrudRepository<Region10, CompoundKey> {

	List<Region10> findByFacilityIdAndAppOption(String facilityId, String appOption);
	
}



