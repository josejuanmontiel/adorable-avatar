package io.adorable

import io.adorable.utils.MyResponseErrorHandler
import org.apache.http.impl.client.HttpClientBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestTemplate
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
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
