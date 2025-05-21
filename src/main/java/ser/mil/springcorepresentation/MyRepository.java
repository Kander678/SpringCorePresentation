package ser.mil.springcorepresentation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

//@Repository   Usunięte na potrzebe rozwiązania konfliktu binów
public class MyRepository {
    @Bean(name = "specialRepository")
    public MyRepository specialRepository() {
        return new MyRepository();
    }


}
