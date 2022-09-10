package soerjadi.learning.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soerjadi.learning.spring.core.service.MerchantService;
import soerjadi.learning.spring.core.service.MerchantServiceImpl;

public class InheritanceTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setup(){
    applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testInhertance(){
    MerchantService merchantService = applicationContext.getBean(MerchantService.class);
    MerchantServiceImpl merchantServiceImpl = applicationContext.getBean(MerchantServiceImpl.class);

    Assertions.assertSame(merchantService, merchantServiceImpl);
  }
}
