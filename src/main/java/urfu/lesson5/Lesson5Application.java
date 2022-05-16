package urfu.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class Lesson5Application {

    public static void main(String[] args) {
        SpringApplication.run(Lesson5Application.class, args);

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(CustomEventPublisher.class);
        CustomEventPublisher eventPublisher = context.getBean(CustomEventPublisher.class);
        eventPublisher.publishCustomEvent("Привет мир!", "Руссикй");

        eventPublisher.publishCustomEvent("Hello world!", "English");
        //eventPublisher.publishCustomEvent("Hallo welt!", "German");
        //eventPublisher.publishCustomEvent("Bonjour le monde!", "French");
    }

}
