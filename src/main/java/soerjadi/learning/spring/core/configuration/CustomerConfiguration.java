package soerjadi.learning.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import soerjadi.learning.spring.core.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {

  @Primary
  @Bean
  public CustomerRepository normalCustomerRepository(){
    return new CustomerRepository();
  }

  @Bean
  public CustomerRepository premiumCustomerRepository(){
    return new CustomerRepository();
  }
}
