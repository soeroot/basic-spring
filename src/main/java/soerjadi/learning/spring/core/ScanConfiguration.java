package soerjadi.learning.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "soerjadi.learning.spring.core.configuration"
})
public class ScanConfiguration {
}
