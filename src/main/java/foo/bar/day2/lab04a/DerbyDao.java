package foo.bar.day2.lab04a;

import org.springframework.stereotype.Component;

/**
 * Created by giylmi on 08.04.2015.
 */
@Derby
@Component
public class DerbyDao implements Dao {
    @Override
    public void work() {
        System.out.println("Derby works!");
    }
}
