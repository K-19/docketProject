package by.k19.docketproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class DocketProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocketProjectApplication.class, args);
    }

    @Bean
    CommandLineRunner init(PersonRepository repository) {
        return args -> {
            repository.save(Person.builder()
                    .name("Sergei")
                    .surname("Filinovich")
                    .phone("+375290987654")
                    .email("sergeyfilinovich@gmail.com")
                    .birthDay(LocalDateTime.now()).build());
        };
    }
}
