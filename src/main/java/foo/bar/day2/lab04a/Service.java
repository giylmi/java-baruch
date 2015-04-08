package foo.bar.day2.lab04a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by giylmi on 08.04.2015.
 */
@Component
public class Service {

    @Autowired
    @Derby
    private Dao dao;

    public void workDao(){
        dao.work();
    }

}
