package ser.mil.springcorepresentation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {
    public void printHashCode(){
        System.out.println("PrototypeBean "+this.hashCode());
    }
}
