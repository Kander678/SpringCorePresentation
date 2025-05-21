package ser.mil.springcorepresentation.scope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public void printHashCode(){
        System.out.println("Singleton bean "+this.hashCode());
    }
}
