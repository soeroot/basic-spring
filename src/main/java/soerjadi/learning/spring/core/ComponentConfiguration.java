package soerjadi.learning.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soerjadi.learning.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "soerjadi.learning.spring.core.configuration",
        "soerjadi.learning.spring.core.repository",
        "soerjadi.learning.spring.core.service"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
