package foo.bar.lab05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by giylmi on 06.04.2015.
 */
public class SubjectTest {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(Subject.class).longMethod();
    }
}
