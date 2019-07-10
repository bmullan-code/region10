package com.pivotal.barry.region10;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Region("Region10")
public class Region10 { 
	
	@Id @NonNull @Getter
	private CompoundKey key;

	public void setKey(CompoundKey key) {
		this.key = key;
		this.facilityId = (key.getFacilityId());
		this.appOption = (key.getAppOption());
	}

	@Getter @Setter
	private String value;
	@Getter @Setter
	private String facilityId;
	@Getter @Setter
	private String appOption;

	public Region10() {
	}
	
	public Region10(CompoundKey key, String value) {
		super();
		this.key=(key);
		this.value=(value);
		this.appOption=key.getAppOption();
		this.facilityId=key.getFacilityId();
	}
}
