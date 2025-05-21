package ser.mil.springcorepresentation.conflict;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ser.mil.springcorepresentation.MyComponent;
import ser.mil.springcorepresentation.MyRepository;

@Configuration
public class ConflictingConfig {
    @Bean
    public MyRepository myRepository() {
        return new MyRepository();
    }
}
