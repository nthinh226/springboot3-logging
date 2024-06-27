package vn.mobileid.springbootlog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-log4j2-extensions.properties")
public class SpringbootLog4j2Application {
    private static final Logger logger = LogManager.getLogger(SpringbootLog4j2Application.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringbootLog4j2Application.class, args);
    }

}
