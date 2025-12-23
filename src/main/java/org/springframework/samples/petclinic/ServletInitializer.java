package org.springframework.samples.petclinic;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// CHECK SPELLING: Is your main file PetClinicApplication or PetclinicApplication?
		// Use the EXACT name of the file in your folder.
		return application.sources(PetClinicApplication.class);
	}

}
