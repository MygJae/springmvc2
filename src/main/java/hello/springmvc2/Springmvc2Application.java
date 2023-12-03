package hello.springmvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springmvc2Application /*implements WebMvcConfigurer*/ {

	public static void main(String[] args) {
		SpringApplication.run(Springmvc2Application.class, args);
	}

	/*
        @Bean
        public MessageSource messageSource() {
            ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
            messageSource.setBasenames("messages", "errors");
            messageSource.setDefaultEncoding("utf-8");
            return messageSource;
        }
    */
	/*
	@Override
	public Validator getValidator() {
		return new ItemValidator();
	}
	 */
}
