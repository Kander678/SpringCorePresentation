package ser.mil.springcorepresentation.conditionalbean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConditionalApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ConditionalApp.class, args);

        if (context.containsBean("myConditionalBean")) {
            System.out.println("Bean został utworzony");
        } else {
            System.out.println("Bean NIE został utworzony");
        }
    }
}
