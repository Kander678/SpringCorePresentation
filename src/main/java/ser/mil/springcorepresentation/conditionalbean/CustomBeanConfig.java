package ser.mil.springcorepresentation.conditionalbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CustomBeanConfig {

    @Bean
    @ConditionalOnProperty(name="custom.bean.enabled",havingValue = "true")
    public MyConditionalBean myConditionalBean() {
        return new MyConditionalBean();
    }
}
