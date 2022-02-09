package fr.blacroix.spring.examples.beanloading.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("component")
public class AComponent {

    /*
     * DService service, String FBean
     */
    public AComponent() {
        log.info("Instantiating component: {}", this.getClass().getSimpleName());
    }
}
