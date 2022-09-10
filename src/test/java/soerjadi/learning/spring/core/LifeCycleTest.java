package soerjadi.learning.spring.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soerjadi.learning.spring.core.data.Connection;
import soerjadi.learning.spring.core.data.Server;

public class LifeCycleTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setup(){
    applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    applicationContext.registerShutdownHook(); // otomatis applicationContext nya di shutdown
  }

  @AfterEach
  void tearDown(){
//    applicationContext.close();
  }

  @Test
  void testConnection(){
    Connection connection = applicationContext.getBean(Connection.class);
  }

  @Test
  void testServer(){
    Server server = applicationContext.getBean(Server.class);
  }
}
