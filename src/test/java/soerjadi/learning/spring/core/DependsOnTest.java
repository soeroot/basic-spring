package soerjadi.learning.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soerjadi.learning.spring.core.data.Foo;

public class DependsOnTest {

  private ApplicationContext applicationContext;

  @BeforeEach
  void setup(){
    applicationContext = new AnnotationConfigApplicationContext(DependsOnConfigurations.class);
  }

  @Test
  void testDependsOn(){
    Foo foo = applicationContext.getBean(Foo.class);
  }
}
