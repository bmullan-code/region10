package com.pivotal.barry.region10;

import org.springframework.data.repository.CrudRepository;

//@Region("Region10")
public interface Region10Repository extends CrudRepository<Region10, CompoundKey> {

	Iterable<Region10> findByFacilityIdAndAppOption(String facilityId, String appOption);
	
//	Region10 findByFacilityIdLike(String facilityId);
//	
//	Region10 findByValueLike(String value);
	
}



