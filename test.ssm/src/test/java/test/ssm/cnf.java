package test.ssm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import model.Type;

@Component
@Scope("singleton")
@Lazy(true)
public class cnf {
	 @Bean
	    public Type transferService() {
	        return new Type(2,"333333");
	    }
}
