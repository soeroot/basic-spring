package soerjadi.learning.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import soerjadi.learning.spring.core.data.Foo;

public class PrimaryConfiguration {
  @Primary
  @Bean
  public Foo foo1(){
    return new Foo();
  }

  @Bean
  public Foo foo2(){
    return new Foo();
  }
}
