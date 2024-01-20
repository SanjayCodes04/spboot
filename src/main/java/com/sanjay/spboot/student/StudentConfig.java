package com.sanjay.spboot.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                    Student sanjay = new Student(
                        "Sanjay",
                        "sanjay@gmail.com",
                        LocalDate.of(2004, Month.DECEMBER, 27)
                    );

                    Student ram = new Student(
                        "Ram",
                        "Ram@gmail.com",
                        LocalDate.of(2004, Month.APRIL, 14)
                    );

                    repository.saveAll(List.of(sanjay, ram));
                
        };
    }
    
}
