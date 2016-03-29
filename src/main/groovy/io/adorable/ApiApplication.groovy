package io.adorable

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.i18n.CookieLocaleResolver

//make sure spring boot doesn't attempt 2.1 config
@SpringBootApplication(exclude=[org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration.class])
class ApiApplication {

	@Autowired
	private DynamicRestTemplate dinamycRestTemplate;

    @Bean
    public RestTemplate restTemplate() {
    	return dinamycRestTemplate.restTemplate();
    }

	static void main(String[] args) {
		SpringApplication.run ApiApplication, args
	}
}
