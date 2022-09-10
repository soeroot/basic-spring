package soerjadi.learning.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soerjadi.learning.spring.core.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
