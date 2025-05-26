package ser.mil.springcorepresentation;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ser.mil.springcorepresentation.beancreation.BeanCreator;
//import ser.mil.springcorepresentation.conflict.ConflictingConfig;

import ser.mil.springcorepresentation.conflictresolution.BeanResolver;
import ser.mil.springcorepresentation.conflictresolution.UsePrimary;
import ser.mil.springcorepresentation.conflictresolution.UseQualifier;
import ser.mil.springcorepresentation.properties.AppInfo;
import ser.mil.springcorepresentation.properties.AppInfoWithConfigProps;
import ser.mil.springcorepresentation.scope.PrototypeBean;
import ser.mil.springcorepresentation.scope.ScopeTest;
import ser.mil.springcorepresentation.scope.SingletonBean;


@SpringBootApplication
public class SpringCorePresentationApplication implements ApplicationRunner {

    private final AppInfoWithConfigProps appInfoWithConfigProps;

    private final AppInfo appInfo;

    public SpringCorePresentationApplication(AppInfoWithConfigProps appInfoWithConfigProps, AppInfo appInfo) {
        this.appInfoWithConfigProps = appInfoWithConfigProps;
        this.appInfo = appInfo;
    }

    public static void main(String[] args) {
        //Scope
        SpringApplication.run(SpringCorePresentationApplication.class, args);
        ScopeTest scopeTest = new ScopeTest(new SingletonBean(), new SingletonBean(), new PrototypeBean());
        scopeTest.testScope();

        //Bean Name
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanCreator.class);
        MyComponent myComponent = (MyComponent) context.getBean("myComponentBean");
        System.out.println("Downloaded bean" + myComponent.hashCode());

        //Bean Conflict

//        AnnotationConfigApplicationContext context2 =
//                new AnnotationConfigApplicationContext(BeanCreator.class, ConflictingConfig.class);
//
//        MyService service = context2.getBean(MyService.class);
//        System.out.println(service);

        //Resolving Bean Conflict
        AnnotationConfigApplicationContext context3 =
                new AnnotationConfigApplicationContext(BeanResolver.class, UseQualifier.class, UsePrimary.class);
        MyRepository repo1 = context3.getBean(UsePrimary.class).getMyRepository();
        MyRepository repo2 = context3.getBean(UseQualifier.class).getMyRepository();

        System.out.println("Primary: " + repo1.hashCode());
        System.out.println("Qualifier: " + repo2.hashCode());

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        appInfo.printInfo();
        appInfoWithConfigProps.printInfo();
    }
}
