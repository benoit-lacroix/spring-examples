package fr.blacroix.spring.examples.beanloading.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("service")
public class DService {

    /*
     * ERepository repository
     */
    public DService() {
        log.info("Instantiating component: {}", this.getClass().getSimpleName());
    }
}
