package org.springframework.samples.petclinic;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // MAKE SURE THIS CLASS NAME MATCHES YOUR MAIN JAVA FILE EXACTLY
        return application.sources(PetClinicApplication.class); 
    }
}
