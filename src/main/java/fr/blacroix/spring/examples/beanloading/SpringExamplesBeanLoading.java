package fr.blacroix.spring.examples.beanloading;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "fr.blacroix.spring.examples.beanloading")
public class SpringExamplesBeanLoading {

	public static void main(String[] args) {
		SpringApplication.run(SpringExamplesBeanLoading.class, args);
	}
}
