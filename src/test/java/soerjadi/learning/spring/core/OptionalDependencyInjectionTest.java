package soerjadi.learning.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soerjadi.learning.spring.core.configuration.OptionalConfiguration;
import soerjadi.learning.spring.core.data.Foo;
import soerjadi.learning.spring.core.data.FooBar;

public class OptionalDependencyInjectionTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setup(){
    applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testOptDependencyInjection(){
    Foo foo = applicationContext.getBean(Foo.class);
    FooBar fooBar = applicationContext.getBean(FooBar.class);

    Assertions.assertNull(fooBar.getBar());
    Assertions.assertSame(foo, fooBar.getFoo());
  }
}
