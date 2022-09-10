package soerjadi.learning.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soerjadi.learning.spring.core.data.Foo;

public class BeanNameTest {

  private ApplicationContext applicationContext;

  @BeforeEach
  void setup(){
    applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
  }

  @Test
  void testBeanName(){
    Foo foo = applicationContext.getBean(Foo.class);
    Foo fooFirst = applicationContext.getBean("fooFirst", Foo.class);
    Foo fooSecond = applicationContext.getBean("fooSecond", Foo.class);

    Assertions.assertSame(foo, fooFirst);
    Assertions.assertNotSame(fooFirst, fooSecond);
  }
}
