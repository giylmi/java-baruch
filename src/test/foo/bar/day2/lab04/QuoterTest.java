package foo.bar.day2.lab04;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class QuoterTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("foo.bar.day2.lab04");
        Map<String, Quoter> beansMap = context.getBeansOfType(Quoter.class);
        Assert.assertEquals(beansMap.size(), 2);
        Assert.assertEquals("I'll be back", beansMap.get("terminatorQuoter").sayQuote());
        Robot robot = context.getBean(Robot.class);
        System.out.println(robot.talk());
    }

}