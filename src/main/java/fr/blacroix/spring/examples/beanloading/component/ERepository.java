package fr.blacroix.spring.examples.beanloading.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository("repository")
public class ERepository {

    public ERepository() {
        log.info("Instantiating component: {}", this.getClass().getSimpleName());
    }
}
