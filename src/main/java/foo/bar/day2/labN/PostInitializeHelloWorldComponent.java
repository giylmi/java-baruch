package foo.bar.day2.labN;

import org.springframework.stereotype.Component;

/**
 * Created by giylmi on 07.04.2015.
 */
@Component
public class PostInitializeHelloWorldComponent {

    @PostInitialized
    public void sayHello(){
        System.out.println("Hello, World!");
    }
}
