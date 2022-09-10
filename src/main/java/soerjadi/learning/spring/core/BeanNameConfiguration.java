package soerjadi.learning.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import soerjadi.learning.spring.core.data.Foo;

public class BeanNameConfiguration {
  @Primary
  @Bean(value = "fooFirst")
  public Foo foo1(){
    return new Foo();
  }

  @Bean(value = "fooSecond")
  public Foo foo2(){
    return new Foo();
  }
}
