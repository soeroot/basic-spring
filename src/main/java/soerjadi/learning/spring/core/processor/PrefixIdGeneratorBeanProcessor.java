package soerjadi.learning.spring.core.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import soerjadi.learning.spring.core.aware.IdAware;

@Slf4j
@Component
public class PrefixIdGeneratorBeanProcessor implements BeanPostProcessor, Ordered {

  @Override
  public int getOrder() {
    return 2;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    log.info("Prefix id generator processor for Bean {}", beanName);
    if (bean instanceof IdAware){
      log.info("Set prefix id generator for Bean {}", beanName);
      IdAware idAware = (IdAware) bean;
      idAware.setId("SOER-" + idAware.getId());
    }

    return bean;
  }
}
