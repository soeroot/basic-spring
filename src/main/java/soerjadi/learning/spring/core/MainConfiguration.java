package soerjadi.learning.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soerjadi.learning.spring.core.configuration.BarConfiguration;
import soerjadi.learning.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class,
})
public class MainConfiguration {
}
