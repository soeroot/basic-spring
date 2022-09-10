package soerjadi.learning.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soerjadi.learning.spring.core.client.PaymentGatewayClient;

public class FactoryTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setup(){
    applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testFactory(){
    PaymentGatewayClient paymentGatewayClient = applicationContext.getBean("paymentGatewayClient", PaymentGatewayClient.class);

    Assertions.assertNotNull(paymentGatewayClient);
    Assertions.assertSame("https://example.com", paymentGatewayClient.getEndpoint());
    Assertions.assertSame("private", paymentGatewayClient.getPrivateKey());
    Assertions.assertSame("public", paymentGatewayClient.getPublicKey());
  }
}
