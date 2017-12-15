package edu.cnm.deepdive.springdatarestpeople;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

/**
 * Class with the application method that invokes the Spring REST
 */
@SpringBootApplication
public class SpringDataRestPeopleApplication {

  /**
   * @param args String of arguments for the main method of the Spring Boot
   */
  public static void main(String[] args) {
//    ConfigurableApplicationContext context =
    SpringApplication.run(SpringDataRestPeopleApplication.class, args);
//    RepositoryRestConfiguration config = context.getBean(RepositoryRestConfiguration.class);
//    config.setReturnBodyOnCreate(true);
//    config.setReturnBodyOnUpdate(true);
  }

}
