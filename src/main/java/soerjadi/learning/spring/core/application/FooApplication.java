package soerjadi.learning.spring.core.application;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import soerjadi.learning.spring.core.data.Bar;
import soerjadi.learning.spring.core.data.Foo;
import soerjadi.learning.spring.core.listener.AppStartingListener;

import javax.swing.*;
import java.util.List;

@SpringBootApplication
public class FooApplication {

//  public static void main(String[] args) {
//    ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//
//    Foo foo = applicationContext.getBean(Foo.class);
//    System.out.println(foo);
//  }

  public static void main(String[] args) {
    SpringApplication application = new SpringApplication(FooApplication.class);
//    application.setBannerMode(Banner.Mode.OFF);
//    application.setListeners(List.of(
//            new AppStartingListener()
//    ));

    ConfigurableApplicationContext applicationContext = application.run(args);

    Foo foo = applicationContext.getBean(Foo.class);
    System.out.println(foo);
  }

  @Bean
  public Foo foo(Bar bar){
    return new Foo();
  }

  @Bean
  public Bar bar(){
    return new Bar();
  }
}
