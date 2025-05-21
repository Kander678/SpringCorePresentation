package ser.mil.springcorepresentation.scope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class ScopeTest {
    private final SingletonBean singletonBean1;
    private final SingletonBean singletonBean2;

    private final PrototypeBean prototypeBeanProvider;

        public ScopeTest(SingletonBean singletonBean1, SingletonBean singletonBean2, PrototypeBean prototypeBeanProvider) {
        this.singletonBean1 = singletonBean1;
        this.singletonBean2 = singletonBean2;
        this.prototypeBeanProvider = prototypeBeanProvider;
    }
    public void testScope(){
        System.out.println("singletonBean");
        singletonBean1.printHashCode();
        singletonBean2.printHashCode();

        System.out.println("PrototypeBean");
        prototypeBeanProvider.printHashCode();
        prototypeBeanProvider.printHashCode();
    }
}
