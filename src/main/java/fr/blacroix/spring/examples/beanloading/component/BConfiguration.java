package fr.blacroix.spring.examples.beanloading.component;

import fr.blacroix.spring.examples.beanloading.bean.HelloBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration(value = "configuration", proxyBeanMethods = false)
public class BConfiguration {

    public BConfiguration() {
        log.info("Instantiating component: {}", this.getClass().getSimpleName());
    }

    @Bean("CBean")
    public HelloBean helloCBean() {
        return new HelloBean("CBean");
    }

    @Bean("FBean")
    public HelloBean helloFBean() {
        return new HelloBean("FBean");
    }
}
