package com.pivotal.barry.region10;

import org.apache.geode.cache.Cache;
import org.apache.geode.cache.CacheFactory;
import org.apache.geode.pdx.ReflectionBasedAutoSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableClusterConfiguration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@SpringBootApplication
@EnableEntityDefinedRegions(basePackageClasses = {Region10.class,CompoundKey.class})
@EnableClusterConfiguration(useHttp = true )
public class Region10Application {

	public static void main(String[] args) {
		SpringApplication.run(Region10Application.class, args);
	}

}
