package foo.bar.day2.lab04a;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class ServiceTest {

    @Test
    public void testName() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("foo.bar.day2.lab04a");
        context.getBean(Service.class).workDao();

    }
}