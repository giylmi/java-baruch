package foo.bar.lab07;

import foo.bar.lab08.Transaction;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by giylmi on 06.04.2015.
 */
public class BenchmarkBeanPostProcessor implements BeanPostProcessor {

    private Map<String, Class> initialClassesToPostProcess = new HashMap<String, Class>();

    @Override
    public Object postProcessBeforeInitialization(final Object o, String s) throws BeansException {
        initialClassesToPostProcess.put(s, o.getClass());
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        final Class clazz = initialClassesToPostProcess.get(s);
        return Proxy.newProxyInstance(o.getClass().getClassLoader(),
                o.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (clazz.getMethod(method.getName(), method.getParameterTypes()).getAnnotation(Benchmark.class) != null) {
                            long start = System.currentTimeMillis();
                            Object returnValue = method.invoke(o, args);
                            System.out.println("Time: " + (System.currentTimeMillis() - start) + " elapsed");
                            return returnValue;
                        } else return method.invoke(o, args);
                    }
                });
    }
}
