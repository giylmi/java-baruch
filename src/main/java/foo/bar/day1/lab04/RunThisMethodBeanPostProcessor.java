package foo.bar.day1.lab04;

import foo.bar.day1.lab01.RunThisMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by giylmi on 06.04.2015.
 */
public class RunThisMethodBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("before init " + s);
        Method[] methods = o.getClass().getMethods();
        for (Method method: methods){
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation != null) {
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++)
                    try {
                        method.invoke(o);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("after init " + s);
        return o;
    }
}
