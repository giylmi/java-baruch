package foo.bar.day2.lab01;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;


public class DeprecatedClassesExchangingBeanPostProcessorTest {
    @Test
    public void testName() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("day2/context01.xml");
        OldCope cope = (OldCope) context.getBean("cope");
        cope.speak();
    }
}