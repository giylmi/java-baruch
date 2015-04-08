package foo.bar.day2.lab01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by giylmi on 08.04.2015.
 */
public class DeprecatedClassesExchangingBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        ReallyDeprecated annotation = o.getClass().getAnnotation(ReallyDeprecated.class);
        if (annotation != null){
            try {
                return annotation.newClass().newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
