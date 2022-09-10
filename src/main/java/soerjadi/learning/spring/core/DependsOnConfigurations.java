package soerjadi.learning.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import soerjadi.learning.spring.core.data.Bar;
import soerjadi.learning.spring.core.data.Foo;

@Slf4j
@Configuration
public class DependsOnConfigurations {

  @Lazy
  @DependsOn({"bar"})
  @Bean
  public Foo foo(){
    log.info("Creating new foo");
    return new Foo();
  }

  @Bean
  public Bar bar(){
    log.info("Creating new bar");
    return new Bar();
  }
}
