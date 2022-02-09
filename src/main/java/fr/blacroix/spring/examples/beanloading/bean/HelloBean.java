package fr.blacroix.spring.examples.beanloading.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloBean {

    public HelloBean(String value) {
        log.info("Instantiating new {}: Hello {}!", this.getClass().getSimpleName(), value);
    }
}
