package soerjadi.learning.spring.core.data;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Server {

  @PostConstruct
  public void start(){
    log.info("Start server");
  }

  @PreDestroy // no need to call in @Bean
  public void stop(){
    log.info("Stop server");
  }
}
