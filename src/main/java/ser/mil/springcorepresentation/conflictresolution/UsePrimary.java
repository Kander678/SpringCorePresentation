package ser.mil.springcorepresentation.conflictresolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ser.mil.springcorepresentation.MyRepository;

@Component
public class UsePrimary {
    @Autowired
    private MyRepository myRepository;

    public MyRepository getMyRepository() {
        return myRepository;
    }
}
