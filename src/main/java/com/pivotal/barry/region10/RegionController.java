package com.pivotal.barry.region10;

import java.util.Collection;
import java.util.List;

import org.apache.geode.pdx.JSONFormatter;
import org.apache.geode.pdx.PdxInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegionController {
	
	@Autowired
	public Region10Repository region10s;
	
	@RequestMapping("/createKeys")
	public Iterable<Region10> createKeys() {
		  region10s.save(new Region10(new CompoundKey("Facility10","Option1"),"101"));
		  region10s.save(new Region10(new CompoundKey("Facility10","Option2"),"102"));
		  region10s.save(new Region10(new CompoundKey("Facility10","Option3"),"103"));
		  region10s.save(new Region10(new CompoundKey("Facility20","Option1"),"201"));
		  region10s.save(new Region10(new CompoundKey("Facility20","Option2"),"202"));
		  region10s.save(new Region10(new CompoundKey("Facility20","Option3"),"203"));
		  return region10s.findAll();
	}
	
	@RequestMapping("/findByFacilityAndAppOption/{facility}/{appoption}")
	  public List<Region10> findByFacilityAndAppOption(@PathVariable("facility") String facility,
			  @PathVariable("appoption") String appOption) {
		  
		  List<Region10> objs = region10s.findByFacilityIdAndAppOption(facility, appOption);
//		  System.out.println(objs);
//		  for (Object o : objs) {
//			  System.out.println("Object:"+o);
//			  System.out.println( JSONFormatter.toJSON((PdxInstance) o).toString());
//		  }
		  return objs;
	  }
}
