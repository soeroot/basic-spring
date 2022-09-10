package soerjadi.learning.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import soerjadi.learning.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserListener {

  @EventListener(classes = LoginSuccessEvent.class)
  public void onLoginSuccessEvent(LoginSuccessEvent loginSuccessEvent){
    log.info("Success login again using event annotation for user {}", loginSuccessEvent.getUser());
  }
}
