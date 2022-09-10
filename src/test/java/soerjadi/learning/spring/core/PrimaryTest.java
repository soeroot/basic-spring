package soerjadi.learning.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soerjadi.learning.spring.core.data.Foo;

public class PrimaryTest {

  private ApplicationContext applicationContext;

  @BeforeEach
  void setup(){
    applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
  }

  @Test
  void testGetPrimary(){
    Foo foo = applicationContext.getBean(Foo.class);
    Foo foo1 = applicationContext.getBean("foo1", Foo.class);
    Foo foo2 = applicationContext.getBean("foo2", Foo.class);

    Assertions.assertSame(foo, foo1);
    Assertions.assertNotSame(foo, foo2);
  }
}
