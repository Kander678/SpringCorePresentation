package ser.mil.springcorepresentation.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements InitializingBean , DisposableBean {

    public MyBean() {
        System.out.println("Constructor bean created");
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct bean created");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean afterPropertiesSet") ;
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy: Bean ma zostać zniszczony");
    }

    @Override
    public void destroy() {
        System.out.println("DisposableBean: destroy()");
    }

}
