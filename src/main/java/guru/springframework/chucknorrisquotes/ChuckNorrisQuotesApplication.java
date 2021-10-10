package guru.springframework.chucknorrisquotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * By default, @SpringBoot is going to look for annotated
 * components in this guru package "guru.springframework.chucknorrisquotes"
 * and then anything down beneath that
 */
@SpringBootApplication
public class ChuckNorrisQuotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckNorrisQuotesApplication.class, args);
    }

}
