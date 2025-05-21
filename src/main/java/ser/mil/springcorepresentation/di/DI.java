package ser.mil.springcorepresentation.di;

import org.springframework.beans.factory.annotation.Autowired;
import ser.mil.springcorepresentation.MyComponent;
import ser.mil.springcorepresentation.MyRepository;
import ser.mil.springcorepresentation.MyService;

public class DI {

    private MyComponent myComponent;
    @Autowired
    private MyRepository myRepository;

    private MyService myService;


    @Autowired
    public DI(MyComponent myComponent) {
        this.myComponent = myComponent;
    }
    @Autowired
    public void setMyService (MyService myService) {
        this.myService = myService;
    }
}
