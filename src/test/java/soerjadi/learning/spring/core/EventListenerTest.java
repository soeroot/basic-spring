package soerjadi.learning.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soerjadi.learning.spring.core.listener.LoginAgainSuccessListener;
import soerjadi.learning.spring.core.listener.LoginSuccessListener;
import soerjadi.learning.spring.core.listener.UserListener;
import soerjadi.learning.spring.core.service.UserService;

public class EventListenerTest {

  @Configuration
  @Import({
          UserService.class,
          LoginSuccessListener.class,
          LoginAgainSuccessListener.class,
          UserListener.class
  })
  public static class TestConfiguration{

  }

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setup(){
    applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testEvent(){
    UserService user = applicationContext.getBean(UserService.class);
    user.login("soerjadi", "soerjadi");
    user.login("soerjadi", "");
    user.login("", "soerjadi");
  }
}
