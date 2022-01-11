package uz.almirab.marketuz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "uz.almirab.marketuz.*")

public class MarketUzApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketUzApplication.class, args);
    }

}
