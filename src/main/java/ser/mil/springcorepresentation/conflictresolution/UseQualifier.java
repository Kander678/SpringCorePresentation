package ser.mil.springcorepresentation.conflictresolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ser.mil.springcorepresentation.MyRepository;

@Component
public class UseQualifier {
    @Autowired
    @Qualifier("specialRepository")
    private MyRepository myRepository;

    public MyRepository getMyRepository() {
        return myRepository;
    }
}
