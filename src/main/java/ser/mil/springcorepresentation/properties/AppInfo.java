package ser.mil.springcorepresentation.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppInfo {
    @Value("${myapp.name}")
    private String name;

    @Value("${myapp.version}")
    private String version;

    public void printInfo() {
        System.out.println("@Value -> Nazwa: " + name + ", Wersja: " + version);
    }
}
