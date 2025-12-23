package com.backend;

import com.backend.security.bean.Authority;
import com.backend.security.common.AuthorityNames;
import com.backend.security.service.facade.AuthorityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(AuthorityService service){
        return (args) ->{
            if (service.findByName(AuthorityNames.USER) == null) {
                Authority userAuthority = new Authority();
                userAuthority.setName(AuthorityNames.USER);
                service.save(userAuthority);
            }
            if (service.findByName(AuthorityNames.ADMIN) == null) {
                Authority adminAuthority = new Authority();
                adminAuthority.setName(AuthorityNames.ADMIN);
                service.save(adminAuthority);
            }
        };
    }
}
