package soerjadi.learning.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soerjadi.learning.spring.core.data.Foo;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    // constructor for FOO class
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Create new foo");
        return foo;
    }
}
