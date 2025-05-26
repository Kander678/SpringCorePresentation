package ser.mil.springcorepresentation.beancreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ser.mil.springcorepresentation.MyComponent;
import ser.mil.springcorepresentation.MyRepository;
import ser.mil.springcorepresentation.MyService;

@Configuration
public class BeanCreator {
    private MyComponent myComponent;
    private MyRepository myRepository;

    private MyService myService;

    @Bean(name="myComponentBean")
    public MyComponent myComponent(){
        return new MyComponent();
    }
    @Bean
    public MyRepository myRepository2(){
        return new MyRepository();
    }
    @Bean
    public MyService myService(){
        return new MyService();
    }
}
