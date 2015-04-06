package foo.bar.lab07;

import foo.bar.lab05.Subject;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by giylmi on 06.04.2015.
 */
public class BenchmarkPostProcessorTest {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context07.xml");
        context.getBean(Subject.class).longMethod();
    }
}
