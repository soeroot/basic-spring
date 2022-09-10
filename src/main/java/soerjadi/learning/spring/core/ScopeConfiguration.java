package soerjadi.learning.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import soerjadi.learning.spring.core.data.Bar;
import soerjadi.learning.spring.core.data.Foo;
import soerjadi.learning.spring.core.scope.DoubletonScope;

@Slf4j
@Configuration
public class ScopeConfiguration {

  @Bean
  @Scope("prototype")
  public Foo foo(){
    log.info("Creating new Foo");
    return new Foo();
  }

  @Bean
  public CustomScopeConfigurer customScopeConfigurer(){
    CustomScopeConfigurer configurer = new CustomScopeConfigurer();
    configurer.addScope("doubleton", new DoubletonScope());
    return configurer;
  }

  @Bean
  @Scope("doubleton")
  public Bar bar() {
    log.info("Create new Bar");
    return new Bar();
  }
}
