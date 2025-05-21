package ser.mil.springcorepresentation.conflictresolution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ser.mil.springcorepresentation.MyRepository;

@Configuration
public class BeanResolver {
    @Bean
    @Primary
    public MyRepository primaryComponent(){
        return new MyRepository();
    }

    @Bean(name="specialRepository")
    public MyRepository qualifierComponent(){
        return new MyRepository();
    }
}
